package com.dao.write.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.model.WmsBrand;
/**
*  @author author
*/
public interface WmsBrandBaseWriteMapper {

    int insertWmsBrand(WmsBrand object);

    int updateWmsBrand(WmsBrand object);

}