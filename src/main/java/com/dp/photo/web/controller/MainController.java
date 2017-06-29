package com.dp.photo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 公共
 * Created by dengpeng on 2017/6/29.
 */
@Controller
@RequestMapping
public class MainController {

    /* 主页 */
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    /* 默认跳转登录 */
    @GetMapping
    public String main(){
        return "login";
    }
    /* 登录 */
    @GetMapping("/login")
    public String login(){
        return "login";
    }

}
