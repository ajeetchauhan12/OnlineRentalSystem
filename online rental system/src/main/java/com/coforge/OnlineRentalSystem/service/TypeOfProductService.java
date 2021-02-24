package com.coforge.OnlineRentalSystem.service;

import java.sql.SQLException;

import com.coforge.OnlineRentalSystem.bean.TypeOfProduct;

public interface TypeOfProductService {
	/*public void addTypeOfProduct(ProductServiceImpl psi);	
	public void displayTypeOfProduct();
	public TypeOfProduct getTypeOfProduct();*/
	public void insert() throws SQLException;
	public void displayAllProductType() throws SQLException;
	public void displayProductTypeById() throws SQLException;
	public void updateTypeOfProduct() throws SQLException;
	public void deleteTypeOfProduct() throws SQLException;
}
