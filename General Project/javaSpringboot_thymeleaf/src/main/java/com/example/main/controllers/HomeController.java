package com.example.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("name","Arunendra");
		model.addAttribute("age",28);
	    return "homepage";	
	}
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("subject",new String[] {"Maths","Science","English","Hindi","Socail Science"});
	    return "list";	
	}
	
	@RequestMapping(value="/condition",method=RequestMethod.GET)
	public String condition(Model model) {
		model.addAttribute("isActive", true);
	    return "condition";	
	}
	
	@RequestMapping(value="/switch",method=RequestMethod.GET)
	public String switchTest(Model model) {
		model.addAttribute("tmp", 2);
	    return "switchtest";	
	}
}
