package com.dp.photo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dengpeng on 2017/6/29.
 */
@Controller
@RequestMapping
public class MainController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping
    public String main(){
        return "login";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
