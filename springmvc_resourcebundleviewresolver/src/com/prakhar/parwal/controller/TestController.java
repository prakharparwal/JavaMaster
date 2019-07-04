package com.prakhar.parwal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.prakhar.parwal.data.Person;

@Controller
public class TestController {

	@GetMapping("/welcome")
	public String test(ModelMap model) {

		Person prakhar = new Person(1);
		model.addAttribute("person", prakhar);
		
		System.out.println("Execution flow comes here: TestContoller.test()");
		return "welcome";
	}
}
