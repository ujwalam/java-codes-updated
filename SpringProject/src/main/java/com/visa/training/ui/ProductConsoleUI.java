
package com.visa.training.ui;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.visa.training.domain.Product;
import com.visa.training.service.ProductService;
import com.visa.training.service.ProductServiceImpl;


@Component
public class ProductConsoleUI {
    
    ProductService service;
    
    
    
    public ProductService getService() {
		return service;
	}

    @Autowired  
	public void setService(ProductService service) {
		this.service = service;
	}

	public void createProductWithUI() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = kb.nextLine();
        System.out.println("Enter a price : ");
        float price = Float.parseFloat(kb.nextLine());
        System.out.println("Enter a qoh : ");
        int qoh = Integer.parseInt(kb.nextLine());
        kb.close();
        Product p = new Product(name, price, qoh);
//        System.out.println(p.toString());
//        System.out.println(p.getPrice()*p.getQoh());
        try {
            int id = service.addNewProduct(p);
            System.out.println("Created product with id : "+id);
        } catch (Exception e) {
            System.out.println("Value too low for creation");
        }
        

    }

}
