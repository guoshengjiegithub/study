package cn.spring.bean;

import org.springframework.beans.factory.FactoryBean;

public class ProvinceFactoryBean implements FactoryBean<Province>{
	
	private int id;
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public Province getObject() throws Exception {
		return new Province(id,"NIHAO");
	}

	@Override
	public Class<?> getObjectType() {
		return Province.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
