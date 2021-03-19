package com.student.controller;

import com.student.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class Loginontroller {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/login")
    public ModelAndView test(ModelAndView mv) {
        mv.setViewName("/login");
        mv.addObject("title","欢迎使用Thymeleaf!");
        mv.addObject("username","张三");
        return mv;
    }
    @ResponseBody
    @GetMapping("/insertUser")
    public  String insertUser(@RequestParam(value = "userName") String userName, @RequestParam(value = "password") String password){
        Integer num=userService.insertUser(userName,password);
        return  num.toString();
    }
}
