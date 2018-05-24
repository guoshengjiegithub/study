package cn.springmvc.bean;

import org.springframework.stereotype.Component;

@Component
public class User {

	private String id;
	private String name;
	private String address;
	private String email;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User(String id, String name, String address, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address
				+ ", email=" + email + "]";
	}

}
