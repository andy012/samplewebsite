package com.doo.md5server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
@RequestMapping
public class MediatorController {
    /**
     * Main page allows for both users and administrators as it is responsible
     * for determining which role a person has and where they should be
     * directed.
     *
     * @param model
     * @param principal
     * @param request
     * @return
     */
    //@Secured({"ROLE_USER", "ROLE_ADMIN"})
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String mainPage(ModelMap model, Principal principal, HttpServletRequest request) {

        if (request.isUserInRole("ROLE_ADMIN")) {
            model.addAttribute("username", principal.getName());
            model.addAttribute("message", "Welcome Administrator, what is thy bidding ...");
            return "admin/admin";
        }

        if(null==principal){
            model.addAttribute("message", "Hello");
            return "index";
        }

        model.addAttribute("username", principal.getName());
        model.addAttribute("message", "Welcome to the Spring XML Example App");

        return "index";
    }
}
