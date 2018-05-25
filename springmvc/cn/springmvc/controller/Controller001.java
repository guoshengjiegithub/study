package cn.springmvc.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import cn.springmvc.bean.User;

//@SessionAttributes(value="sessionTest",types={String.class,Map.class})
@RestController
public class Controller001 {

	@RequestMapping("test1")
	@ResponseBody
	public String get01() {
		return "test1";
	}

	/**
	 * http://localhost:8089/study/test3/2
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("test2/{id}")
	@ResponseBody
	public String get02(@PathVariable("id") int id) {
		return "test1==" + id;
	}

	/**
	 * http://localhost:8089/study/test3?id=1&name=sf
	 * 
	 * @param id
	 * @param name
	 * @return
	 */
	@RequestMapping("test3")
	@ResponseBody
	public String get03(@RequestParam("id") int id,
			@RequestParam("name") String name) {
		return "test1==" + id + " ," + name;
	}

	@RequestMapping("test4")
	@ResponseBody
	public String get04(User user) {
		return user.toString();
	}

	@RequestMapping("test5")
	@ResponseBody
	public void get05(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		try {
			response.getWriter().print(name + ", " + age);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@RequestMapping("test6")
	public String get06() {
//		ModelAndView mav = new ModelAndView("index");
//		//将数据放到request中
//		mav.addObject("time", new Date());
		return "forward:/index.jsp";
	}
	
	@RequestMapping("test7")
	public String get07(Map<String,Object> map) {
		map.put("maptest", Arrays.asList("aa","bb"));
		return "index";
	}
	
	@RequestMapping("test8")
	public String get08(Map<String,Object> map) {
		map.put("sessionTest", Arrays.asList("aa1","bb1"));
		return "index";
	}
	
	@RequestMapping("test9")
	public String get09(Model model) {
		model.addAttribute("modelTest", "model");
		return "index";
	}
	
//	@ModelAttribute
//	public void init(@RequestParam("id") int id,@RequestParam("name") int name){
//			System.out.println(id+" , "+name);
//		System.out.println("init");
//	}
//	
//	@ModelAttribute
//	public void init2(){
//		System.out.println("init2");
//	}
	
	@ModelAttribute
	public void init3(@RequestParam(value="id",required=false) Integer id, Map<String, Object> map){
		 if(id != null){
	            //模拟从数据库中获取对象
	            User user = new User("1", "name", "address", "tom@baidu.com");
	            System.out.println("从数据库中获取一个对象: " + user);
	            map.put("user", user);
	        }
	}
	
	@RequestMapping("test10")
	public String get10( User user) {
			System.out.println(user);
		return "index";
	}
	
	@RequestMapping("test11")
	public String get11(){
		System.out.println("helloView");
		return "hellowView";
	}
	
	@RequestMapping("test12")
	public String get12(){
		System.out.println(0/0);
		return "index";
	}
	
//	@ExceptionHandler({ArithmeticException.class})
//	public String get13(Exception ex ){
//		System.out.println("出现异常"+ex);
//		return "error";
//	}
//	@ExceptionHandler({ArithmeticException.class})
//	public ModelAndView get13(Exception ex ){
//		ModelAndView adv=new ModelAndView("error");
//		adv.addObject("exception", ex);
//		System.out.println("出现异常"+ex);
//		return adv;
//	}

}
