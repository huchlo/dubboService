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
public class WmsCategory implements Serializable {

    private static final long serialVersionUID = 1517824235268L;


    /**
    * 
    * isNullAble:0
    */
    private String category_id;

    /**
    * 
    * isNullAble:0
    */
    private String category_name;

    /**
    * 
    * isNullAble:1
    */
    private String category_category_id;

    /**
    * 
    * isNullAble:0
    */
    private String category_code;

    /**
    * 
    * isNullAble:1
    */
    private String category_brand_id;

    /**
    * 
    * isNullAble:1
    */
    private Integer category_isTop;

    /**
    * 
    * isNullAble:0
    */
    private String category_status;

    /**
    * 
    * isNullAble:1
    */
    private String category_reservedField1;

    /**
    * 
    * isNullAble:1
    */
    private String category_reservedField2;

    /**
    * 
    * isNullAble:1
    */
    private String category_reservedField3;

    /**
    * 
    * isNullAble:1
    */
    private String category_reservedField4;

    /**
    * 
    * isNullAble:1
    */
    private String category_reservedField5;

    /**
    * 
    * isNullAble:1
    */
    private String category_reservedField6;

    /**
    * 
    * isNullAble:1
    */
    private String category_reservedField7;

    /**
    * 
    * isNullAble:1
    */
    private String category_reservedField8;

    /**
    * 
    * isNullAble:1
    */
    private String category_reservedField9;


    public void setCategory_id(String category_id){
        this.category_id = category_id;
    }

    public String getCategory_id(){
        return this.category_id;
    }

    public void setCategory_name(String category_name){
        this.category_name = category_name;
    }

    public String getCategory_name(){
        return this.category_name;
    }

    public void setCategory_category_id(String category_category_id){
        this.category_category_id = category_category_id;
    }

    public String getCategory_category_id(){
        return this.category_category_id;
    }

    public void setCategory_code(String category_code){
        this.category_code = category_code;
    }

    public String getCategory_code(){
        return this.category_code;
    }

    public void setCategory_brand_id(String category_brand_id){
        this.category_brand_id = category_brand_id;
    }

    public String getCategory_brand_id(){
        return this.category_brand_id;
    }

    public void setCategory_isTop(Integer category_isTop){
        this.category_isTop = category_isTop;
    }

    public Integer getCategory_isTop(){
        return this.category_isTop;
    }

    public void setCategory_status(String category_status){
        this.category_status = category_status;
    }

    public String getCategory_status(){
        return this.category_status;
    }

    public void setCategory_reservedField1(String category_reservedField1){
        this.category_reservedField1 = category_reservedField1;
    }

    public String getCategory_reservedField1(){
        return this.category_reservedField1;
    }

    public void setCategory_reservedField2(String category_reservedField2){
        this.category_reservedField2 = category_reservedField2;
    }

    public String getCategory_reservedField2(){
        return this.category_reservedField2;
    }

    public void setCategory_reservedField3(String category_reservedField3){
        this.category_reservedField3 = category_reservedField3;
    }

    public String getCategory_reservedField3(){
        return this.category_reservedField3;
    }

    public void setCategory_reservedField4(String category_reservedField4){
        this.category_reservedField4 = category_reservedField4;
    }

    public String getCategory_reservedField4(){
        return this.category_reservedField4;
    }

    public void setCategory_reservedField5(String category_reservedField5){
        this.category_reservedField5 = category_reservedField5;
    }

    public String getCategory_reservedField5(){
        return this.category_reservedField5;
    }

    public void setCategory_reservedField6(String category_reservedField6){
        this.category_reservedField6 = category_reservedField6;
    }

    public String getCategory_reservedField6(){
        return this.category_reservedField6;
    }

    public void setCategory_reservedField7(String category_reservedField7){
        this.category_reservedField7 = category_reservedField7;
    }

    public String getCategory_reservedField7(){
        return this.category_reservedField7;
    }

    public void setCategory_reservedField8(String category_reservedField8){
        this.category_reservedField8 = category_reservedField8;
    }

    public String getCategory_reservedField8(){
        return this.category_reservedField8;
    }

    public void setCategory_reservedField9(String category_reservedField9){
        this.category_reservedField9 = category_reservedField9;
    }

