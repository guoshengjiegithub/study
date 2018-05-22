package cn.springmvc.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springmvc.biz.UserBiz;
import cn.springmvc.dao.UserDao;

@Service("userBiz")
public class UserBizImpl implements UserBiz {

	@Autowired
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void getData() {
		userDao.getData();
		System.out.println("userBiz");
	}
}
