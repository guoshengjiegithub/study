package cn.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.mybatis.bean.Province;
import cn.mybatis.bean.Users;

public interface ProvinceMapper {

	List<Users> getAll();
	Users getById(Integer id);
	
	int insert(Province p);
	
	int update(Province p);
	
	int delete(Integer id);
	
}
