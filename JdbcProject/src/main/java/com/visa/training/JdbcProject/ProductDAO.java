package com.visa.training.JdbcProject;

import java.sql.Connection;
import java.util.List;

public class ProductDAO {
	public void save(Product p) {
		//insert
		
		try (Connection c = JdbcUtil.getConnection()){
//			String sql = "insert into product value("+p.getId()+",'"+p.getName()+"', "+p.getPrice()+" "+p.getQoh();
//			Statement s = c.createStatement();
			String psql = "insert into product(?,?,?,?)";
			PreparedStatement s = c.prepareStatement(psql);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public Product findById(int id) {
		//read based on id
		Product k = new Product();
		return k;
	}
	public List<Product> findAll(){
		//read all
	}
	public void remove(int id)
	{
		//delete
	}
	public void update(Product update) {
		
	}
	
	

}
