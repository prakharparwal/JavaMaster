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
	public ModelAndView test(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("Execution flows comes here: TestController.test()");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("person", new Person(1));
		mv.setViewName("welcome");
		
		return mv;
	}
}
