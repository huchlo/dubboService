package com.dao.read.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.model.WmsBrand;
/**
*  @author author
*/
public interface WmsBrandBaseReadMapper {


    List<WmsBrand> queryWmsBrand(WmsBrand object);

    WmsBrand queryWmsBrandLimit1(WmsBrand object);

}