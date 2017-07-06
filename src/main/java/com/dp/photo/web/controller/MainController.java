package com.dp.photo.web.controller;

import com.dp.photo.domain.Classify;
import com.dp.photo.service.IClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 公共
 * Created by dengpeng on 2017/6/29.
 */
@Controller
@RequestMapping
public class MainController {

    @Autowired
    public IClassifyService classifyService;

    /* 主页 */
    @GetMapping("/index")
    public String index(ModelMap modelMap){
        List<Classify> all = classifyService.findClassifyByIndex();
        modelMap.put("classifyAll",all);
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
