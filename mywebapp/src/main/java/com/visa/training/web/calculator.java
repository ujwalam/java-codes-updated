package com.visa.training.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CalculatorServlet", urlPatterns = { "/CalculatorServlet" })
public class calculator extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1 = request.getParameter("n1");
		String s2 = request.getParameter("n2");
		 String op = request.getParameter("op");
	        double n1 = Double.parseDouble(s1);
	        double n2 = Double.parseDouble(s2);
	        double result = 0;
	        switch(op) {
	        case "+":
	            result = n1+n2;
	            break;
	        case "-":
	            result = n1-n2;
	            break;
	        
	        case "*":
	            result = n1*n2;
	            break;
	        
	        case "/":
	            result = n1/n2;
	            break;
	        
	        }
//		PrintWriter out = response.getWriter();
//		out.println(n1+" "+op+" "+n2+" = "+result);
	        request.setAttribute("result", result);
	        request.getRequestDispatcher("calresult.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
