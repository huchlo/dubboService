package com.service;

import com.dao.read.WmsBrandReadMapper;
import com.dao.read.WmsCategoryReadMapper;
import com.model.WmsBrand;
import com.model.WmsCategory;
import com.service.util.MybatisConnect;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.ibatis.session.SqlSession;

import java.util.*;

public class BrandCategoryReadServiceImpl implements BrandCategoryReadService {
    private MybatisConnect mybatisConnect;
    private SqlSession sqlSession;

    @Override
    public JSONArray queryWmsBrand_list(Map<String, Object> map) {
        sqlSession= mybatisConnect.currentSession();

        WmsBrandReadMapper wbrm= (WmsBrandReadMapper) sqlSession.getMapper(WmsBrandReadMapper.class);

        Object pageSize =  map.get("pageSize");
        if(pageSize ==null){
            pageSize=10;
            map.put("pageSize",10);
        }
        Object pageNum =  map.get("pageNum");
        if(pageNum ==null){
            pageNum = 1;
        }
        map.put("startRow",((int) pageNum-1)*(int)pageSize);
        List<String> brand_status= (List<String>) map.get("brand_status");
        if(brand_status==null||brand_status.size()==0){
            brand_status=Arrays.asList("1","2");
            map.put("brand_status",brand_status);
        }

        List<WmsBrand> wmsBrandList=wbrm.queryWmsBrand_list(map);

        WmsBrand wb;
        JSONArray ja=new JSONArray();
        JSONObject jo=new JSONObject();
        Iterator<WmsBrand> iterator=wmsBrandList.iterator();
        while(iterator.hasNext()){
            wb=iterator.next();
            jo.accumulate("brand_id",wb.getBrand_id());
            jo.accumulate("brand_category_id",wb.getBrand_category_id());
            jo.accumulate("brand_name",wb.getBrand_name());
            jo.accumulate("brand_logo",wb.getBrand_logo());
            jo.accumulate("brand_companyName",wb.getBrand_companyName());
            jo.accumulate("brand_website",wb.getBrand_website());
            jo.accumulate("brand_status",wb.getBrand_status());
            ja.add(jo);
            jo.clear();
        }

        mybatisConnect.closeSession();
        return ja;
    }

    @Override
    public int queryWmsBrandCount_list(Map<String, Object> map) {
        sqlSession= mybatisConnect.currentSession();

        WmsBrandReadMapper wbrm= (WmsBrandReadMapper) sqlSession.getMapper(WmsBrandReadMapper.class);

        int i=wbrm.queryWmsBrandCount_list(map);

        mybatisConnect.closeSession();
        return i;
    }

    @Override
    public JSONObject queryWmsBrandById(String id) {
        sqlSession= mybatisConnect.currentSession();

        WmsBrandReadMapper wbrm= (WmsBrandReadMapper) sqlSession.getMapper(WmsBrandReadMapper.class);

        WmsBrand wmsBrand=wbrm.queryWmsBrandById(id);
        if(wmsBrand==null){
            return null;
        }
        JSONObject jo=new JSONObject();
        jo.accumulate("brand_id",wmsBrand.getBrand_id());
        jo.accumulate("brand_category_id",wmsBrand.getBrand_category_id());
        jo.accumulate("brand_name",wmsBrand.getBrand_name());
        jo.accumulate("brand_companyName",wmsBrand.getBrand_companyName());
        jo.accumulate("brand_country",wmsBrand.getBrand_country());
        jo.accumulate("brand_logo",wmsBrand.getBrand_logo());
        jo.accumulate("brand_website",wmsBrand.getBrand_website());
        jo.accumulate("brand_describe",wmsBrand.getBrand_describe());
        jo.accumulate("brand_status",wmsBrand.getBrand_status());

        mybatisConnect.closeSession();
        return jo;
    }

    @Override
    public String queryWmsCategoryNameById(String id) {
        sqlSession= mybatisConnect.currentSession();

        WmsCategoryReadMapper wcrm= (WmsCategoryReadMapper) sqlSession.getMapper(WmsCategoryReadMapper.class);

        String  wmsCategoryName=wcrm.queryWmsCategoryNameById(id);

        mybatisConnect.closeSession();
        return wmsCategoryName;
    }

    @Override
    public JSONObject queryWmsCategoryById(String id) {
        sqlSession= mybatisConnect.currentSession();

        WmsCategoryReadMapper wcrm= (WmsCategoryReadMapper) sqlSession.getMapper(WmsCategoryReadMapper.class);

        WmsCategory wmsCategory=wcrm.queryWmsCategoryById(id);
        if(wmsCategory==null){
            return null;
        }
        JSONObject jo=new JSONObject();
        jo.accumulate("category_id",wmsCategory.getCategory_id());
        jo.accumulate("category_name",wmsCategory.getCategory_name());
        jo.accumulate("category_category_id",wmsCategory.getCategory_category_id());
        jo.accumulate("category_code",wmsCategory.getCategory_code());
        jo.accumulate("category_brand_id",wmsCategory.getCategory_brand_id());
        jo.accumulate("category_isTop",wmsCategory.getCategory_isTop());
        jo.accumulate("category_status",wmsCategory.getCategory_status());
        jo.accumulate("category_reservedField1",wmsCategory.getCategory_reservedField1());
        jo.accumulate("category_reservedField2",wmsCategory.getCategory_reservedField2());
        jo.accumulate("category_reservedField3",wmsCategory.getCategory_reservedField3());
        jo.accumulate("category_reservedField5",wmsCategory.getCategory_reservedField4());
        jo.accumulate("category_reservedField6",wmsCategory.getCategory_reservedField5());
        jo.accumulate("category_reservedField7",wmsCategory.getCategory_reservedField6());
        jo.accumulate("category_reservedField8",wmsCategory.getCategory_reservedField7());
        jo.accumulate("category_reservedField9",wmsCategory.getCategory_reservedField8());
        jo.accumulate("category_reservedField4",wmsCategory.getCategory_reservedField9());

        mybatisConnect.closeSession();
        return jo;
    }

    @Override
    public JSONArray queryTopWmsCategoryList(Map<String, Object> map) {
        sqlSession= mybatisConnect.currentSession();

        WmsCategoryReadMapper wcrm= (WmsCategoryReadMapper) sqlSession.getMapper(WmsCategoryReadMapper.class);

        List<String> category_status= (List<String>) map.get("category_status");
        if(category_status==null||category_status.size()==0){
            category_status=Arrays.asList("1","2");
            map.put("category_status",category_status);
        }

        List<WmsCategory> wmsCategoryList=wcrm.queryTopWmsCategoryList(map);

        WmsCategory wc;
        JSONArray ja=new JSONArray();
        JSONObject jo=new JSONObject();
        Iterator<WmsCategory> iterator=wmsCategoryList.iterator();
        //category_id,category_name,category_code,category_status
        while(iterator.hasNext()){
            wc=iterator.next();
            jo.accumulate("category_id",wc.getCategory_id());
            jo.accumulate("category_name",wc.getCategory_name());
            jo.accumulate("category_code",wc.getCategory_code());
            jo.accumulate("category_status",wc.getCategory_status());
            ja.add(jo);
            jo.clear();
        }

        mybatisConnect.closeSession();
        return ja;
    }
}
