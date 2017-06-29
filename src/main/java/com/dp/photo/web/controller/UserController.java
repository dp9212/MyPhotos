package com.dp.photo.web.controller;

import com.dp.photo.domain.User;
import com.dp.photo.service.IUserService;
import com.dp.photo.utils.JsonResult;
import com.dp.photo.utils.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * Created by dp9212 on 2017/6/28.
 */

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;


    @PostMapping("/checkLogin")
    @ResponseBody
    public JsonResult login(@RequestBody User user, ModelMap modelMap){
        JsonResult json = new JsonResult();
        String user_name = user.getUser_name();
        String user_password = user.getUser_password();
        User login = userService.login(user_name, user_password);
        System.out.println(login);
        if(null != login){
            modelMap.put(UserContext.USER_IN_SESSION,login);
            json.setSuccess(true).setMsg("登陆成功!");
        }else {
            json.setSuccess(false).setMsg("登陆失败，请检查用户名或者密码!");
        }
        return json;
    }
}
