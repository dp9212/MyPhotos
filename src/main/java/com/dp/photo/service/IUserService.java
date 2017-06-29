package com.dp.photo.service;

import com.dp.photo.domain.User;

/**
 * Created by dp9212 on 2017/6/28.
 */

public interface IUserService extends IBaseService<User> {
    /* 登录 */
    User login(String user_name,String user_password);
}