    public String getCategory_reservedField9(){
        return this.category_reservedField9;
    }
    @Override
    public String toString() {
        return "WmsCategory{" +
                "category_id='" + category_id + '\'' +
                "category_name='" + category_name + '\'' +
                "category_category_id='" + category_category_id + '\'' +
                "category_code='" + category_code + '\'' +
                "category_brand_id='" + category_brand_id + '\'' +
                "category_isTop='" + category_isTop + '\'' +
                "category_status='" + category_status + '\'' +
                "category_reservedField1='" + category_reservedField1 + '\'' +
                "category_reservedField2='" + category_reservedField2 + '\'' +
                "category_reservedField3='" + category_reservedField3 + '\'' +
                "category_reservedField4='" + category_reservedField4 + '\'' +
                "category_reservedField5='" + category_reservedField5 + '\'' +
                "category_reservedField6='" + category_reservedField6 + '\'' +
                "category_reservedField7='" + category_reservedField7 + '\'' +
                "category_reservedField8='" + category_reservedField8 + '\'' +
                "category_reservedField9='" + category_reservedField9 + '\'' +
            '}';
    }

    public static QueryBuilder QueryBuild(){
        return new QueryBuilder();
    }

    public static class QueryBuilder extends WmsCategory{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){
            return this.fetchFields;
        }

        private List<String> category_idList;


        private List<String> fuzzyCategory_id;

        public List<String> getFuzzyCategory_id(){
            return this.fuzzyCategory_id;
        }

        private List<String> rightFuzzyCategory_id;

        public List<String> getRightFuzzyCategory_id(){
            return this.rightFuzzyCategory_id;
        }
        private List<String> category_nameList;


        private List<String> fuzzyCategory_name;

        public List<String> getFuzzyCategory_name(){
            return this.fuzzyCategory_name;
        }

        private List<String> rightFuzzyCategory_name;

        public List<String> getRightFuzzyCategory_name(){
            return this.rightFuzzyCategory_name;
        }
        private List<String> category_category_idList;


        private List<String> fuzzyCategory_category_id;

        public List<String> getFuzzyCategory_category_id(){
            return this.fuzzyCategory_category_id;
        }

        private List<String> rightFuzzyCategory_category_id;

        public List<String> getRightFuzzyCategory_category_id(){
            return this.rightFuzzyCategory_category_id;
        }
        private List<String> category_codeList;


        private List<String> fuzzyCategory_code;

        public List<String> getFuzzyCategory_code(){
            return this.fuzzyCategory_code;
        }

        private List<String> rightFuzzyCategory_code;

        public List<String> getRightFuzzyCategory_code(){
            return this.rightFuzzyCategory_code;
        }
        private List<String> category_brand_idList;


        private List<String> fuzzyCategory_brand_id;

        public List<String> getFuzzyCategory_brand_id(){
            return this.fuzzyCategory_brand_id;
        }

        private List<String> rightFuzzyCategory_brand_id;

        public List<String> getRightFuzzyCategory_brand_id(){
            return this.rightFuzzyCategory_brand_id;
        }
        private List<Integer> category_isTopList;

        private Integer category_isTopSt;

        private Integer category_isTopEd;

        public Integer getCategory_isTopSt(){
            return this.category_isTopSt;
        }

        public Integer getCategory_isTopEd(){
            return this.category_isTopEd;
        }

        private List<String> category_statusList;


        private List<String> fuzzyCategory_status;

        public List<String> getFuzzyCategory_status(){
            return this.fuzzyCategory_status;
        }

        private List<String> rightFuzzyCategory_status;

        public List<String> getRightFuzzyCategory_status(){
            return this.rightFuzzyCategory_status;
        }
        private List<String> category_reservedField1List;


        private List<String> fuzzyCategory_reservedField1;

        public List<String> getFuzzyCategory_reservedField1(){
            return this.fuzzyCategory_reservedField1;
        }

        private List<String> rightFuzzyCategory_reservedField1;

        public List<String> getRightFuzzyCategory_reservedField1(){
            return this.rightFuzzyCategory_reservedField1;
        }
        private List<String> category_reservedField2List;


        private List<String> fuzzyCategory_reservedField2;

        public List<String> getFuzzyCategory_reservedField2(){
            return this.fuzzyCategory_reservedField2;
        }

        private List<String> rightFuzzyCategory_reservedField2;

        public List<String> getRightFuzzyCategory_reservedField2(){
            return this.rightFuzzyCategory_reservedField2;
        }
        private List<String> category_reservedField3List;


        private List<String> fuzzyCategory_reservedField3;

        public List<String> getFuzzyCategory_reservedField3(){
            return this.fuzzyCategory_reservedField3;
        }

        private List<String> rightFuzzyCategory_reservedField3;

        public List<String> getRightFuzzyCategory_reservedField3(){
            return this.rightFuzzyCategory_reservedField3;
        }
        private List<String> category_reservedField4List;


