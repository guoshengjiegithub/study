package cn.springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.springmvc.bean.User;

@RestController
public class Controller001 {

	@RequestMapping("test1")
	@ResponseBody
	public String get01(){
		return "test1";
	}
	
	/**
	 * http://localhost:8089/study/test3/2
	 * @param id
	 * @return
	 */
	@RequestMapping("test2/{id}")
	@ResponseBody
	public String get02(@PathVariable("id")int id){
		return "test1=="+id;
	}
	
	/**
	 * http://localhost:8089/study/test3?id=1&name=sf
	 * @param id
	 * @param name
	 * @return
	 */
	@RequestMapping("test3")
	@ResponseBody
	public String get03(@RequestParam("id")int id,@RequestParam("name")String name){
		return "test1=="+id+" ,"+name;
	}
	
	@RequestMapping("test4")
	@ResponseBody
	public String get04(User user){
		return user.toString();
	}
	
	

	@RequestMapping("test5")
	@ResponseBody
	public void get05(HttpServletRequest request,HttpServletResponse response){
			String name=request.getParameter("name");
			String age=request.getParameter("age");
			try {
				response.getWriter().print(name+", "+age);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
