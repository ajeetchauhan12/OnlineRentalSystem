package com.coforge.OnlineRentalSystem.service;

import java.sql.SQLException;

import com.coforge.OnlineRentalSystem.bean.Customer;

public interface CustomerService {
/*public void addCust();
public void dispCust();*/
	public void insert() throws SQLException;
	public void displayAllCustomer() throws SQLException;
	public void displayByCustId() throws SQLException;
	public void updateCustomer() throws SQLException;
	public void deleteCustomer() throws SQLException;
public Customer getC();
}