        private List<String> fuzzyCategory_reservedField4;

        public List<String> getFuzzyCategory_reservedField4(){
            return this.fuzzyCategory_reservedField4;
        }

        private List<String> rightFuzzyCategory_reservedField4;

        public List<String> getRightFuzzyCategory_reservedField4(){
            return this.rightFuzzyCategory_reservedField4;
        }
        private List<String> category_reservedField5List;


        private List<String> fuzzyCategory_reservedField5;

        public List<String> getFuzzyCategory_reservedField5(){
            return this.fuzzyCategory_reservedField5;
        }

        private List<String> rightFuzzyCategory_reservedField5;

        public List<String> getRightFuzzyCategory_reservedField5(){
            return this.rightFuzzyCategory_reservedField5;
        }
        private List<String> category_reservedField6List;


        private List<String> fuzzyCategory_reservedField6;

        public List<String> getFuzzyCategory_reservedField6(){
            return this.fuzzyCategory_reservedField6;
        }

        private List<String> rightFuzzyCategory_reservedField6;

        public List<String> getRightFuzzyCategory_reservedField6(){
            return this.rightFuzzyCategory_reservedField6;
        }
        private List<String> category_reservedField7List;


        private List<String> fuzzyCategory_reservedField7;

        public List<String> getFuzzyCategory_reservedField7(){
            return this.fuzzyCategory_reservedField7;
        }

        private List<String> rightFuzzyCategory_reservedField7;

        public List<String> getRightFuzzyCategory_reservedField7(){
            return this.rightFuzzyCategory_reservedField7;
        }
        private List<String> category_reservedField8List;


        private List<String> fuzzyCategory_reservedField8;

        public List<String> getFuzzyCategory_reservedField8(){
            return this.fuzzyCategory_reservedField8;
        }

        private List<String> rightFuzzyCategory_reservedField8;

        public List<String> getRightFuzzyCategory_reservedField8(){
            return this.rightFuzzyCategory_reservedField8;
        }
        private List<String> category_reservedField9List;


        private List<String> fuzzyCategory_reservedField9;

        public List<String> getFuzzyCategory_reservedField9(){
            return this.fuzzyCategory_reservedField9;
        }

        private List<String> rightFuzzyCategory_reservedField9;

