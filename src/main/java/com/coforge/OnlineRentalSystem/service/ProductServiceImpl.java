package com.coforge.OnlineRentalSystem.service;

import java.sql.SQLException;

import com.coforge.OnlineRentalSystem.bean.Product;
import com.coforge.OnlineRentalSystem.dao.ProductDao;
import com.coforge.OnlineRentalSystem.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
private ProductDao pd=null;
public ProductServiceImpl() {
	// TODO Auto-generated constructor stub
pd=new ProductDaoImpl();
}
public void insertProduct() throws SQLException {
	// TODO Auto-generated method stub
	pd.insertProduct();
	
}
public void displayAllProduct() throws SQLException {
	// TODO Auto-generated method stub
	pd.displayAllProduct();
}
public void displayByProductId() throws SQLException {
	// TODO Auto-generated method stub
	pd.displayByProductId();
}
public void updateProduct() throws SQLException {
	// TODO Auto-generated method stub
	pd.updateProduct();
}
public void deleteProduct() throws SQLException {
	// TODO Auto-generated method stub
	pd.deleteProduct();
}

/*public void addProduct() {
	// TODO Auto-generated method stub
	pd.addProduct();
}

public void dispProduct() {
	// TODO Auto-generated method stub
	pd.displayProduct();
}
public Product getProduct() {
	return pd.getProduct();}*/




}
