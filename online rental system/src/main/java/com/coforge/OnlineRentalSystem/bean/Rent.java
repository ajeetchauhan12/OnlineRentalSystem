package com.coforge.OnlineRentalSystem.bean;

public class Rent {
	private int Customer_id;
	private int Rent_id;
	private int Product_id;
	private int No_of_days;
	private int Product_quantity;
	private Customer c;
	private Product p;
	public Rent() {
		// TODO Auto-generated constructor stub
	}
	public Rent(int customer_id, int rent_id, int product_id, int no_of_days, int product_quantity) {
		Customer_id = customer_id;
		Rent_id = rent_id;
		Product_id = product_id;
		No_of_days = no_of_days;
		Product_quantity = product_quantity;
	}
	public int getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(Customer c) {
		Customer_id =c.getCustomer_id();
	}
	public int getRent_id() {
		return Rent_id;
	}
	public void setRent_id(int rent_id) {
		Rent_id = rent_id;
	}
	public int getProduct_id() {
		return Product_id;
	}
	public void setProduct_id(Product p) {
		Product_id =p.getProduct_id();
	}
	public int getNo_of_days() {
		return No_of_days;
	}
	public void setNo_of_days(int no_of_days) {
		No_of_days = no_of_days;
	}
	public int getProduct_quantity() {
		return Product_quantity;
	}
	public void setProduct_quantity(int product_quantity) {
		Product_quantity = product_quantity;
	}
	

}
