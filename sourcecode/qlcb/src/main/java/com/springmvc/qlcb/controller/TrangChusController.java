package com.springmvc.qlcb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TrangChusController {
	
	@RequestMapping("/login")
	public String doLogin(){
		return "/login/login";
	}
	
	@RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
	public String homePage() {
		return "redirect:/create";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout() {
		return "redirect:/login";
	}
}
