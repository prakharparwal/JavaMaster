package com.prakhar.parwal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.prakhar.parwal.data.Person;

@Controller
public class TestController {

	@GetMapping("/welcome")
	public ModelAndView welcome(HttpServletRequest request, HttpServletResponse reponse) {
		
		System.out.println("Execution flow comes here: TestController.welcome()");
	
		Person prakhar = new Person(1);
		
		ModelAndView model = new ModelAndView();
		model.addObject("person", prakhar);
		
		return model;
	}
}
