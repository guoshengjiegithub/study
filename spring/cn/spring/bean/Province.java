package cn.spring.bean;

public class Province {

	private int id;
	private String province;
	public Province(int id, String province) {
		super();
		this.id = id;
		this.province = province;
	}
	public Province() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public Province(String province) {
		super();
		this.province = province;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	@Override
	public String toString() {
		return "Province [id=" + id + ", province=" + province + "]";
	}
	
}
