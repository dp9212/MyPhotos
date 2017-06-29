package com.dp.photo.service.impl;

import com.dp.photo.domain.User;
import com.dp.photo.mapper.BaseMapper;
import com.dp.photo.mapper.UserMapper;
import com.dp.photo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dp9212 on 2017/6/28.
 */

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    protected BaseMapper<User> baseMapper() {
        return userMapper;
    }

    /* 登录 */
    @Override
    public User login(String user_name,String user_password) {
        User user = userMapper.findByUserName(user_name);
        if(null != user){
            if(user_password.equals(user.getUser_password())){
                return user;
            }
        }
        return null;
    }
}