        public List<String> getRightFuzzyCategory_reservedField9(){
            return this.rightFuzzyCategory_reservedField9;
        }
        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }


        public QueryBuilder fuzzyCategory_id (List<String> fuzzyCategory_id){
            this.fuzzyCategory_id = fuzzyCategory_id;
            return this;
        }

        public QueryBuilder fuzzyCategory_id (String ... fuzzyCategory_id){
            this.fuzzyCategory_id = Arrays.asList(fuzzyCategory_id);
            return this;
        }

        public QueryBuilder rightFuzzyCategory_id (List<String> rightFuzzyCategory_id){
            this.rightFuzzyCategory_id = rightFuzzyCategory_id;
            return this;
        }

        public QueryBuilder rightFuzzyCategory_id (String ... rightFuzzyCategory_id){
            this.rightFuzzyCategory_id = Arrays.asList(rightFuzzyCategory_id);
            return this;
        }

        public QueryBuilder category_id(String category_id){
            setCategory_id(category_id);
            return this;
        }

        public QueryBuilder category_idList(String ... category_id){
            this.category_idList = Arrays.asList(category_id);
            return this;
        }

        public QueryBuilder category_idList(List<String> category_id){
            this.category_idList = category_id;
            return this;
        }

        public QueryBuilder fetchCategory_id(){
            setFetchFields("fetchFields","category_id");
            return this;
        }

        public QueryBuilder excludeCategory_id(){
            setFetchFields("excludeFields","category_id");
            return this;
        }



        public QueryBuilder fuzzyCategory_name (List<String> fuzzyCategory_name){
            this.fuzzyCategory_name = fuzzyCategory_name;
            return this;
        }

        public QueryBuilder fuzzyCategory_name (String ... fuzzyCategory_name){
            this.fuzzyCategory_name = Arrays.asList(fuzzyCategory_name);
            return this;
        }

        public QueryBuilder rightFuzzyCategory_name (List<String> rightFuzzyCategory_name){
            this.rightFuzzyCategory_name = rightFuzzyCategory_name;
            return this;
        }

        public QueryBuilder rightFuzzyCategory_name (String ... rightFuzzyCategory_name){
            this.rightFuzzyCategory_name = Arrays.asList(rightFuzzyCategory_name);
            return this;
        }

        public QueryBuilder category_name(String category_name){
            setCategory_name(category_name);
            return this;
        }

        public QueryBuilder category_nameList(String ... category_name){
            this.category_nameList = Arrays.asList(category_name);
            return this;
        }

        public QueryBuilder category_nameList(List<String> category_name){
            this.category_nameList = category_name;
            return this;
        }

        public QueryBuilder fetchCategory_name(){
            setFetchFields("fetchFields","category_name");
            return this;
        }

        public QueryBuilder excludeCategory_name(){
            setFetchFields("excludeFields","category_name");
            return this;
        }



        public QueryBuilder fuzzyCategory_category_id (List<String> fuzzyCategory_category_id){
            this.fuzzyCategory_category_id = fuzzyCategory_category_id;
            return this;
        }

        public QueryBuilder fuzzyCategory_category_id (String ... fuzzyCategory_category_id){
            this.fuzzyCategory_category_id = Arrays.asList(fuzzyCategory_category_id);
            return this;
        }

        public QueryBuilder rightFuzzyCategory_category_id (List<String> rightFuzzyCategory_category_id){
            this.rightFuzzyCategory_category_id = rightFuzzyCategory_category_id;
            return this;
        }

        public QueryBuilder rightFuzzyCategory_category_id (String ... rightFuzzyCategory_category_id){
            this.rightFuzzyCategory_category_id = Arrays.asList(rightFuzzyCategory_category_id);
            return this;
        }

        public QueryBuilder category_category_id(String category_category_id){
            setCategory_category_id(category_category_id);
            return this;
        }

        public QueryBuilder category_category_idList(String ... category_category_id){
            this.category_category_idList = Arrays.asList(category_category_id);
            return this;
        }

        public QueryBuilder category_category_idList(List<String> category_category_id){
            this.category_category_idList = category_category_id;
            return this;
        }

        public QueryBuilder fetchCategory_category_id(){
            setFetchFields("fetchFields","category_category_id");
            return this;
        }

        public QueryBuilder excludeCategory_category_id(){
            setFetchFields("excludeFields","category_category_id");
            return this;
        }



        public QueryBuilder fuzzyCategory_code (List<String> fuzzyCategory_code){
            this.fuzzyCategory_code = fuzzyCategory_code;
            return this;
        }

        public QueryBuilder fuzzyCategory_code (String ... fuzzyCategory_code){
            this.fuzzyCategory_code = Arrays.asList(fuzzyCategory_code);
            return this;
        }

        public QueryBuilder rightFuzzyCategory_code (List<String> rightFuzzyCategory_code){
            this.rightFuzzyCategory_code = rightFuzzyCategory_code;
            return this;
        }

        public QueryBuilder rightFuzzyCategory_code (String ... rightFuzzyCategory_code){
            this.rightFuzzyCategory_code = Arrays.asList(rightFuzzyCategory_code);
            return this;
        }

        public QueryBuilder category_code(String category_code){
            setCategory_code(category_code);
            return this;
        }

        public QueryBuilder category_codeList(String ... category_code){
            this.category_codeList = Arrays.asList(category_code);
            return this;
        }

        public QueryBuilder category_codeList(List<String> category_code){
            this.category_codeList = category_code;
            return this;
        }

        public QueryBuilder fetchCategory_code(){
            setFetchFields("fetchFields","category_code");
            return this;
        }

        public QueryBuilder excludeCategory_code(){
            setFetchFields("excludeFields","category_code");
            return this;
        }



        public QueryBuilder fuzzyCategory_brand_id (List<String> fuzzyCategory_brand_id){
            this.fuzzyCategory_brand_id = fuzzyCategory_brand_id;
            return this;
        }

        public QueryBuilder fuzzyCategory_brand_id (String ... fuzzyCategory_brand_id){
            this.fuzzyCategory_brand_id = Arrays.asList(fuzzyCategory_brand_id);
            return this;
        }

        public QueryBuilder rightFuzzyCategory_brand_id (List<String> rightFuzzyCategory_brand_id){
            this.rightFuzzyCategory_brand_id = rightFuzzyCategory_brand_id;
            return this;
        }

        public QueryBuilder rightFuzzyCategory_brand_id (String ... rightFuzzyCategory_brand_id){
            this.rightFuzzyCategory_brand_id = Arrays.asList(rightFuzzyCategory_brand_id);
            return this;
        }

        public QueryBuilder category_brand_id(String category_brand_id){
            setCategory_brand_id(category_brand_id);
            return this;
        }

        public QueryBuilder category_brand_idList(String ... category_brand_id){
            this.category_brand_idList = Arrays.asList(category_brand_id);
            return this;
        }

        public QueryBuilder category_brand_idList(List<String> category_brand_id){
            this.category_brand_idList = category_brand_id;
            return this;
        }

        public QueryBuilder fetchCategory_brand_id(){
            setFetchFields("fetchFields","category_brand_id");
            return this;
        }

        public QueryBuilder excludeCategory_brand_id(){
            setFetchFields("excludeFields","category_brand_id");
            return this;
        }



        public QueryBuilder category_isTopBetWeen(Integer category_isTopSt,Integer category_isTopEd){
            this.category_isTopSt = category_isTopSt;
            this.category_isTopEd = category_isTopEd;
            return this;
        }

        public QueryBuilder category_isTopGreaterEqThan(Integer category_isTopSt){
            this.category_isTopSt = category_isTopSt;
            return this;
        }
        public QueryBuilder category_isTopLessEqThan(Integer category_isTopEd){
            this.category_isTopEd = category_isTopEd;
            return this;
        }


        public QueryBuilder category_isTop(Integer category_isTop){
            setCategory_isTop(category_isTop);
            return this;
        }

        public QueryBuilder category_isTopList(Integer ... category_isTop){
            this.category_isTopList = Arrays.asList(category_isTop);
            return this;
        }

        public QueryBuilder category_isTopList(List<Integer> category_isTop){
            this.category_isTopList = category_isTop;
            return this;
        }

        public QueryBuilder fetchCategory_isTop(){
            setFetchFields("fetchFields","category_isTop");
            return this;
        }

        public QueryBuilder excludeCategory_isTop(){
            setFetchFields("excludeFields","category_isTop");
            return this;
        }



        public QueryBuilder fuzzyCategory_status (List<String> fuzzyCategory_status){
            this.fuzzyCategory_status = fuzzyCategory_status;
            return this;
        }

        public QueryBuilder fuzzyCategory_status (String ... fuzzyCategory_status){
            this.fuzzyCategory_status = Arrays.asList(fuzzyCategory_status);
            return this;
        }

        public QueryBuilder rightFuzzyCategory_status (List<String> rightFuzzyCategory_status){
            this.rightFuzzyCategory_status = rightFuzzyCategory_status;
            return this;
        }

        public QueryBuilder rightFuzzyCategory_status (String ... rightFuzzyCategory_status){
            this.rightFuzzyCategory_status = Arrays.asList(rightFuzzyCategory_status);
            return this;
        }

        public QueryBuilder category_status(String category_status){
            setCategory_status(category_status);
            return this;
        }

        public QueryBuilder category_statusList(String ... category_status){
            this.category_statusList = Arrays.asList(category_status);
            return this;
        }

        public QueryBuilder category_statusList(List<String> category_status){
            this.category_statusList = category_status;
            return this;
        }

        public QueryBuilder fetchCategory_status(){
            setFetchFields("fetchFields","category_status");
            return this;
        }

        public QueryBuilder excludeCategory_status(){
            setFetchFields("excludeFields","category_status");
            return this;
        }



        public QueryBuilder fuzzyCategory_reservedField1 (List<String> fuzzyCategory_reservedField1){
            this.fuzzyCategory_reservedField1 = fuzzyCategory_reservedField1;
            return this;
        }

        public QueryBuilder fuzzyCategory_reservedField1 (String ... fuzzyCategory_reservedField1){
            this.fuzzyCategory_reservedField1 = Arrays.asList(fuzzyCategory_reservedField1);
            return this;
        }

        public QueryBuilder rightFuzzyCategory_reservedField1 (List<String> rightFuzzyCategory_reservedField1){
            this.rightFuzzyCategory_reservedField1 = rightFuzzyCategory_reservedField1;
            return this;
        }

        public QueryBuilder rightFuzzyCategory_reservedField1 (String ... rightFuzzyCategory_reservedField1){
            this.rightFuzzyCategory_reservedField1 = Arrays.asList(rightFuzzyCategory_reservedField1);
            return this;
        }

        public QueryBuilder category_reservedField1(String category_reservedField1){
            setCategory_reservedField1(category_reservedField1);
            return this;
        }

        public QueryBuilder category_reservedField1List(String ... category_reservedField1){
            this.category_reservedField1List = Arrays.asList(category_reservedField1);
            return this;
        }

        public QueryBuilder category_reservedField1List(List<String> category_reservedField1){
            this.category_reservedField1List = category_reservedField1;
            return this;
        }

        public QueryBuilder fetchCategory_reservedField1(){
            setFetchFields("fetchFields","category_reservedField1");
            return this;
        }

        public QueryBuilder excludeCategory_reservedField1(){
            setFetchFields("excludeFields","category_reservedField1");
            return this;
        }



        public QueryBuilder fuzzyCategory_reservedField2 (List<String> fuzzyCategory_reservedField2){
            this.fuzzyCategory_reservedField2 = fuzzyCategory_reservedField2;
            return this;
        }

        public QueryBuilder fuzzyCategory_reservedField2 (String ... fuzzyCategory_reservedField2){
            this.fuzzyCategory_reservedField2 = Arrays.asList(fuzzyCategory_reservedField2);
            return this;
        }

        public QueryBuilder rightFuzzyCategory_reservedField2 (List<String> rightFuzzyCategory_reservedField2){
            this.rightFuzzyCategory_reservedField2 = rightFuzzyCategory_reservedField2;
            return this;
        }

        public QueryBuilder rightFuzzyCategory_reservedField2 (String ... rightFuzzyCategory_reservedField2){
            this.rightFuzzyCategory_reservedField2 = Arrays.asList(rightFuzzyCategory_reservedField2);
            return this;
        }

        public QueryBuilder category_reservedField2(String category_reservedField2){
            setCategory_reservedField2(category_reservedField2);
            return this;
        }

        public QueryBuilder category_reservedField2List(String ... category_reservedField2){
            this.category_reservedField2List = Arrays.asList(category_reservedField2);
            return this;
        }

        public QueryBuilder category_reservedField2List(List<String> category_reservedField2){
            this.category_reservedField2List = category_reservedField2;
            return this;
        }

        public QueryBuilder fetchCategory_reservedField2(){
            setFetchFields("fetchFields","category_reservedField2");
            return this;
        }

        public QueryBuilder excludeCategory_reservedField2(){
            setFetchFields("excludeFields","category_reservedField2");
            return this;
        }



        public QueryBuilder fuzzyCategory_reservedField3 (List<String> fuzzyCategory_reservedField3){
            this.fuzzyCategory_reservedField3 = fuzzyCategory_reservedField3;
            return this;
        }

        public QueryBuilder fuzzyCategory_reservedField3 (String ... fuzzyCategory_reservedField3){
            this.fuzzyCategory_reservedField3 = Arrays.asList(fuzzyCategory_reservedField3);
            return this;
        }

        public QueryBuilder rightFuzzyCategory_reservedField3 (List<String> rightFuzzyCategory_reservedField3){
            this.rightFuzzyCategory_reservedField3 = rightFuzzyCategory_reservedField3;
            return this;
        }

        public QueryBuilder rightFuzzyCategory_reservedField3 (String ... rightFuzzyCategory_reservedField3){
            this.rightFuzzyCategory_reservedField3 = Arrays.asList(rightFuzzyCategory_reservedField3);
            return this;
        }

        public QueryBuilder category_reservedField3(String category_reservedField3){
            setCategory_reservedField3(category_reservedField3);
            return this;
        }

        public QueryBuilder category_reservedField3List(String ... category_reservedField3){
            this.category_reservedField3List = Arrays.asList(category_reservedField3);
            return this;
        }

        public QueryBuilder category_reservedField3List(List<String> category_reservedField3){
            this.category_reservedField3List = category_reservedField3;
            return this;
        }

        public QueryBuilder fetchCategory_reservedField3(){
            setFetchFields("fetchFields","category_reservedField3");
            return this;
        }

        public QueryBuilder excludeCategory_reservedField3(){
            setFetchFields("excludeFields","category_reservedField3");
            return this;
        }



        public QueryBuilder fuzzyCategory_reservedField4 (List<String> fuzzyCategory_reservedField4){
            this.fuzzyCategory_reservedField4 = fuzzyCategory_reservedField4;
            return this;
        }

        public QueryBuilder fuzzyCategory_reservedField4 (String ... fuzzyCategory_reservedField4){
            this.fuzzyCategory_reservedField4 = Arrays.asList(fuzzyCategory_reservedField4);
            return this;
        }

        public QueryBuilder rightFuzzyCategory_reservedField4 (List<String> rightFuzzyCategory_reservedField4){
            this.rightFuzzyCategory_reservedField4 = rightFuzzyCategory_reservedField4;
            return this;
        }

        public QueryBuilder rightFuzzyCategory_reservedField4 (String ... rightFuzzyCategory_reservedField4){
            this.rightFuzzyCategory_reservedField4 = Arrays.asList(rightFuzzyCategory_reservedField4);
            return this;
        }

        public QueryBuilder category_reservedField4(String category_reservedField4){
            setCategory_reservedField4(category_reservedField4);
            return this;
        }

        public QueryBuilder category_reservedField4List(String ... category_reservedField4){
            this.category_reservedField4List = Arrays.asList(category_reservedField4);
            return this;
        }

        public QueryBuilder category_reservedField4List(List<String> category_reservedField4){
            this.category_reservedField4List = category_reservedField4;
            return this;
        }

        public QueryBuilder fetchCategory_reservedField4(){
            setFetchFields("fetchFields","category_reservedField4");
            return this;
        }

        public QueryBuilder excludeCategory_reservedField4(){
            setFetchFields("excludeFields","category_reservedField4");
            return this;
        }



        public QueryBuilder fuzzyCategory_reservedField5 (List<String> fuzzyCategory_reservedField5){
            this.fuzzyCategory_reservedField5 = fuzzyCategory_reservedField5;
            return this;
        }

        public QueryBuilder fuzzyCategory_reservedField5 (String ... fuzzyCategory_reservedField5){
            this.fuzzyCategory_reservedField5 = Arrays.asList(fuzzyCategory_reservedField5);
            return this;
        }

        public QueryBuilder rightFuzzyCategory_reservedField5 (List<String> rightFuzzyCategory_reservedField5){
            this.rightFuzzyCategory_reservedField5 = rightFuzzyCategory_reservedField5;
            return this;
        }

        public QueryBuilder rightFuzzyCategory_reservedField5 (String ... rightFuzzyCategory_reservedField5){
            this.rightFuzzyCategory_reservedField5 = Arrays.asList(rightFuzzyCategory_reservedField5);
            return this;
        }

        public QueryBuilder category_reservedField5(String category_reservedField5){
            setCategory_reservedField5(category_reservedField5);
            return this;
        }

        public QueryBuilder category_reservedField5List(String ... category_reservedField5){
            this.category_reservedField5List = Arrays.asList(category_reservedField5);
            return this;
        }

        public QueryBuilder category_reservedField5List(List<String> category_reservedField5){
            this.category_reservedField5List = category_reservedField5;
            return this;
        }

        public QueryBuilder fetchCategory_reservedField5(){
            setFetchFields("fetchFields","category_reservedField5");
            return this;
        }

        public QueryBuilder excludeCategory_reservedField5(){
            setFetchFields("excludeFields","category_reservedField5");
            return this;
        }



        public QueryBuilder fuzzyCategory_reservedField6 (List<String> fuzzyCategory_reservedField6){
            this.fuzzyCategory_reservedField6 = fuzzyCategory_reservedField6;
            return this;
        }

        public QueryBuilder fuzzyCategory_reservedField6 (String ... fuzzyCategory_reservedField6){
            this.fuzzyCategory_reservedField6 = Arrays.asList(fuzzyCategory_reservedField6);
            return this;
        }

        public QueryBuilder rightFuzzyCategory_reservedField6 (List<String> rightFuzzyCategory_reservedField6){
            this.rightFuzzyCategory_reservedField6 = rightFuzzyCategory_reservedField6;
            return this;
        }

        public QueryBuilder rightFuzzyCategory_reservedField6 (String ... rightFuzzyCategory_reservedField6){
            this.rightFuzzyCategory_reservedField6 = Arrays.asList(rightFuzzyCategory_reservedField6);
            return this;
        }

        public QueryBuilder category_reservedField6(String category_reservedField6){
            setCategory_reservedField6(category_reservedField6);
            return this;
        }

        public QueryBuilder category_reservedField6List(String ... category_reservedField6){
            this.category_reservedField6List = Arrays.asList(category_reservedField6);
            return this;
        }

        public QueryBuilder category_reservedField6List(List<String> category_reservedField6){
            this.category_reservedField6List = category_reservedField6;
            return this;
        }

        public QueryBuilder fetchCategory_reservedField6(){
            setFetchFields("fetchFields","category_reservedField6");
            return this;
        }

        public QueryBuilder excludeCategory_reservedField6(){
            setFetchFields("excludeFields","category_reservedField6");
            return this;
        }



        public QueryBuilder fuzzyCategory_reservedField7 (List<String> fuzzyCategory_reservedField7){
            this.fuzzyCategory_reservedField7 = fuzzyCategory_reservedField7;
            return this;
        }

        public QueryBuilder fuzzyCategory_reservedField7 (String ... fuzzyCategory_reservedField7){
            this.fuzzyCategory_reservedField7 = Arrays.asList(fuzzyCategory_reservedField7);
            return this;
        }

        public QueryBuilder rightFuzzyCategory_reservedField7 (List<String> rightFuzzyCategory_reservedField7){
            this.rightFuzzyCategory_reservedField7 = rightFuzzyCategory_reservedField7;
            return this;
        }

        public QueryBuilder rightFuzzyCategory_reservedField7 (String ... rightFuzzyCategory_reservedField7){
            this.rightFuzzyCategory_reservedField7 = Arrays.asList(rightFuzzyCategory_reservedField7);
            return this;
        }

        public QueryBuilder category_reservedField7(String category_reservedField7){
            setCategory_reservedField7(category_reservedField7);
            return this;
        }

        public QueryBuilder category_reservedField7List(String ... category_reservedField7){
            this.category_reservedField7List = Arrays.asList(category_reservedField7);
            return this;
        }

        public QueryBuilder category_reservedField7List(List<String> category_reservedField7){
            this.category_reservedField7List = category_reservedField7;
            return this;
        }

        public QueryBuilder fetchCategory_reservedField7(){
            setFetchFields("fetchFields","category_reservedField7");
            return this;
        }

        public QueryBuilder excludeCategory_reservedField7(){
            setFetchFields("excludeFields","category_reservedField7");
            return this;
        }



        public QueryBuilder fuzzyCategory_reservedField8 (List<String> fuzzyCategory_reservedField8){
            this.fuzzyCategory_reservedField8 = fuzzyCategory_reservedField8;
            return this;
        }

        public QueryBuilder fuzzyCategory_reservedField8 (String ... fuzzyCategory_reservedField8){
            this.fuzzyCategory_reservedField8 = Arrays.asList(fuzzyCategory_reservedField8);
            return this;
        }

        public QueryBuilder rightFuzzyCategory_reservedField8 (List<String> rightFuzzyCategory_reservedField8){
            this.rightFuzzyCategory_reservedField8 = rightFuzzyCategory_reservedField8;
            return this;
        }

        public QueryBuilder rightFuzzyCategory_reservedField8 (String ... rightFuzzyCategory_reservedField8){
            this.rightFuzzyCategory_reservedField8 = Arrays.asList(rightFuzzyCategory_reservedField8);
            return this;
        }

        public QueryBuilder category_reservedField8(String category_reservedField8){
            setCategory_reservedField8(category_reservedField8);
            return this;
        }

        public QueryBuilder category_reservedField8List(String ... category_reservedField8){
            this.category_reservedField8List = Arrays.asList(category_reservedField8);
            return this;
        }

        public QueryBuilder category_reservedField8List(List<String> category_reservedField8){
            this.category_reservedField8List = category_reservedField8;
            return this;
        }

        public QueryBuilder fetchCategory_reservedField8(){
            setFetchFields("fetchFields","category_reservedField8");
            return this;
        }

        public QueryBuilder excludeCategory_reservedField8(){
            setFetchFields("excludeFields","category_reservedField8");
            return this;
        }



        public QueryBuilder fuzzyCategory_reservedField9 (List<String> fuzzyCategory_reservedField9){
            this.fuzzyCategory_reservedField9 = fuzzyCategory_reservedField9;
            return this;
        }

        public QueryBuilder fuzzyCategory_reservedField9 (String ... fuzzyCategory_reservedField9){
            this.fuzzyCategory_reservedField9 = Arrays.asList(fuzzyCategory_reservedField9);
            return this;
        }

        public QueryBuilder rightFuzzyCategory_reservedField9 (List<String> rightFuzzyCategory_reservedField9){
            this.rightFuzzyCategory_reservedField9 = rightFuzzyCategory_reservedField9;
            return this;
        }

        public QueryBuilder rightFuzzyCategory_reservedField9 (String ... rightFuzzyCategory_reservedField9){
            this.rightFuzzyCategory_reservedField9 = Arrays.asList(rightFuzzyCategory_reservedField9);
            return this;
        }

        public QueryBuilder category_reservedField9(String category_reservedField9){
            setCategory_reservedField9(category_reservedField9);
            return this;
        }

        public QueryBuilder category_reservedField9List(String ... category_reservedField9){
            this.category_reservedField9List = Arrays.asList(category_reservedField9);
            return this;
        }

        public QueryBuilder category_reservedField9List(List<String> category_reservedField9){
            this.category_reservedField9List = category_reservedField9;
            return this;
        }

        public QueryBuilder fetchCategory_reservedField9(){
            setFetchFields("fetchFields","category_reservedField9");
            return this;
        }

        public QueryBuilder excludeCategory_reservedField9(){
            setFetchFields("excludeFields","category_reservedField9");
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

        public WmsCategory build(){
            return this;
        }
    }

}
