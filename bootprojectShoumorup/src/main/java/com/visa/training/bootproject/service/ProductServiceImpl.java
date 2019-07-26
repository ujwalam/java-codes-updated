package com.visa.training.bootproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.visa.training.bootproject.dal.ProductDAO;
import com.visa.training.bootproject.dal.ProductRepository;
import com.visa.training.bootproject.domain.Product;

@Service
public class ProductServiceImpl implements ProductService{

	ProductRepository dao;
	
	@Autowired
	public void setDao(ProductRepository dao) {
		this.dao = dao;
	}
	
	
	@Override
	public int addNewProduct(Product p) {
		int id = 0;
//		System.out.println("in service:"+ p.getPrice()*p.getQoh());
        if((p.getPrice() * p.getQoh()) >= 10000) {
            Product created = dao.save(p);
            id = created.getId();
        }else {
        	System.out.println("exception thrown");
            throw new IllegalArgumentException("min value of stock should be at least 10k");
        }
        return id;
	}


	public ProductRepository getDao() {
		return dao;
	}


	@Override
	public Product findById(int id) {
		
		return dao.findById(id);
	}

	@Override
	public List<Product> findAll() {
		return dao.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Product p = dao.findById(id);
		if(p.getPrice()*p.getQoh()>1000) {
			throw new IllegalArgumentException();
		}else {
			dao.deleteById(id);
		}
	}

}
