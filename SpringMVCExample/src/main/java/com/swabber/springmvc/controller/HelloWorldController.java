package com.swabber.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping("helloworld")
	public ModelAndView hello() {
		String helloWorldMessage = "Hello world from spring mvc example!";
		// This constructor is convenient for single model object :
		// new ModelAndView(viewName, modelName, helloWorldMessage)
		return new ModelAndView("hello", "message", helloWorldMessage);
	}
	
}
