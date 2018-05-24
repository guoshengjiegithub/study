package cn.spring.bean;

import java.util.HashMap;

/**
 * 静态工厂方法
 * @author Administrator
 *
 */
public class StaticFactoryBean {

	private static HashMap<Object, Province> sfb = new HashMap<>();

	static {
		sfb.put("aaa", new Province(111, "AAA"));
		sfb.put("bbb", new Province(222, "BBB"));
	}

	public static Province getInstance(String key) {
		return sfb.get(key);
	}

}
