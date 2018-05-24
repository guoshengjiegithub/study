package cn.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathAop =  new ClassPathXmlApplicationContext("classpath:resources/aop-spring.xml");
		AopTest aop = (AopTest) classPathAop.getBean("aopTest");
		System.out.println(aop.add(1, 8));
	}
}
