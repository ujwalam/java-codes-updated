package com.visa.training.bootproject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import com.visa.training.bootproject.dal.ProductDAO;
//import com.visa.training.bootproject.dal.ProductDAOMemoryImpl;
import com.visa.training.bootproject.service.ProductService;
import com.visa.training.bootproject.service.ProductServiceImpl;
//import com.visa.training.bootproject.ui.ProductConsoleUI;

@Configuration
@ComponentScan(basePackages = "com.visa.training")
public class ProductAppConfiguration {
	
//	@Bean
//	public ProductDAO dao() {
//		
//		return new ProductDAOMemoryImpl();
//	}
//	
//	@Bean
//	public ProductService service() {
//		ProductServiceImpl service = new ProductServiceImpl();
//		service.setDao(dao());
//		return service;
//	}
//	
//	
//	@Bean
//    public ProductConsoleUI ui() {
//        ProductConsoleUI ui = new ProductConsoleUI();
//        ui.setService(service());
//        return ui;
//    }
	
	
	

}
