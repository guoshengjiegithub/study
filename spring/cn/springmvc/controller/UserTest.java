package cn.springmvc.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.springmvc.biz.UserBiz;

public class UserTest {

	
	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("classpath:resources/spring.xml");
		UserBiz userBiz=(UserBiz) ap.getBean("userBiz");
		userBiz.getData();
	}
}
