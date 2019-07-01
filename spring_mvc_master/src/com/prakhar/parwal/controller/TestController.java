package com.prakhar.parwal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.prakhar.parwal.data.Person;

@Controller
public class TestController {

	
	@RequestMapping(value = "/test", method = RequestMethod.GET )
	public ModelAndView test(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("Request came at TestController.test()");
		Person prakhar = new Person(101, "Prakhar");
		return new ModelAndView("welcome", "personName", prakhar.getName());
	}
}
