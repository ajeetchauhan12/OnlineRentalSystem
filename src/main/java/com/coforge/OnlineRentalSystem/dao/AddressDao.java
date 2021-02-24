package com.coforge.OnlineRentalSystem.dao;

import java.sql.SQLException;
import java.util.Scanner;

import com.coforge.OnlineRentalSystem.bean.Address;
import com.coforge.OnlineRentalSystem.bean.Customer;
import com.coforge.OnlineRentalSystem.service.CustomerServiceImpl;

public interface AddressDao {
/*	public void addCustomerAddress(CustomerServiceImpl cd);	
	public void displayCustomerAddress();*/
	public void insertAddress() throws SQLException;
	public void displayAllCustomerAddress() throws SQLException;
	public void displayCustAddressById() throws SQLException;
	public void updateAddress() throws SQLException;
	public void deleteCustomerAddress() throws SQLException;
	
}
