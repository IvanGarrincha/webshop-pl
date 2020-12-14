package com.moose.presentationlayer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moose.domainmodel.data.products.Book;
import com.moose.domainmodel.data.products.Image;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
@RequestMapping("/product/{isbn}")
public class ProductController {

	
	@Autowired
	DataService service;
	
	
	@GetMapping
	public String getProduct(@PathVariable String isbn, Model model) {
	
		
		log.info("isbn: "+ isbn);
		List<Book> list = service.getBooks();
		Optional<Book> book2 = service.findBookByIsbn(isbn);
		Book book = null;
		if(book2.isPresent()) {
			log.info("book found: "+ book2.get());
			book = book2.get();
		}
		else {
			book = list.get(0);
		}
		log.info("got: "+ book.getTitle());
		Image image = new Image("/images/clean-code.jpg");
		
		model.addAttribute("image", image);
		
		model.addAttribute("book", book);
		return "productView";
	}
}
