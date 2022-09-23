package com.nanjiqie.mall.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//标记该类为返回页面的类
@Controller()
public class IndexController {

    //该页面为首页
    @RequestMapping("")
    public String choose(){
        return "/login/choose.html";
    }


    //该页面为管理员登录
    @RequestMapping("/admin")
    public String adminLogin(){
        return "login/admin.html";
    }

    //该页面为用户登录
    @RequestMapping("/user")
    public String userLogin(){
        return "login/user.html";
    }

    //该页面为卖家登录
    @RequestMapping("/seller")
    public String sellerLogin(){
        return "login/seller.html";
    }

}
