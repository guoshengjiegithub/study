package cn.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TestInterceptor implements HandlerInterceptor {

	/**
	 * 执行目标方法之前
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {
			System.out.println("preHandle");
		return true;
	}

	/**
	 * 执行目标方法之后, 渲染视图之前执行
	 */
	@Override
	public void postHandle(HttpServletRequest request,HttpServletResponse response, Object handler,ModelAndView modelAndView) throws Exception {
		System.out.println("postHandle");
	}
	
	/**
	 * 渲染视图之后执行
	 */
	@Override
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response, Object handler, Exception ex)throws Exception {
		System.out.println("afterCompletion");
	}

}
