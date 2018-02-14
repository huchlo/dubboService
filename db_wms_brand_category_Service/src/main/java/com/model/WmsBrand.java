package com.model;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author author
*/
public class WmsBrand implements Serializable {

    private static final long serialVersionUID = 1517562929467L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private String brand_id;

    /**
    * 
    * isNullAble:1
    */
    private String brand_category_id;

    /**
    * 
    * isNullAble:0
    */
    private String brand_name;

    /**
    * 
    * isNullAble:1
    */
    private String brand_companyName;

    /**
    * 
    * isNullAble:1
    */
    private String brand_country;

    /**
    * 
    * isNullAble:1
    */
    private String brand_logo;

    /**
    * 
    * isNullAble:1
    */
    private String brand_website;

    /**
    * 
    * isNullAble:1
    */
    private String brand_describe;

    /**
    * 
    * isNullAble:0
    */
    private String brand_status;


    public void setBrand_id(String brand_id){
        this.brand_id = brand_id;
    }

    public String getBrand_id(){
        return this.brand_id;
    }

    public void setBrand_category_id(String brand_category_id){
        this.brand_category_id = brand_category_id;
    }

    public String getBrand_category_id(){
        return this.brand_category_id;
    }

    public void setBrand_name(String brand_name){
        this.brand_name = brand_name;
    }

    public String getBrand_name(){
        return this.brand_name;
    }

    public void setBrand_companyName(String brand_companyName){
        this.brand_companyName = brand_companyName;
    }

    public String getBrand_companyName(){
        return this.brand_companyName;
    }

    public void setBrand_country(String brand_country){
        this.brand_country = brand_country;
    }

    public String getBrand_country(){
        return this.brand_country;
    }

    public void setBrand_logo(String brand_logo){
        this.brand_logo = brand_logo;
    }

    public String getBrand_logo(){
        return this.brand_logo;
    }

    public void setBrand_website(String brand_website){
        this.brand_website = brand_website;
    }

    public String getBrand_website(){
        return this.brand_website;
    }

    public void setBrand_describe(String brand_describe){
        this.brand_describe = brand_describe;
    }

    public String getBrand_describe(){
        return this.brand_describe;
    }

    public void setBrand_status(String brand_status){
        this.brand_status = brand_status;
    }

