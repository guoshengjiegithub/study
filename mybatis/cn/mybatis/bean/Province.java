package cn.mybatis.bean;

public class Province {

	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String province;
	public String getProvince() {
		return province;
	}
	public Province(int id) {
		super();
		this.id = id;
	}
	@Override
	public String toString() {
		return "Province [id=" + id + ", province=" + province + "]";
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public Province(int id, String province) {
		super();
		this.id = id;
		this.province = province;
	}
	public Province(String province) {
		super();
		this.province = province;
	}
	public Province() {
		super();
		// TODO Auto-generated constructor stub
	}
}
