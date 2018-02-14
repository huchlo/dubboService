package com.dao.read;

import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.Param;
import com.model.WmsCategory;
import com.dao.read.base.WmsCategoryBaseReadMapper;
/**
*  @author author
*/
public interface WmsCategoryReadMapper extends WmsCategoryBaseReadMapper{

        WmsCategory queryWmsCategoryById(String id);

        String queryWmsCategoryNameById(String id);

        List<WmsCategory> queryTopWmsCategoryList(Map<String,Object> map);
}