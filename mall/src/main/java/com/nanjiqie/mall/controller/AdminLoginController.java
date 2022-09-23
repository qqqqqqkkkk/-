package com.nanjiqie.mall.controller;

import com.nanjiqie.mall.service.AdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//标记该类为返还数据的控制器
@RestController
public class AdminLoginController {

    @Autowired
    AdminLoginService adminLoginService;

    @GetMapping("/adminIsExist/{name}/{password}")
    public String adminExist(@PathVariable("name") String name, @PathVariable("password") String password){
        System.out.println(name + "  " + password);
        if(adminLoginService.findAdmin(name,password) != null) return "欢迎！";
        return "对不起，您的输入有误";
    }

}
