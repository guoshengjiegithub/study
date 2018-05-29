package cn.mybatis.bean;

import org.apache.ibatis.type.Alias;

//@Alias("user")
public class Users {
	private int id;
	public Users(int id, String name, int age, String address, Province province) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.province = province;
	}
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int id, String name, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}

	private String name;
	private int age;
	private String address;
	private Province province;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", age=" + age
				+ ", address=" + address + ", province=" + province + "]";
	}



}
