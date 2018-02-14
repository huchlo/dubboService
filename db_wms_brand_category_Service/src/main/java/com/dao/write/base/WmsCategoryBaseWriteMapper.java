package com.dao.write.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.model.WmsCategory;
/**
*  @author author
*/
public interface WmsCategoryBaseWriteMapper {

    int insertWmsCategory(WmsCategory object);

    int updateWmsCategory(WmsCategory object);

}