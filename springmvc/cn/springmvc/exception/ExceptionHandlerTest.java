package cn.springmvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandlerTest {

	@ExceptionHandler({ ArithmeticException.class })
	public ModelAndView get13(Exception ex) {
		ModelAndView adv = new ModelAndView("error");
		adv.addObject("exception", ex);
		System.out.println("==出现异常" + ex);
		return adv;
	}
}
