package com.stackroute;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("/")
    public ModelAndView getUserName()
    {
        System.out.println("inside method");
        User user = new User("Aman");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("user",user);
        return modelAndView;
    }



}
