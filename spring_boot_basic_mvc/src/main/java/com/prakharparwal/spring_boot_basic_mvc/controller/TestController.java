package com.prakharparwal.spring_boot_basic_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.prakharparwal.spring_boot_basic_mvc.data.Person;

@Controller
public class TestController {

	@GetMapping("/welcome")
	public String welcome(ModelMap model) {
		
		Person prakhar = new Person(1, "Prakhar Parwal");
		model.addAttribute("person", prakhar);
		model.put("person1", prakhar);

		System.out.println("REQUEST CAME HERE: TestController.test()");
		return "welcome";
	}
}
