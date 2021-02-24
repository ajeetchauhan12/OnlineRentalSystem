package com.coforge.OnlineRentalSystem.bean;

public class Product {
private int Product_id;
private String Product_name;
public Product() {
	// TODO Auto-generated constructor stub
}
public Product(int product_id, String product_name) {
	Product_id = product_id;
	Product_name = product_name;
}
public int getProduct_id() {
	return Product_id;
}
public void setProduct_id(int product_id) {
	Product_id = product_id;
}
public String getProduct_name() {
	return Product_name;
}
public void setProduct_name(String product_name) {
	Product_name = product_name;
}

}
