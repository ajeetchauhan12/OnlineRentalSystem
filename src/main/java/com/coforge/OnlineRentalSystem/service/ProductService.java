package com.coforge.OnlineRentalSystem.service;

import java.sql.SQLException;

import com.coforge.OnlineRentalSystem.bean.Product;

public interface ProductService {

/*public void addProduct();
public void dispProduct();
public Product getProduct();*/
	public void insertProduct() throws SQLException;
	public void displayAllProduct() throws SQLException;
	public void displayByProductId() throws SQLException;
	public void updateProduct() throws SQLException;
	public void deleteProduct() throws SQLException;

}
