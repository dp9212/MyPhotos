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
    private String classify_describe;
    private String classify_coverImg;
    private Date classify_createTime;
    private Date classify_updateTime;
    private Integer user_id;

}
