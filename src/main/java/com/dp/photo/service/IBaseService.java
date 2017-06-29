package com.dp.photo.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dp9212 on 2017/6/28.
 */
public interface IBaseService<T> {
    void save(T t);
    void delete(Integer id);
    void update(T t);
    T findOneById(Integer id);
    List<T> findAll();
}
