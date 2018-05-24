package cn.spring.bean;

import java.util.HashMap;

/**
 * 实例工厂方法
 * @author Administrator
 *
 */
public class InstanceFactoryBean {

	private  HashMap<Object, Province> sfb=null;

	public InstanceFactoryBean() {
		sfb=new HashMap<>();
		sfb.put("aaa", new Province(111, "AAA"));
		sfb.put("bbb", new Province(222, "BBB"));
	}
	
	public Province getInstance(String key){
		return sfb.get(key);
	}
	

}
