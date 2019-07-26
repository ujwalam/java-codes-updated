package com.visa.training.jpa.app;

import com.visa.training.jpa.domain.dal.JpaProductDAO;

import java.util.List;

import com.visa.training.jpa.domain.Product;

public class ProductJpaApp {

    public static void main(String[] args) {
        JpaProductDAO dao = new JpaProductDAO();
//        Product test = new Product("hibernate", 99, 1000);
//        Product saved = dao.save(test);
//        System.out.println(saved);
//        //test findById
//        Product fromDB = dao.findById(0);
//        System.out.println("FromDB : "+fromDB);
//        //test update
//        fromDB.setPrice(fromDB.getPrice()+10);
//        dao.update(fromDB);
//        Product updated = dao.findById(fromDB.getId());
//        System.out.println("Updated : "+updated);
//        //test remove
//        dao.remove(fromDB);
//        Product removed = dao.findById(fromDB.getId());
//        System.out.println("Removed : "+removed);        
//        System.exit(0);
        List<Product> all = dao.findAll();
        all.forEach(System.out::println );

    }

}