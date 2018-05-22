//package cn.spring.run;
//
//import junit.framework.TestCase;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import cn.spring.bean.Users;
//
//public class Application_run1 {
//
//	private ApplicationContext appc = null;
//
//	@Before
//	public void before() {
//		appc = new ClassPathXmlApplicationContext("classpath:resources/spring.xml");
//	}
//
//	@Test
//	public void test() {
//		Users users = (Users) appc.getBean("users_constructor");
//		System.out.println(users.toString());
//	}
//
//	@After
//	public void after() {
//	}
//}
