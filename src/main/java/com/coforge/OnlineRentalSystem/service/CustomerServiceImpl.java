package com.coforge.OnlineRentalSystem.service;

import java.sql.SQLException;

import com.coforge.OnlineRentalSystem.bean.Customer;
import com.coforge.OnlineRentalSystem.dao.CustomerDao;
import com.coforge.OnlineRentalSystem.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {
	CustomerDao cd=null;
	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	cd=new CustomerDaoImpl();
	}
/*
	public void addCust() {
		// TODO Auto-generated method stub
		cd.addCustomer();
	}

	public void dispCust() {
		// TODO Auto-generated method stub
		cd.displayCustomer();
	}*/
	public void insert() throws SQLException{
		cd.insert();
	}
	public void displayAllCustomer() throws SQLException{
		cd.displayAllCustomer();
	}
	public void displayByCustId() throws SQLException{
		cd.displayByCustId();
	}
	public void updateCustomer() throws SQLException{
		cd.updateCustomer();
	}
	public void deleteCustomer() throws SQLException{
		cd.deleteCustomer();
	}
	
	
	public Customer getC() {
		return cd.getC();
	}

}
