package com.dp.photo.mapper;

import com.dp.photo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by dp9212 on 2017/6/28.
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
    /* 根据用户查找 */

    User findByUserName(String user_name);
}
