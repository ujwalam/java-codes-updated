package com.visa.training.bootproject.service;

import java.util.List;

//import com.visa.training.domain.Product;
import com.visa.training.bootproject.domain.*;

public interface ProductService {
	public int addNewProduct(Product p);
	public Product findById(int id);
	public List<Product> findAll();
	public void delete(int id);

}
