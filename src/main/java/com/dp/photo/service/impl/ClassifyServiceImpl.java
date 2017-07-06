package com.dp.photo.service.impl;

import com.dp.photo.domain.Classify;
import com.dp.photo.mapper.BaseMapper;
import com.dp.photo.mapper.ClassifyMapper;
import com.dp.photo.service.IClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dp9212 on 2017/6/28.
 */

@Service
public class ClassifyServiceImpl extends BaseServiceImpl<Classify> implements IClassifyService {
    @Autowired
    private ClassifyMapper classifyMapper;
    @Override
    protected BaseMapper<Classify> baseMapper() {
        return classifyMapper;
    }

    @Override
    public List<Classify> findClassifyByIndex() {
        return classifyMapper.findClassifyByIndex();
    }
}
