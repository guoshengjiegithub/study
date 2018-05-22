package cn.spring.bean;

import java.util.List;
import java.util.Map;


public class Users {

	private int id;
	private String name;
	private String pwd;
	private String address;
	private String emaill;
	private int age;
	private String date;
	private List<Province> province;
	private Map<Object,Province> provinceMap;
	public Map<Object, Province> getProvinceMap() {
		return provinceMap;
	}
	public void setProvinceMap(Map<Object, Province> provinceMap) {
		this.provinceMap = provinceMap;
	}
	public Users(int id, String name, String pwd, List<Province> province,
			Map<Object, Province> provinceMap) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.province = province;
		this.provinceMap = provinceMap;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	 
	 
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", pwd=" + pwd
				+ ", address=" + address + ", emaill=" + emaill + ", age="
				+ age + ", date=" + date + ", province=" + province
				+ ", provinceMap=" + provinceMap + "]";
	}
	public Users() {
		super();
	}
	public Users(int id, String name, String pwd, String address,
			String emaill, int age, String date) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.address = address;
		this.emaill = emaill;
		this.age = age;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmaill() {
		return emaill;
	}
	public void setEmaill(String emaill) {
		this.emaill = emaill;
	}
	public Users(int id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDate() {
		return date;
	}
 
	public List<Province> getProvince() {
		return province;
	}
	public Users(int id, String name, String pwd, List<Province> province) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.province = province;
	}
	public void setProvince(List<Province> province) {
		this.province = province;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
