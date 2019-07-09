package com.prakhar.parwal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;

import com.prakhar.parwal.data.Person;

@Controller
public class TestController {

	@GetMapping("/welcome")
	public String welcome(Model model) {

		model.addAttribute("person", new Person());
		return "welcome";
	}
	
	@PostMapping
	public String submitForm(@ModelAttribute("person") Person person
				) {
		
		System.out.println("Post request came");
		
		return "welcome";
	}
	
}
