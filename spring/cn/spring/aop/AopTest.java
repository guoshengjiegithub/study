package cn.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class AopTest {

	public int add(int i, int j) {
		int a=i/0;
		return i + j;
	}

	public int delete(int i, int j) {
		return i + j;
	}

	public int x(int i, int j) {
		return i * j;
	}
}
