package com.manitos.xml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value={"/", "/home"}, method = RequestMethod.GET)
	public String showViewHome(Model model){
		model.addAttribute("init", "Home Controller");
		return "home";
	}
	
	
}
