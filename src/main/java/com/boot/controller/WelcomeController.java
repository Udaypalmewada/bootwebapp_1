package com.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@RequestMapping("/welcome")
	public ModelAndView homePage() {
		ModelAndView vname = new ModelAndView();
		vname.setViewName("welcome");
		return vname;
	}
}
