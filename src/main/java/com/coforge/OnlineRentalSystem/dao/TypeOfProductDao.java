package com.coforge.OnlineRentalSystem.dao;

import java.sql.SQLException;
import java.util.Scanner;


import com.coforge.OnlineRentalSystem.bean.TypeOfProduct;
import com.coforge.OnlineRentalSystem.service.ProductService;
import com.coforge.OnlineRentalSystem.service.ProductServiceImpl;

public interface TypeOfProductDao {
/*	public void addTypeOfProduct(ProductServiceImpl psi);	
	public void displayTypeOfProduct();
	public TypeOfProduct getTypeOfProduct();*/
	public void insert() throws SQLException;
	public void displayAllProductType() throws SQLException;
	public void displayProductTypeById() throws SQLException;
	public void updateTypeOfProduct() throws SQLException;
	public void deleteTypeOfProduct() throws SQLException;
}
