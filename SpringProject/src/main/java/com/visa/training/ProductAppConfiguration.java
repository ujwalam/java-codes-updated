package com.visa.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.visa.training.dal.ProductDAO;
import com.visa.training.dal.ProductDAOMemoryImpl;
import com.visa.training.service.ProductService;
import com.visa.training.service.ProductServiceImpl;
import com.visa.training.ui.ProductConsoleUI;

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
