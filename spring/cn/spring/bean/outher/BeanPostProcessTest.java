package cn.spring.bean.outher;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessTest implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)throws BeansException {
		System.out.println("after"+beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)throws BeansException {
		System.out.println("before"+beanName);
		return bean;
	}

	
}
