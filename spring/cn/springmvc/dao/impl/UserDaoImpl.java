package cn.springmvc.dao.impl;

import org.springframework.stereotype.Repository;

import cn.springmvc.dao.UserDao;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	public void getData() {
			System.out.println("UserDao");
	}

}
