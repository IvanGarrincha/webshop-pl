package com.moose.presentationlayer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moose.presentationlayer.commands.LoginCommand;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class LoginController {

	
	@RequestMapping("/login")
	public String showLoginForm(Model model) {
		log.info("in login controller");
		model.addAttribute("loginCommand", new LoginCommand());
		
		return "loginForm";
	}
	
	
	
	
	@RequestMapping("logout-success")
	public String logoutUser(Model model) {
		
		return "logout-success";
	}
	
	
	@PostMapping("/checkUser")
	public String checkUser(@Valid LoginCommand command, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "loginForm";
		}
		
		
		log.info("user: "+ command.getUsername());
		log.info("password: "+ command.getPassword());
		
		
		return "redirect:main";
	}
}
