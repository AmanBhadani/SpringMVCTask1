package com.stackroute;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @RequestMapping("/")
    public String homePage()
    {
        return "index";
    }
    @RequestMapping("/show")
    public ModelAndView getUserName(HttpServletRequest httpServletRequest)
    {
        String username=(httpServletRequest.getParameter("username"));
        String password=(httpServletRequest.getParameter("password"));
        User user=  new User();
        user.setName(username);
        user.setPassword(password);
        ModelAndView modelAndView = new ModelAndView("display");
        modelAndView.addObject("user",user);
        return modelAndView;
    }




}
