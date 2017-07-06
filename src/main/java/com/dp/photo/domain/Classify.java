package com.dp.photo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 分类
 * Created by dp9212 on 2017/6/28.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classify {
    private Integer id;
    private String classify_name;
    private String classify_describe; /* 长度150 */
    private String classify_coverImg;
    private Date classify_createTime;
    private Date classify_updateTime;
    private Integer classify_status; /* 状态 0正常 1假删除 */
    private Integer user_id;

}
