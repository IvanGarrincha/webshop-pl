package com.moose.presentationlayer.controller;

import java.util.List;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moose.domainmodel.data.products.Category;
import com.moose.domainmodel.data.user.User;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
@RequestMapping("main")
public class MainController {

	
	DataService service;

	MainController(DataService service){
		this.service = service;
		
	}
	
	@GetMapping
	public String startPage(Model model,  @AuthenticationPrincipal User user) {		
		List<Category> list = service.getCategories();
		model.addAttribute("list", list);
		model.addAttribute("user", user);
		return "index";
	}
	
	
	@RequestMapping("secured")
	public String secured() {
		log.info("secured");
		
		return "secured";
	}
	
	
//	@GetMapping
//	public String main(Model model) {
//		
//		/**
//		 * Gör CustomerRepositoryService som kodar lösenord för att logga in användare 
//		 */
//		
//		Customer customer = new Customer("ivang", "Garrido", "Bautista","password");
//		Address address = new Address("street", "city", "12345");
//		customer.setAddress(address);
//		customerRepo.save(customer);
//		
//		return "product";
//	}
	
	
//	@GetMapping
//	public String getImage(Model model) {
//
//		Image image = new Image("/images/clean-code.jpg");
//		model.addAttribute("image", image);
//		return "image";
//	}
}
