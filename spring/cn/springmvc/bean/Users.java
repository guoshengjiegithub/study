package cn.springmvc.bean;

import org.springframework.stereotype.Component;

@Component
public class Users {

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


}
