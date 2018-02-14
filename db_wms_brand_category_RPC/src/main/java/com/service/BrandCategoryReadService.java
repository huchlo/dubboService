package com.service;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.Map;

public interface BrandCategoryReadService {

    /**
     * input:
     * int pageSize= (int) map.get("pageSize");[默认10]
     * int pageNum=(int) map.get("pageNum");[默认1]
     * String brand_name= (String) map.get("brand_name");[模糊查询]
     * List<String> brand_category_id= (List<String>) map.get("brand_category_id");
     * List<String> brand_status= (List<String>) map.get("brand_status");
     *
     *output:
     * brand_id,brand_category_id,brand_name,brand_logo,brand_companyName,brand_website,brand_status
     **/
    public JSONArray queryWmsBrand_list(Map<String,Object> map);
    public int queryWmsBrandCount_list(Map<String,Object> map);

    public JSONObject queryWmsBrandById(String id);

    public String queryWmsCategoryNameById(String id);

    public JSONObject queryWmsCategoryById(String id);

    /**
     * input:
     * List<String> category_status= (List<String>) map.get("category_status");
     * @param map
     * @return
     */
    public JSONArray queryTopWmsCategoryList(Map<String,Object> map);
}
