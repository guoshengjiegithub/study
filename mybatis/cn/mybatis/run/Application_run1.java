package cn.mybatis.run;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cn.mybatis.bean.Province;
import cn.mybatis.bean.Users;
import cn.mybatis.dao.ProvinceMapper;
import cn.mybatis.dao.UsersMapper;

public class Application_run1 {

	private SqlSessionFactory sqlSessionFactory=null;
	private SqlSession sqlSession=null;
	@Before
	public void before() throws IOException {
		sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("resources/conf.xml"));
		sqlSession=sqlSessionFactory.openSession();
	}

	@Test
	public void test() {
		UsersMapper usersDao = sqlSession.getMapper(UsersMapper.class);
		Users users= usersDao.getById(3);
		System.out.println(users);
	}
	

	@Test
	public void test1() {
		Users user = sqlSession.selectOne("cn.mybatis.dao.UsersMapper.getById",3);
	System.out.println(user.toString());
	}
	
	@Test
	public void testInterface() {
		UsersMapper usersDao = sqlSession.getMapper(UsersMapper.class);
		List<Users> list = usersDao.getAll();
		for(Users u : list){
			System.out.println(u);
		}
	}
	
	@Test
	public void testinsert() {
		ProvinceMapper pro = sqlSession.getMapper(ProvinceMapper.class);
		Province province = new Province(0,"河北");
		 int insert = pro.insert(province);
		 System.out.println(province);
	}
	
	@Test
	public void testupdate() {
		ProvinceMapper pro = sqlSession.getMapper(ProvinceMapper.class);
		 int insert = pro.update(new Province(12,"河西"));
		 System.out.println(insert);
	}
	
	@Test
	public void testdelete() {
		ProvinceMapper pro = sqlSession.getMapper(ProvinceMapper.class);
		 int insert = pro.delete(12);
		 System.out.println(insert);
	}



	@After
	public void after() {
		sqlSession.commit();
		sqlSession.close();
	}
}
