package cn.spring.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {
	
	
	private Interface001 inter = null;
	
	public DynamicProxy(Interface001 inter){
		this.inter=inter;
	}
	
	public Interface001 main() {
		ClassLoader classLoader = inter.getClass().getClassLoader();
		Class[] interfaces = new Class[] { Interface001.class };
		InvocationHandler invocationHandler = new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)throws Throwable {
				// 在转调具体目标对象之前，可以执行一些功能处理
				// 转调具体目标对象的方法
				System.out.println(method.getName());
				Object invoke = method.invoke(inter, args);
				// 在转调具体目标对象之后，可以执行一些功能处理
				return invoke;
			}
		};
		 return (Interface001) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
	}
	public static void main(String[] args) {
		Interface001 main = new DynamicProxy(new Interface001Impl()).main();
		System.out.println(main.add(1, 3));
	}
}
