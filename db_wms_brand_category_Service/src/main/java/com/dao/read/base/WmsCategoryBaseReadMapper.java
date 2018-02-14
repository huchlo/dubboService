package com.dao.read.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.model.WmsCategory;
/**
*  @author author
*/
public interface WmsCategoryBaseReadMapper {


    List<WmsCategory> queryWmsCategory(WmsCategory object);

    WmsCategory queryWmsCategoryLimit1(WmsCategory object);

}