package com.student.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.student.entity.User;
import com.student.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class Loginontroller {
    @Autowired
    private UserService userService;

    /**
     * fanhui 登陆页面
     *
     * @param mv
     * @return
     */
    @RequestMapping(value = "/login")
    public ModelAndView login(ModelAndView mv) {
        mv.setViewName("/login");
        return mv;
    }

    /**
     * 返回注册页面
     *
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
     *
     * @param json
     * @return
     */
    @ResponseBody
    @PostMapping("/insertUser")
    public String insertUser(@RequestBody String json) {
        Map<String, Object> dataMap = new HashMap<>(16);
        final JSONObject jsonObject = JSON.parseObject(json);
        String username = jsonObject.get("username").toString();
        String password = jsonObject.get("password").toString();
        User user=User.builder().username(username).password(password).build();
        Integer num = userService.insertUser(user);
        if(num>0){
            dataMap.put("statusCode", HttpStatus.OK.value());
        }else{
            dataMap.put("statusCode", HttpStatus.BAD_REQUEST.value());
        }
        return  JSON.toJSONString(dataMap);
    }

    /**
     * 登陆认证
     *
     * @param user
     * @param user
     * @return
     */
    @ResponseBody
    @PostMapping("/loginOauth")
    public String  login( User user) {
        Map<String, Object> dataMap = new HashMap<>(16);
        Integer num = userService.login(user);
        if(num>0){
            dataMap.put("statusCode", HttpStatus.OK.value());
        }else{
            dataMap.put("statusCode", HttpStatus.BAD_REQUEST.value());
        }
        return JSON.toJSONString(dataMap);
    }


    /**
     * 登陆认证
     *
     * @param username
     * @return
     */
    @ResponseBody
    @GetMapping("/isExists")
    public String  isExists(@RequestParam(value = "username") String username) {
        Map<String, Object> dataMap = new HashMap<>(16);
        Integer num = userService.isExists(username);
        if(num>0){
            dataMap.put("statusCode", HttpStatus.BAD_REQUEST.value());
        }else{
            dataMap.put("statusCode", HttpStatus.OK.value());
        }
        return JSON.toJSONString(dataMap);
    }



    @GetMapping("/index")
    public ModelAndView index(ModelAndView mv) {
        mv.setViewName("/index");
        return mv;
    }



}
