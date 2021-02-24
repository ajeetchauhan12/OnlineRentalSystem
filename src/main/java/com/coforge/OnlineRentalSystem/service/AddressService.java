package com.coforge.OnlineRentalSystem.service;

import java.sql.SQLException;

import com.coforge.OnlineRentalSystem.dao.CustomerDaoImpl;

public interface AddressService {/*
	public void addCustomerAddress(CustomerServiceImpl csi);	
	public void displayCustomerAddress();*/

	public void insertAddress() throws SQLException;
	public void displayAllCustomerAddress() throws SQLException;
	public void displayCustAddressById() throws SQLException;
	public void updateAddress() throws SQLException;
	public void deleteCustomerAddress() throws SQLException;
}
