package cn.spring.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
//可以使用@order进行切面的优先级,值约小优先级越高
@Aspect
@Component
public class Logger {

	//前置通知
	@Before("execution(public int cn.spring.aop.AopTest.*(int , int))")
	public void before(JoinPoint joinPoint){
		String name = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.println("方法开始执行"+name+" ,参数："+Arrays.asList(args));
	}
	//后置通知
	@Before("execution(public int cn.spring.aop.AopTest.*(int , int))")
	public void after(JoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		System.out.println("方法结束执行："+methodName);
	}
	
	@AfterThrowing(value="aa()",throwing="e")  
    public void afterThrowing(JoinPoint joinPoint, Exception e){  
        String methodName = joinPoint.getSignature().getName();  
        System.out.println("The method " + methodName + " occurs excetion:" + e);  
    }  
	
	//执行成功后通知
	@AfterReturning("execution(public int cn.spring.aop.AopTest.*(int,int))")
	public void afterReturn(JoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		System.out.println("成功执行："+methodName);
	}
	//环绕通知
	@Around(value="aa()")
	public Object arount(ProceedingJoinPoint joinPoint){
		Object proceed =null;
		try {
			String name = joinPoint.getSignature().getName();
			System.out.println("开始执行方法"+name+", arount");
			proceed = joinPoint.proceed();
			System.out.println("结束执行方法"+name+", arount");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return proceed;
	}
	
	@Pointcut("execution(public int cn.spring.aop.AopTest.*(int ,int ))")
	public void aa(){
		
	}
	
}


