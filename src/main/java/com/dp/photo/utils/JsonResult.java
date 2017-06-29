package com.dp.photo.utils;

import org.springframework.stereotype.Component;

/**
 * Json数据处理
 * Created by dp9212 on 2017/5/27.
 */

@Component
public class JsonResult {

    private boolean success=true;
    private String msg = "操作成功！";

    // 成功
    public JsonResult() {
    }

    // 失败
    public JsonResult(String msg) {
        this.success = false;
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }
    //登录返回信息
    public JsonResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
