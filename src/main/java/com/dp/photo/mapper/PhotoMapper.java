package com.dp.photo.mapper;

import com.dp.photo.domain.Photo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by dp9212 on 2017/6/28.
 */
@Mapper
@Repository
public interface PhotoMapper extends BaseMapper<Photo> {

}
