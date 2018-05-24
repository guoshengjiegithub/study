package cn.spring.dynamicproxy;

public class Interface001Impl implements Interface001 {

	@Override
	public Integer add(int i,int j) {
		return i+j;
	}

	@Override
	public Integer update(int i,int j) {
		return i*j;
	}

}
