package com;


import com.service.BrandCategoryReadService;
import com.service.BrandCategoryReadServiceImpl;


import java.util.*;

/**
 * Created by asd on 17-10-29.
 */
public class Test {
    //static IRedisService i;
    //i=new RedisServiceImpl("sd");

  public static void main(String[] args) {
        BrandCategoryReadService bcs=new BrandCategoryReadServiceImpl();
        Map<String,Object> map=new HashMap<String,Object>();
        //map.put("brand_name","马");
        List<String> brand_category_id=new ArrayList<>();
        brand_category_id.add("1");
        brand_category_id.add("2");
        map.put("brand_category_id",brand_category_id);
        List<String> brand_status=new ArrayList<>();
        brand_status.add("2");
        map.put("brand_status",brand_status);
       System.out.println(bcs.queryWmsBrand_list(map));
       System.out.println(bcs.queryWmsBrandCount_list(map));
       System.out.println(bcs.queryWmsBrandById("1"));
       System.out.println(bcs.queryWmsCategoryNameById("2"));
       System.out.println(bcs.queryWmsCategoryById("2"));
       map.clear();
      List<String> category_status=new ArrayList<>();
      category_status.add("2");
       map.put("category_status",category_status);
      System.out.println(bcs.queryTopWmsCategoryList(map));
    }
}
