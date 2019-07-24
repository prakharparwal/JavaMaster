package com.prakhar.parwal.form_master.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MasterController {

	@GetMapping(value = "/sign-up-page")
	public String signUpPage() {
		return "sign-up-page";
	}
	
	@GetMapping("/welcome") 
	public String welcome(ModelMap model) {
		return "welcome";
	}
}
