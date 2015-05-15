package com.doo.md5server.controller;

import com.doo.md5server.domain.MDFIVE;
import com.doo.md5server.domain.User;
import com.doo.md5server.service.MDFIVEService;
import com.doo.md5server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by andydoo on 15-4-27.
 */
@Controller
public class MD5Controller {

    @Autowired
    MDFIVEService mdfiveService;
    @Autowired
    UserService userService;

    @Secured({"ROLE_USER"})
    @RequestMapping(value="/savemd5/{flag}", method = {RequestMethod.POST,RequestMethod.GET })
    public String saveMd5(@PathVariable String flag ,ModelMap model, HttpServletRequest request){
        System.out.println(flag);
        MDFIVE mdfive =new MDFIVE();
        if(flag.equals("text")){
            mdfive.setFLAG(1);
        }
        else mdfive.setFLAG(0);

        mdfive.setDetail(request.getParameter("detail"));
        mdfive.setMd5(request.getParameter("md5"));
        mdfive.setUser(userService.findByUsername(request.getUserPrincipal().getName()));

        try {
            mdfiveService.addMDFIVE(mdfive);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("get post");
        return "redirect:/mymd5";
    }

    /**
     * 根据id删除md5记录
     * @param id
     * @param model
     * @param request
     * @return
     */
    @Secured({"ROLE_USER"})
    @RequestMapping(value="/mymd5/delete/{id}", method = RequestMethod.GET)
    public String deleteMd5(@PathVariable String id ,ModelMap model, HttpServletRequest request){
        System.out.println("id = [" + id + "]");
        try {
            mdfiveService.deleteMDFIVE(Long.parseLong(id));
            System.out.println("id = [" + id + "]");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/mymd5";
    }
    @RequestMapping(value = "/md5check",method = RequestMethod.GET)
    public String checkMD5(ModelMap model, HttpServletRequest request){

//        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
//                .getAuthentication()
//                .getPrincipal();




        if( request.getUserPrincipal()==null)
        System.out.println(       "null");
        else System.out.println(request.getUserPrincipal());
        //if(userDetails!=null) System.out.println("model = [" + model + "], request = [" + request + "]");
        return "md5/md5check";
    }


    @Secured({"ROLE_USER"})
    @RequestMapping(value = "/mymd5",method = RequestMethod.GET)
    public String mymd5(ModelMap model, HttpServletRequest request){
        mymd5PostGet(model, request);
        return "md5/mymd5";
    }
    @Secured({"ROLE_USER"})
    @RequestMapping(value = "/mymd5",method = RequestMethod.POST)
    public String mymd5Post(ModelMap model, HttpServletRequest request){

        mymd5PostGet(model,request); 
        return "md5/mymd5";
    }

    public void mymd5PostGet(ModelMap model, HttpServletRequest request){
        User user = userService.findByUsername(request.getUserPrincipal().getName());


        List<MDFIVE> mdfiveList= null;
        try {
            mdfiveList = mdfiveService.findByUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(MDFIVE mdfive:mdfiveList){
            System.out.println(mdfive.getDetail());
        }
        model.put("md5list",mdfiveList);
    }
}
