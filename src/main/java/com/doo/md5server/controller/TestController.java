package com.doo.md5server.controller;

import com.doo.md5server.domain.User;
import com.doo.md5server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * Created by lizhaoxin on 2/4/15.
 */

@Controller
public class TestController {
    @Autowired
    private UserService userService;

    @Secured({"ROLE_USER"})

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    //@ResponseBody
    public  String testPage(ModelMap model,Principal principal, HttpServletRequest request){

        model.addAttribute("message","message");
        User user=userService.findByUsername(principal.getName());
        model.addAttribute("userid",user.getRole().getId());


        return "test";
    }

    @RequestMapping(value = "/test/websockettest", method = RequestMethod.GET)
    public String testIndexPage(ModelMap model, HttpServletRequest request){
        return "test/websockettest";
    }
}
