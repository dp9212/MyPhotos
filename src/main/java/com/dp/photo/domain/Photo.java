package com.dp.photo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by dp9212 on 2017/6/28.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Photo {
    private Integer id;
    private Integer classify_id;
    private String photo_name;
    private String photo_url;
    private String photo_describe;

}
