package cn.springmvc.view;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

@Component
public class HellowView implements View{

	@Override
	public String getContentType() {
		return "text/html";
	}

	@Override
	public void render(Map<String, ?> model, HttpServletRequest request,HttpServletResponse response) throws Exception {
		response.getWriter().print("view test"+new Date());
	}

}
