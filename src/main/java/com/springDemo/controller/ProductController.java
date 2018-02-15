package com.springDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

	
	@RequestMapping("/index")
	public String viewIndex() {
		System.out.println("here");
		return "productIndex";
	}
	
	@RequestMapping("/add")
	public String addProduct() {
		return "add";
	}
}
