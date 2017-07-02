package com.dp.photo.utils;

import com.qiniu.common.Zone;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import com.sun.deploy.net.HttpResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

/**
 * 七牛文件上传 常量
 *  or3tpjd0x.bkt.clouddn.com
 * Created by dp9212 on 2017/6/6.
 */
@Slf4j
@Component
public class FileUploadUtils extends HttpServlet{

    public static final String SESSION_TOKEN = "tokenInSession";

    public static final String ACCESS_KEY = "GtcOh5eTSypJJBA-gfgh676hOkSssjlDzyS4H_cg";//这里填上面我们讲到的，密钥管理里面的密钥
    public static final String SECRET_KEY = "B50EI3UDK4IwWBpoxeG34GlebQphohb2P3D3vDOK";
    public static final String BUCKET_NAME = "";//填我们在七牛云创建的 Bucket 名字

    /* 首页轮播上传 */
    public static final  String getWebUptoken() {
        String accessKey = FileUploadUtils.ACCESS_KEY;
        String secretKey = FileUploadUtils.SECRET_KEY;
        String bucket = FileUploadUtils.BUCKET_NAME;
        Auth auth = Auth.create(accessKey, secretKey);
        StringMap putPolicy = new StringMap();
        /* Controller中接收返回值的地址 */
        putPolicy.put("returnUrl","http://localhost/admin/qiniureturnBody");
//        putPolicy.put("returnBody", "{\"key\":\"$(key)\",\"hash\":\"$(etag)\",\"bucket\":\"$(bucket)\"}");
        long expireSeconds = 3600;
        String upToken = auth.uploadToken(bucket,null,expireSeconds,putPolicy);
        return upToken;
    }

    /* js上传Token生成 */
    public static final  String getProductUpToken() {
        String accessKey = FileUploadUtils.ACCESS_KEY;
        String secretKey = FileUploadUtils.SECRET_KEY;
        String bucket = "zhihuiproduct";
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket,null,3600,null);
        return upToken;
    }
}
