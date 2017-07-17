package com.dp.photo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dp9212 on 2017/6/28.
 */
@Repository
public interface BaseMapper<T> {

    void save(T t);
    void delete(Integer id);
    void update(T t);
    T findOneById(Integer id);
    List<T> findAll();
}
