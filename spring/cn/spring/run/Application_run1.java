package cn.spring.run;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.spring.aop.AopTest;
import cn.spring.bean.Province;
import cn.spring.bean.Users;
import cn.spring.biz.UsersService;

public class Application_run1 {

	private ApplicationContext appc = null;
	private ClassPathXmlApplicationContext classPath = null;

	@Before
	public void before() {
		appc = new ClassPathXmlApplicationContext("classpath:resources/spring.xml");
		classPath = new ClassPathXmlApplicationContext("classpath:resources/spring.xml");
	}

	@Test
	public void test() {
		Users users = (Users) classPath.getBean("users_constructor");
		System.out.println(users.toString());
		classPath.close();
	}

	@Test
	public void testFactoryMethod() {
		Province province = (Province) classPath.getBean("provinceFactoryBean");
		System.out.println(province.toString());
		classPath.close();
	}
	
	@Test
	public void testInject(){
		UsersService userService = (UsersService) classPath.getBean("usersService");
		userService.getData();
	}
	
	@Test
	public void testAop(){
		ClassPathXmlApplicationContext classPathAop =  new ClassPathXmlApplicationContext("classpath:resources/aop-spring.xml");
		AopTest aop = (AopTest) classPathAop.getBean("aopTest");
		System.out.println(aop.add(1, 8));
	}


	@After
	public void after() {
	}
}
