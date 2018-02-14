package com.dao.read;

import com.dao.read.base.WmsBrandBaseReadMapper;
import com.model.WmsBrand;

import java.util.List;
import java.util.Map;

/**
*  @author author
*/
public interface WmsBrandReadMapper extends WmsBrandBaseReadMapper{
    List<WmsBrand> queryWmsBrand_list(Map<String,Object> map);

    int queryWmsBrandCount_list(Map<String,Object> map);

    WmsBrand queryWmsBrandById(String id);
}