    public String getBrand_status(){
        return this.brand_status;
    }
    @Override
    public String toString() {
        return "WmsBrand{" +
                "brand_id='" + brand_id + '\'' +
                "brand_category_id='" + brand_category_id + '\'' +
                "brand_name='" + brand_name + '\'' +
                "brand_companyName='" + brand_companyName + '\'' +
                "brand_country='" + brand_country + '\'' +
                "brand_logo='" + brand_logo + '\'' +
                "brand_website='" + brand_website + '\'' +
                "brand_describe='" + brand_describe + '\'' +
                "brand_status='" + brand_status + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends WmsBrand{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<String> brand_idList;


        private List<String> fuzzyBrand_id;

        public List<String> getFuzzyBrand_id(){
            return this.fuzzyBrand_id;
        }

        private List<String> rightFuzzyBrand_id;

        public List<String> getRightFuzzyBrand_id(){
            return this.rightFuzzyBrand_id;
        }
        private List<String> brand_category_idList;


        private List<String> fuzzyBrand_category_id;

        public List<String> getFuzzyBrand_category_id(){
            return this.fuzzyBrand_category_id;
        }

        private List<String> rightFuzzyBrand_category_id;

        public List<String> getRightFuzzyBrand_category_id(){
            return this.rightFuzzyBrand_category_id;
        }
        private List<String> brand_nameList;


        private List<String> fuzzyBrand_name;

        public List<String> getFuzzyBrand_name(){
            return this.fuzzyBrand_name;
        }

        private List<String> rightFuzzyBrand_name;

        public List<String> getRightFuzzyBrand_name(){
            return this.rightFuzzyBrand_name;
        }
        private List<String> brand_companyNameList;


        private List<String> fuzzyBrand_companyName;

        public List<String> getFuzzyBrand_companyName(){
            return this.fuzzyBrand_companyName;
        }

        private List<String> rightFuzzyBrand_companyName;

        public List<String> getRightFuzzyBrand_companyName(){
            return this.rightFuzzyBrand_companyName;
        }
        private List<String> brand_countryList;


        private List<String> fuzzyBrand_country;

        public List<String> getFuzzyBrand_country(){
            return this.fuzzyBrand_country;
        }

        private List<String> rightFuzzyBrand_country;

        public List<String> getRightFuzzyBrand_country(){
            return this.rightFuzzyBrand_country;
        }
        private List<String> brand_logoList;


        private List<String> fuzzyBrand_logo;

        public List<String> getFuzzyBrand_logo(){
            return this.fuzzyBrand_logo;
        }

        private List<String> rightFuzzyBrand_logo;

        public List<String> getRightFuzzyBrand_logo(){
            return this.rightFuzzyBrand_logo;
        }
        private List<String> brand_websiteList;


        private List<String> fuzzyBrand_website;

        public List<String> getFuzzyBrand_website(){
            return this.fuzzyBrand_website;
        }

        private List<String> rightFuzzyBrand_website;

        public List<String> getRightFuzzyBrand_website(){
            return this.rightFuzzyBrand_website;
        }
        private List<String> brand_describeList;


        private List<String> fuzzyBrand_describe;

        public List<String> getFuzzyBrand_describe(){
            return this.fuzzyBrand_describe;
        }

        private List<String> rightFuzzyBrand_describe;

        public List<String> getRightFuzzyBrand_describe(){
            return this.rightFuzzyBrand_describe;
        }
        private List<String> brand_statusList;


        private List<String> fuzzyBrand_status;

        public List<String> getFuzzyBrand_status(){
            return this.fuzzyBrand_status;
        }

        private List<String> rightFuzzyBrand_status;

        public List<String> getRightFuzzyBrand_status(){
            return this.rightFuzzyBrand_status;
        }
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }


        public QueryBuilder fuzzyBrand_id (List<String> fuzzyBrand_id){
            this.fuzzyBrand_id = fuzzyBrand_id;
            return this;
        }

        public QueryBuilder fuzzyBrand_id (String ... fuzzyBrand_id){
            this.fuzzyBrand_id = Arrays.asList(fuzzyBrand_id);
            return this;
        }

        public QueryBuilder rightFuzzyBrand_id (List<String> rightFuzzyBrand_id){
            this.rightFuzzyBrand_id = rightFuzzyBrand_id;
            return this;
        }

        public QueryBuilder rightFuzzyBrand_id (String ... rightFuzzyBrand_id){
            this.rightFuzzyBrand_id = Arrays.asList(rightFuzzyBrand_id);
            return this;
        }

        public QueryBuilder brand_id(String brand_id){
            setBrand_id(brand_id);
            return this;
        }

        public QueryBuilder brand_idList(String ... brand_id){
            this.brand_idList = Arrays.asList(brand_id);
            return this;
        }

        public QueryBuilder brand_idList(List<String> brand_id){
            this.brand_idList = brand_id;
            return this;
        }

        public QueryBuilder fetchBrand_id(){
            setFetchFields("fetchFields","brand_id");
            return this;
        }

        public QueryBuilder excludeBrand_id(){
            setFetchFields("excludeFields","brand_id");
            return this;
        }



        public QueryBuilder fuzzyBrand_category_id (List<String> fuzzyBrand_category_id){
            this.fuzzyBrand_category_id = fuzzyBrand_category_id;
            return this;
        }

        public QueryBuilder fuzzyBrand_category_id (String ... fuzzyBrand_category_id){
            this.fuzzyBrand_category_id = Arrays.asList(fuzzyBrand_category_id);
            return this;
        }

        public QueryBuilder rightFuzzyBrand_category_id (List<String> rightFuzzyBrand_category_id){
            this.rightFuzzyBrand_category_id = rightFuzzyBrand_category_id;
            return this;
        }

        public QueryBuilder rightFuzzyBrand_category_id (String ... rightFuzzyBrand_category_id){
            this.rightFuzzyBrand_category_id = Arrays.asList(rightFuzzyBrand_category_id);
            return this;
        }

        public QueryBuilder brand_category_id(String brand_category_id){
            setBrand_category_id(brand_category_id);
            return this;
        }

        public QueryBuilder brand_category_idList(String ... brand_category_id){
            this.brand_category_idList = Arrays.asList(brand_category_id);
            return this;
        }

        public QueryBuilder brand_category_idList(List<String> brand_category_id){
            this.brand_category_idList = brand_category_id;
            return this;
        }

        public QueryBuilder fetchBrand_category_id(){
            setFetchFields("fetchFields","brand_category_id");
            return this;
        }

        public QueryBuilder excludeBrand_category_id(){
            setFetchFields("excludeFields","brand_category_id");
            return this;
        }



        public QueryBuilder fuzzyBrand_name (List<String> fuzzyBrand_name){
            this.fuzzyBrand_name = fuzzyBrand_name;
            return this;
        }

        public QueryBuilder fuzzyBrand_name (String ... fuzzyBrand_name){
            this.fuzzyBrand_name = Arrays.asList(fuzzyBrand_name);
            return this;
        }

        public QueryBuilder rightFuzzyBrand_name (List<String> rightFuzzyBrand_name){
            this.rightFuzzyBrand_name = rightFuzzyBrand_name;
            return this;
        }

        public QueryBuilder rightFuzzyBrand_name (String ... rightFuzzyBrand_name){
            this.rightFuzzyBrand_name = Arrays.asList(rightFuzzyBrand_name);
            return this;
        }

        public QueryBuilder brand_name(String brand_name){
            setBrand_name(brand_name);
            return this;
        }

        public QueryBuilder brand_nameList(String ... brand_name){
            this.brand_nameList = Arrays.asList(brand_name);
            return this;
        }

        public QueryBuilder brand_nameList(List<String> brand_name){
            this.brand_nameList = brand_name;
            return this;
        }

        public QueryBuilder fetchBrand_name(){
            setFetchFields("fetchFields","brand_name");
            return this;
        }

        public QueryBuilder excludeBrand_name(){
            setFetchFields("excludeFields","brand_name");
            return this;
        }



        public QueryBuilder fuzzyBrand_companyName (List<String> fuzzyBrand_companyName){
            this.fuzzyBrand_companyName = fuzzyBrand_companyName;
            return this;
        }

        public QueryBuilder fuzzyBrand_companyName (String ... fuzzyBrand_companyName){
            this.fuzzyBrand_companyName = Arrays.asList(fuzzyBrand_companyName);
            return this;
        }

        public QueryBuilder rightFuzzyBrand_companyName (List<String> rightFuzzyBrand_companyName){
            this.rightFuzzyBrand_companyName = rightFuzzyBrand_companyName;
            return this;
        }

        public QueryBuilder rightFuzzyBrand_companyName (String ... rightFuzzyBrand_companyName){
            this.rightFuzzyBrand_companyName = Arrays.asList(rightFuzzyBrand_companyName);
            return this;
        }

        public QueryBuilder brand_companyName(String brand_companyName){
            setBrand_companyName(brand_companyName);
            return this;
        }

        public QueryBuilder brand_companyNameList(String ... brand_companyName){
            this.brand_companyNameList = Arrays.asList(brand_companyName);
            return this;
        }

        public QueryBuilder brand_companyNameList(List<String> brand_companyName){
            this.brand_companyNameList = brand_companyName;
            return this;
        }

        public QueryBuilder fetchBrand_companyName(){
            setFetchFields("fetchFields","brand_companyName");
            return this;
        }

        public QueryBuilder excludeBrand_companyName(){
            setFetchFields("excludeFields","brand_companyName");
            return this;
        }



        public QueryBuilder fuzzyBrand_country (List<String> fuzzyBrand_country){
            this.fuzzyBrand_country = fuzzyBrand_country;
            return this;
        }

        public QueryBuilder fuzzyBrand_country (String ... fuzzyBrand_country){
            this.fuzzyBrand_country = Arrays.asList(fuzzyBrand_country);
            return this;
        }

        public QueryBuilder rightFuzzyBrand_country (List<String> rightFuzzyBrand_country){
            this.rightFuzzyBrand_country = rightFuzzyBrand_country;
            return this;
        }

        public QueryBuilder rightFuzzyBrand_country (String ... rightFuzzyBrand_country){
            this.rightFuzzyBrand_country = Arrays.asList(rightFuzzyBrand_country);
            return this;
        }

        public QueryBuilder brand_country(String brand_country){
            setBrand_country(brand_country);
            return this;
        }

        public QueryBuilder brand_countryList(String ... brand_country){
            this.brand_countryList = Arrays.asList(brand_country);
            return this;
        }

        public QueryBuilder brand_countryList(List<String> brand_country){
            this.brand_countryList = brand_country;
            return this;
        }

        public QueryBuilder fetchBrand_country(){
            setFetchFields("fetchFields","brand_country");
            return this;
        }

        public QueryBuilder excludeBrand_country(){
            setFetchFields("excludeFields","brand_country");
            return this;
        }



        public QueryBuilder fuzzyBrand_logo (List<String> fuzzyBrand_logo){
            this.fuzzyBrand_logo = fuzzyBrand_logo;
            return this;
        }

        public QueryBuilder fuzzyBrand_logo (String ... fuzzyBrand_logo){
            this.fuzzyBrand_logo = Arrays.asList(fuzzyBrand_logo);
            return this;
        }

        public QueryBuilder rightFuzzyBrand_logo (List<String> rightFuzzyBrand_logo){
            this.rightFuzzyBrand_logo = rightFuzzyBrand_logo;
            return this;
        }

        public QueryBuilder rightFuzzyBrand_logo (String ... rightFuzzyBrand_logo){
            this.rightFuzzyBrand_logo = Arrays.asList(rightFuzzyBrand_logo);
            return this;
        }

        public QueryBuilder brand_logo(String brand_logo){
            setBrand_logo(brand_logo);
            return this;
        }

        public QueryBuilder brand_logoList(String ... brand_logo){
            this.brand_logoList = Arrays.asList(brand_logo);
            return this;
        }

        public QueryBuilder brand_logoList(List<String> brand_logo){
            this.brand_logoList = brand_logo;
            return this;
        }

        public QueryBuilder fetchBrand_logo(){
            setFetchFields("fetchFields","brand_logo");
            return this;
        }

        public QueryBuilder excludeBrand_logo(){
            setFetchFields("excludeFields","brand_logo");
            return this;
        }



        public QueryBuilder fuzzyBrand_website (List<String> fuzzyBrand_website){
            this.fuzzyBrand_website = fuzzyBrand_website;
            return this;
        }

        public QueryBuilder fuzzyBrand_website (String ... fuzzyBrand_website){
            this.fuzzyBrand_website = Arrays.asList(fuzzyBrand_website);
            return this;
        }

        public QueryBuilder rightFuzzyBrand_website (List<String> rightFuzzyBrand_website){
            this.rightFuzzyBrand_website = rightFuzzyBrand_website;
            return this;
        }

        public QueryBuilder rightFuzzyBrand_website (String ... rightFuzzyBrand_website){
            this.rightFuzzyBrand_website = Arrays.asList(rightFuzzyBrand_website);
            return this;
        }

        public QueryBuilder brand_website(String brand_website){
            setBrand_website(brand_website);
            return this;
        }

        public QueryBuilder brand_websiteList(String ... brand_website){
            this.brand_websiteList = Arrays.asList(brand_website);
            return this;
        }

        public QueryBuilder brand_websiteList(List<String> brand_website){
            this.brand_websiteList = brand_website;
            return this;
        }

        public QueryBuilder fetchBrand_website(){
            setFetchFields("fetchFields","brand_website");
            return this;
        }

        public QueryBuilder excludeBrand_website(){
            setFetchFields("excludeFields","brand_website");
            return this;
        }



        public QueryBuilder fuzzyBrand_describe (List<String> fuzzyBrand_describe){
            this.fuzzyBrand_describe = fuzzyBrand_describe;
            return this;
        }

        public QueryBuilder fuzzyBrand_describe (String ... fuzzyBrand_describe){
            this.fuzzyBrand_describe = Arrays.asList(fuzzyBrand_describe);
            return this;
        }

        public QueryBuilder rightFuzzyBrand_describe (List<String> rightFuzzyBrand_describe){
            this.rightFuzzyBrand_describe = rightFuzzyBrand_describe;
            return this;
        }

        public QueryBuilder rightFuzzyBrand_describe (String ... rightFuzzyBrand_describe){
            this.rightFuzzyBrand_describe = Arrays.asList(rightFuzzyBrand_describe);
            return this;
        }

        public QueryBuilder brand_describe(String brand_describe){
            setBrand_describe(brand_describe);
            return this;
        }

        public QueryBuilder brand_describeList(String ... brand_describe){
            this.brand_describeList = Arrays.asList(brand_describe);
            return this;
        }

        public QueryBuilder brand_describeList(List<String> brand_describe){
            this.brand_describeList = brand_describe;
            return this;
        }

        public QueryBuilder fetchBrand_describe(){
            setFetchFields("fetchFields","brand_describe");
            return this;
        }

        public QueryBuilder excludeBrand_describe(){
            setFetchFields("excludeFields","brand_describe");
            return this;
        }



        public QueryBuilder fuzzyBrand_status (List<String> fuzzyBrand_status){
            this.fuzzyBrand_status = fuzzyBrand_status;
            return this;
        }

        public QueryBuilder fuzzyBrand_status (String ... fuzzyBrand_status){
            this.fuzzyBrand_status = Arrays.asList(fuzzyBrand_status);
            return this;
        }

        public QueryBuilder rightFuzzyBrand_status (List<String> rightFuzzyBrand_status){
            this.rightFuzzyBrand_status = rightFuzzyBrand_status;
            return this;
        }

        public QueryBuilder rightFuzzyBrand_status (String ... rightFuzzyBrand_status){
            this.rightFuzzyBrand_status = Arrays.asList(rightFuzzyBrand_status);
            return this;
        }

        public QueryBuilder brand_status(String brand_status){
            setBrand_status(brand_status);
            return this;
        }

        public QueryBuilder brand_statusList(String ... brand_status){
            this.brand_statusList = Arrays.asList(brand_status);
            return this;
        }

        public QueryBuilder brand_statusList(List<String> brand_status){
            this.brand_statusList = brand_status;
            return this;
        }

        public QueryBuilder fetchBrand_status(){
            setFetchFields("fetchFields","brand_status");
            return this;
        }

        public QueryBuilder excludeBrand_status(){
            setFetchFields("excludeFields","brand_status");
            return this;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            this.fetchFields.put("otherFields",Arrays.asList(fields));
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.getOrDefault(key,new HashMap<>());
            fields.put(val,true);
            this.fetchFields.putIfAbsent(key,fields);
        }

        public WmsBrand build(){
            return this;
        }
    }

}
