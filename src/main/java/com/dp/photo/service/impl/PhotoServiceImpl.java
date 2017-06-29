package com.dp.photo.service.impl;

import com.dp.photo.domain.Photo;
import com.dp.photo.mapper.BaseMapper;
import com.dp.photo.mapper.PhotoMapper;
import com.dp.photo.service.IPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dp9212 on 2017/6/28.
 */

@Service
public class PhotoServiceImpl extends BaseServiceImpl<Photo> implements IPhotoService {
    @Autowired
    private PhotoMapper photoMapper;
    @Override
    protected BaseMapper<Photo> baseMapper() {
        return photoMapper;
    }
}
