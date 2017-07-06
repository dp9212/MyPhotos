package com.dp.photo.mapper;

import com.dp.photo.domain.Classify;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dp9212 on 2017/6/28.
 */
@Mapper
@Repository
public interface ClassifyMapper extends BaseMapper<Classify> {
    /* 首页相册展示 */
    List<Classify> findClassifyByIndex();
}
