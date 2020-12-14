package com.moose.presentationlayer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.moose.presentationlayer.commands.CheckoutCommand;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class CheckoutController {

	@RequestMapping("checkout")
	public String checkoutForm(Model model) {
		log.info("in first checkout");
		model.addAttribute("checkoutCommand", new CheckoutCommand());
		
		return "checkoutForm";
	}
	
	
	
	@RequestMapping(value = "doCheckout", method=RequestMethod.POST)
	public String doCheckout(@Valid CheckoutCommand command, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {			
			return "checkoutForm";
		}
		
		log.info("user firstname: "+ command.getFirstname());
		
		
		return "checkoutComplete";
	}
}