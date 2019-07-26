package com.prakhar.parwal.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prakhar.parwal.data.Person;

@Controller
public class MasterController {

	@GetMapping("/signUpPage")
	public String signUpPage(ModelMap model) {
		
		model.addAttribute("person", new Person());
		return "sign-up";
	}
	
	@GetMapping("/")
	public String welcome() {
		return "welcome";
	}
	
	@GetMapping("/logInPage")
	public String logInPage(ModelMap model) {
		
		model.addAttribute("person", new Person());
		return "log-in";
	}
	
	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	public String signUp(@Valid Person person, BindingResult result, ModelMap model) {
		
		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getUsername());
		System.out.println(person.getPassword());
		System.out.println(person.getAge());
		
		if(result.hasErrors())
		{
			System.out.println("Has errors");
			return "sign-up";
		}
			
		else 
			System.out.print("Everything is fine");
		
		model.addAttribute("message", "SignUp successful");
		model.addAttribute("person", person);
		
		return "home";
	}
	
	
	@RequestMapping(value = "/logIn", method = RequestMethod.POST)
	public String logIn(Person person, BindingResult result) {
		
		System.out.println(person.getUsername());
		System.out.println(person.getPassword());
		
		return "home";
	}
	
	@RequestMapping(value = "/signUpSuccess", method = RequestMethod.GET)
	public String signUpSuccess(ModelMap model) {
		
		
		return "sign-up-success";
	}
	
}