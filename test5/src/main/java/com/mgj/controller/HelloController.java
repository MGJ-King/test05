package com.mgj.controller;

import com.mgj.entity.Users;
import com.mgj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
public class HelloController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("hello")
    public String hello(){
        return "hello world!";
    }

    @RequestMapping("success")
    public String success(Map<String,Object> map){
        map.put("username","zhangsan");
        map.put("usercode","11011");
        map.put("bumen","开发部");
        return "success";
    }

    @RequestMapping("add")
    public String add(Users user){
        return userService.addUser(user);
    }

}
