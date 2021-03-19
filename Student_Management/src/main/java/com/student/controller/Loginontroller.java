package com.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Loginontroller {
    @RequestMapping(value = "/login")
    public ModelAndView test(ModelAndView mv) {
        mv.setViewName("/login");
        mv.addObject("title","欢迎使用Thymeleaf!");
        mv.addObject("username","张三");
        return mv;
    }
}
