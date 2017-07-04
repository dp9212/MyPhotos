package com.dp.photo.web.controller;

import com.dp.photo.domain.Classify;
import com.dp.photo.domain.Photo;
import com.dp.photo.service.IClassifyService;
import com.dp.photo.service.IPhotoService;
import com.dp.photo.utils.FileUploadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
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

    @GetMapping("/addClassify")
    public String addClassify(ModelMap modelMap){
        String classifyAddToken = FileUploadUtils.getClassifyAddToken();
        System.out.println(classifyAddToken);
        modelMap.put("classifyAddToken",classifyAddToken);
        return "photoClassify_add";
    }
}
