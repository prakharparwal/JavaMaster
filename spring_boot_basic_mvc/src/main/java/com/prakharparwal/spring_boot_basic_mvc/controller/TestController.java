package com.prakharparwal.spring_boot_basic_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/welcome")
	public String welcome() {
		
		System.out.println("REQUEST CAME HERE: TestController.test()");
		return "welcome";
	}
}
