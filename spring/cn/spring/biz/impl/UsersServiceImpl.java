package cn.spring.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.spring.biz.UsersService;
import cn.springmvc.dao.UserDao;

@Service("usersService")
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UserDao userDao;

	@Override
	public void getData() {
		System.out.println("serviceImpl");
		userDao.getData();
	}
}
