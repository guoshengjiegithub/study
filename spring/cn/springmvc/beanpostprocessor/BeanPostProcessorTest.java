package cn.springmvc.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
/**
 * BeanPostProcessor接口作用是：如果我们需要在Spring容器完成Bean的实例化、
 * 配置和其他的初始化前后添加一些自己的逻辑处理，我们就可以定义一个或者多个BeanPostProcessor接口的实现，然后注册到容器中。
 * @author GUOSHENGJIE
 *
 */
public class BeanPostProcessorTest implements BeanPostProcessor{

	public Object postProcessAfterInitialization(Object arg0, String arg1)throws BeansException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object postProcessBeforeInitialization(Object arg0, String arg1)throws BeansException {
	System.out.println("*(");
		return null;
	}

}


