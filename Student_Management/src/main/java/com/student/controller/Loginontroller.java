package com.student.controller;

import com.student.entity.User;
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

    /**
     * fanhui 登陆页面
     * @param mv
     * @return
     */
    @RequestMapping(value = "/index")
    public ModelAndView login(ModelAndView mv) {
        mv.setViewName("/login");
        return mv;
    }

    /**
     * 返回注册页面
     * @param mv
     * @return
     */
    @RequestMapping(value = "/register")
    public ModelAndView register(ModelAndView mv) {
        mv.setViewName("/register");
        return mv;
    }

    /**
     * zhuce
     * @param model
     * @param user
     * @return
     */
    @ResponseBody
    @PostMapping("/insertUser")
    public ModelAndView  insertUser(ModelAndView model, User user){
        Integer num=userService.insertUser(user);
        if(num>0){
            model.setViewName("/login");
            return  model;
        }
        model.setViewName("/register");
        return model;
    }

    /**
     * 登陆认证
     * @param model
     * @param user
     * @return
     */
    @ResponseBody
    @PostMapping("/login")
    public ModelAndView  login (ModelAndView model, User user){
        Integer num=userService.login(user);
        if(num>0){
            model.setViewName("/index");
            return  model;
        }
        model.setViewName("/login");
        return model;
    }



}
