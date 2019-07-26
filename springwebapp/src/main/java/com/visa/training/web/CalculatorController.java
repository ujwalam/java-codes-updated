package com.visa.training.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {

	
	@RequestMapping("/calculate")
	public ModelAndView calculate(@RequestParam("op")String op,@RequestParam("n1")String n1,@RequestParam("n2")String n2)
	{

	        double s1 = Double.parseDouble(n1);
	        double s2 = Double.parseDouble(n2);
	        double result = 0;
	        switch(op) {
	        case "+":
	            result = s1+s2;
	            break;
	        case "-":
	            result = s1-s2;
	            break;
	        
	        case "*":
	            result = s1*s2;
	            break;
	        
	        case "/":
	            result = s1/s2;
	            break;
	        
	        }
	        String viewName = "calresult";
			Map<String,Object> attributes = new HashMap<String, Object>();
			attributes.put("result", result);
			
			return new ModelAndView(viewName, attributes);
	}
}
