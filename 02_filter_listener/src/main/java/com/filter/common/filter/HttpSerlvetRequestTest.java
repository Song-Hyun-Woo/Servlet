package com.filter.common.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class HttpSerlvetRequestTest 
	extends HttpServletRequestWrapper{
	//HttpServletRequest객체의 매소드를 재정의 할 수 있음
	//반드시 매개변수있는 생성자를 선언하고
	//생성자에서 반드시 매개변수로 받은 값을 부모클래스 생성자의 매개변수로 넣어줘야함.
	public HttpSerlvetRequestTest(HttpServletRequest request) {
		super(request);
	}
	
	@Override
	public String getParameter(String name) {
		if(name.equals("msg"))
			return super.getParameter(name)+"-bs-";
		else
			return super.getParameter(name)+"-dm-";
	}
	
	
	
}
