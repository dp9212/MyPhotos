package com.dp.photo.web.controller;

import com.dp.photo.domain.Classify;
import com.dp.photo.domain.Photo;
import com.dp.photo.domain.User;
import com.dp.photo.service.IClassifyService;
import com.dp.photo.service.IPhotoService;
import com.dp.photo.utils.FileUploadUtils;
import com.dp.photo.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by dp9212 on 2017/6/28.
 */
@Controller
@RequestMapping("/photo")
public class PhotoController {
    @Autowired
    private IPhotoService photoService;
    @Autowired
    private IClassifyService classifyService;

    @GetMapping
    public String main(ModelMap modelMap){
        List<Classify> classifyAll = classifyService.findAll();
        modelMap.put("classifyAll",classifyAll);
        return "photoClassify";
    }

    @GetMapping("/addClassifyView")
    public String addClassify(ModelMap modelMap){
        String classifyAddToken = FileUploadUtils.getClassifyAddToken();
        System.out.println(classifyAddToken);
        modelMap.put("classifyAddToken",classifyAddToken);
        return "photoClassify_add";
    }

    @PostMapping("/addClassify")
    @ResponseBody
    public JsonResult saveClassify(@RequestBody Classify classify,HttpSession session){
        JsonResult json = new JsonResult();
        /* 当前登陆的用户 */
        User user = (User)session.getAttribute("USER_IN_SESSION");

        /* 封装数据 */
        classify.setClassify_createTime(new Date());
        classify.setUser_id(user.getId());
        classifyService.save(classify);
        return json;
    }

}
