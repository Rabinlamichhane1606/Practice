package com.springDemo.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/product")
	public String hello(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Here");
		/*ModelAndView mv=new ModelAndView();
		mv.setViewName("hello-world");*/
		return "productIndex";
	}
}