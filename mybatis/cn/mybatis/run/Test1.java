package cn.mybatis.run;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.mybatis.bean.Users;

public class Test1 {

	
	public static void main(String[] args) {
		Reader resourceAsReader = null;
		try {
			resourceAsReader = Resources.getResourceAsReader("resources/conf.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(resourceAsReader);
		SqlSession session = sqlSessionFactory.openSession();
		List<Users> list = session.selectList("user.getById",6);
		for(Users u : list){
			System.out.println(u);
		}
		Map<Object,String> map=new HashMap();
		map.put("id", "9");
		map.put("name", "MGiNA");
		map.put("age", "33");
		map.put("address", "武汉市");
		map.put("province","3");
		session.insert("user.insert",map );
		
	}

}
