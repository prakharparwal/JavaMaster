package com.prakhar.parwal.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.prakhar.parwal.data.Person;
import com.prakhar.parwal.exception.ErrorInFormDataException;

@Controller
public class MasterController {

	@GetMapping("/signUpPage")
	public String signUpPage(ModelMap model) {
		
		model.addAttribute("person", new Person());
		throw new NullPointerException("NPE");
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
	public String signUp(@Valid Person person, BindingResult result, ModelMap model) throws ErrorInFormDataException {
		
		System.out.println(person.getId());
		System.out.println(person.getName());
		System.out.println(person.getUsername());
		System.out.println(person.getPassword());
		System.out.println(person.getAge());
		
		if(result.hasErrors())
		{
			System.out.println("Has errors");
			throw new ErrorInFormDataException("Error in form data expception");
			//throw new NullPointerException();
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
	
	/*
	 * @ExceptionHandler(NullPointerException.class) public ModelAndView
	 * handleNullPointerException(NullPointerException npe) {
	 * 
	 * ModelAndView mv = new ModelAndView("null-pointer-exception"); System.out.
	 * println("Null pointer excpetion has encountered. Handled using exception handler"
	 * ); return mv; }
	 */
	
}
