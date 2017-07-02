/*
*   <script src="../js/qiniu.js"></script>
    <script src="../js/moxie.js"></script>
    <script src="../js/plupload.dev.js"></script>
*
* */


/* 添加商品图片上传 */
var uploader = Qiniu.uploader({
    runtimes: 'html5,html4',    //上传模式,依次退化
    browse_button: 'uploadFileToken',       //上传选择的点选按钮，**必需**
    //uptoken_url: '/token',            //Ajax请求upToken的Url，**强烈建议设置**（服务端提供）
    uptoken : [[${productToken}]], //若未指定uptoken_url,则必须指定 uptoken ,uptoken由其他程序生成
    domain: 'http://upload-z2.qiniu.com/',   //bucket 域名，下载资源时用到，**必需**
    get_new_uptoken: false,  //设置上传文件的时候是否每次都重新获取新的token
    container: 'container',           //上传区域DOM ID，默认是browser_button的父元素，
    max_file_size: '10mb',           //最大文件体积限制
    auto_start: true,                 //选择文件后自动上传，若关闭需要自己绑定事件触发上传
    init: {
        'FileUploaded': function(up, file, info) {
            // info上传成功后
            // {"hash": "Fh8xVqod2MQ1mocfI4S4KpRL6D98",
            //    "key": "gogopher.jpg"}
            var domain = up.getOption('domain');
            var res = window.JSON.parse(info);
            var sourceLink = 'http://oreyerk3c.bkt.clouddn.com/' + res.key;
            $("#prodImgUrl").val(sourceLink);
        },
        'Error': function(up, err, errTip) {
            //上传出错时,处理相关的事情
            alert("上传失败")
        },
    }
});
