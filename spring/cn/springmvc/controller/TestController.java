package cn.springmvc.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import cn.springmvc.bean.User;

@SessionAttributes(types = { String.class })
@RestController
public class TestController {

	@RequestMapping("getView")
	public String getView(Map map) {
		System.out.println("**");
		map.put("aa", "AA112233");
		return "success";
	}

	@RequestMapping("getMav")
	public ModelAndView getMav() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("success");
		mav.addObject("aa", "AA");
		return mav;
	}

	@RequestMapping("user")
	public String getUser(User user) {
		System.out.println(user);
		return "success";
	}

	/**
	 * @ModelAttribute 在执行目标方法之前执行
	 */
	@ModelAttribute
	public void getUserData(@RequestParam(value = "id") Integer id,Map<String, Object> map) {

		if (id != null) {
			User user = new User("1", "aa", "bb", "cc");
			System.out.println("数据库中的对象" + user);
			map.put("user", user);
		}
	}

}
