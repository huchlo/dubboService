package test;
import com.dao.read.WmsBrandReadMapper;
import com.dao.read.base.WmsBrandBaseReadMapper;
import com.model.WmsBrand;
import junit.framework.TestCase;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Test extends TestCase{
    private Test1 a;
    public void testMain() throws Exception {
        SqlSession sqlSession= a.currentSession();
        WmsBrandReadMapper upp= (WmsBrandReadMapper) sqlSession.getMapper(WmsBrandReadMapper.class);
        WmsBrand user =new WmsBrand();
        //user.setBrand_id("1");
        System.out.println(user.toString());
        //user =upp.queryWmsBrand(user);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("brand_name","马");
        List<String> brand_category_id=new ArrayList<>();
        brand_category_id.add("1");
        brand_category_id.add("2");
        map.put("brand_category_id",brand_category_id);
        map.put("brand_status","1");
//        List<WmsBrand> wmsBrandList=upp.queryWmsBrand_list(map);
        List<WmsBrand> wmsBrandList=upp.queryWmsBrand(user);
        //int i=upp.queryWmsBrandCount_list(map);
        Iterator iterator=wmsBrandList.iterator();
        if(iterator.hasNext()){
            user=(WmsBrand)iterator.next();
            System.out.println(user.toString());
        }
//        System.out.println(i);
        //user= session.selectOne("com.dao.read.base.WmsBrandBaseReadMapper.queryWmsBrandLimit1",user);
       // System.out.println(wmsBrandList.toString());
        //System.out.println(user.getUsername());
        a.closeSession();
    }

}
