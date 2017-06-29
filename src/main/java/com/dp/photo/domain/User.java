package com.dp.photo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by dp9212 on 2017/6/28.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String user_name;
    private String user_password;
    private String user_tel;
    private String user_address;
    private Date user_createTime;
    private Date user_updateTime;
}
