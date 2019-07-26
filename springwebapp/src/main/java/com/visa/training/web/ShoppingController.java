package com.visa.training.web;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShoppingController {
	Map<String,Object> attributes = new HashMap<String, Object>();
//	HttpSession session = request.getSession();
	
	@RequestMapping("/addBooks")
	public ModelAndView shopBooks(HttpSession session, @RequestParam("books")String[] selectedBook) {
		
		session.setAttribute("selectedBook", selectedBook);
		String viewName = "carview";
//		Map<String,Object> attributes = new HashMap<String, Object>();
		attributes.put("selectedBook", selectedBook);
		
		return new ModelAndView(viewName, attributes);
	}
	
	@RequestMapping("/addCars")
	public ModelAndView shopCars(HttpSession session,@RequestParam("cars")String[] selectedCars) {
		String viewName = "bikeview";
		session.setAttribute("selectedCars", selectedCars);
//		Map<String,Object> attributes = new HashMap<String, Object>();
		attributes.put("selectedCars", selectedCars);
		
		return new ModelAndView(viewName, attributes);
		
	}
	
	@RequestMapping("/addBikes")
	public ModelAndView shopBikes(HttpSession session,@RequestParam("bikes")String[] selectedBikes) {
		
		String viewName = "cartview";
		
//		Map<String,Object> attributes = new HashMap<String, Object>();
		attributes.put("selectedBikes",selectedBikes);
		session.setAttribute("selectedBikes", selectedBikes);
		String[] selectedCars = (String[]) session.getAttribute("selectedCars");
		String[] selectedBook = (String[]) session.getAttribute("selectedBook");
		return new ModelAndView(viewName, attributes);
	}
	
}
