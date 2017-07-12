package com.dp.photo.service;

import com.dp.photo.domain.Classify;

import java.util.List;

/**
 * Created by dp9212 on 2017/6/28.
 */
public interface IClassifyService extends IBaseService<Classify> {
    /* 首页相册展示 */
    List<Classify> findClassifyByIndex();

}
