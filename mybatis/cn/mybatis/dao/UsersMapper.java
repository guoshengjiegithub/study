package cn.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cn.mybatis.bean.Users;

public interface UsersMapper {

//	@Select("select * from users")
	List<Users> getAll();
//	@Select("select * from users where id = #{id}")
	Users getById(Integer id);
	
	int insertUsers(Users user);
	
	int updateUsers(Users user);
	
	int deleteUsers(Integer id);
	
}
