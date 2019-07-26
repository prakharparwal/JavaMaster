package com.prakhar.parwal.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpInterceptor {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
		
		System.out.println("Pre handler");
		return true;
	}
	
	public boolean postHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
	
		System.out.println("Post handler");
		return true;
	}
	
}
