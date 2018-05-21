package cn.springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class Test {


	@RequestMapping("gg")
	public String getMav() {
		return "GGGGG";
	}
}
