package com.prakhar.parwal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MasterController {

	@GetMapping("/signUpPage")
	public String signUp(ModelMap model) {
		
		return "sign-up";
	}
	
	@GetMapping("/")
	public String welcome() {
		return "welcome";
	}
	
	@GetMapping("/logIn")
	public String logIn() {
		
		return "log-in";
	}
}
