package com.coforge.OnlineRentalSystem.dao;

import java.sql.SQLException;
import java.util.Scanner;

import com.coforge.OnlineRentalSystem.bean.Customer;

public interface CustomerDao {
	/*public void addCustomer();
	public void displayCustomer();*/
	public void insert() throws SQLException;
	public void displayAllCustomer() throws SQLException;
	public void displayByCustId() throws SQLException;
	public void updateCustomer() throws SQLException;
	public void deleteCustomer() throws SQLException;
	public Customer getC();
}
