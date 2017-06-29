package com.dp.photo.service.impl;

import com.dp.photo.mapper.BaseMapper;
import com.dp.photo.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dp9212 on 2017/6/28.
 */

@Service
public abstract  class BaseServiceImpl<T> implements IBaseService<T> {

    /* 获取类型 */
    @Autowired
    protected abstract BaseMapper<T> baseMapper();

    @Override
    public void save(T t) {
        baseMapper().save(t);
    }

    @Override
    public void delete(Integer id) {
        baseMapper().delete(id);
    }

    @Override
    public void update(T t) {
        baseMapper().update(t);
    }

    @Override
    public T findOneById(Integer id) {
        return baseMapper().findOneById(id);
    }

    @Override
    public List<T> findAll() {
        return baseMapper().findAll();
    }
}
