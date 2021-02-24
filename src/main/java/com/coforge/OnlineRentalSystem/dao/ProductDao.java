package com.coforge.OnlineRentalSystem.dao;

import java.sql.SQLException;
import java.util.Scanner;

import com.coforge.OnlineRentalSystem.bean.Product;

public interface ProductDao {
	/*public void addProduct();
	public void displayProduct();
	public Product getProduct();*/
	public void insertProduct() throws SQLException;
	public void displayAllProduct() throws SQLException;
	public void displayByProductId() throws SQLException;
	public void updateProduct() throws SQLException;
	public void deleteProduct() throws SQLException;


}
