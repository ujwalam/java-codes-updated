package com.visa.training.bootproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.visa.training.bootproject.ui.ProductConsoleUI;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ProductConsoleUI p = new ProductConsoleUI();
//		p.createProductWithUI();
		
		Class[] configs = {ProductAppConfiguration.class,PersistenceJPAConfiguration.class};
        ApplicationContext springContainer 
        = new AnnotationConfigApplicationContext(configs);
		
//		ProductConsoleUI ui = springContainer.getBean(ProductConsoleUI.class);
//		ui.createProductWithUI();

	}

}
