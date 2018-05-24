package cn.spring.dao.impl;

import org.springframework.stereotype.Repository;

import cn.springmvc.dao.UserDao;

@Repository("usersDao")
public class UsersDaoImpl implements UserDao{

	@Override
	public void getData() {
		System.out.println("daoImpl");
	}
	
}
