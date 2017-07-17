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
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /* 新建相册Token生成 页面调转 */
    @GetMapping("/addClassifyView")
    public String addClassify(ModelMap modelMap){
        String classifyAddToken = FileUploadUtils.getClassifyAddToken();
        modelMap.put("classifyAddToken",classifyAddToken);
        return "photoClassify_add";
    }

    /* 保存相册 */
    @RequestMapping("/addClassify")
    @ResponseBody
    public JsonResult saveClassify(@RequestBody Classify classify,HttpSession session){
        JsonResult json = new JsonResult();
        /* 当前登陆的用户 */
        User user = (User)session.getAttribute("USER_IN_SESSION");
        /* 封装数据 */
        classify.setClassify_status(0);
        classify.setClassify_createTime(new Date());
        classify.setUser_id(user.getId());
        classifyService.save(classify);
        json.setSuccess(true).setMsg("成功");
        return json;
    }

    /* 假删除 */
    @GetMapping("/deleteClassify/{id}")
    @ResponseBody
    public JsonResult deleteClassify(@PathVariable Integer id){
        JsonResult json = new JsonResult();
        classifyService.delete(id);
        Classify oneById = classifyService.findOneById(id); /* 通过classify_status过滤查询出来的数据 */
        if(oneById == null ){
            json.setSuccess(true).setMsg("删除成功！");
        }else {
            json.setSuccess(false).setMsg("删除失败！");
        }
        return json;
    }
}
