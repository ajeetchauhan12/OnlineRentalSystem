package com.coforge.OnlineRentalSystem.service;

import java.sql.SQLException;

import com.coforge.OnlineRentalSystem.dao.AddressDao;
import com.coforge.OnlineRentalSystem.dao.AddressDaoImpl;
import com.coforge.OnlineRentalSystem.dao.CustomerDaoImpl;

public class AddressServiceImpl implements AddressService {

	AddressDao ad=null;
	public AddressServiceImpl() {
	// TODO Auto-generated constructor stub
ad=new AddressDaoImpl();
	}
	/*public void addCustomerAddress(CustomerServiceImpl csi) {
		// TODO Auto-generated method stub
		ad.addCustomerAddress(csi);
	}

	public void displayCustomerAddress() {
		// TODO Auto-generated method stub
		ad.displayCustomerAddress();
	}*/
	public void insertAddress() throws SQLException {
		// TODO Auto-generated method stub
		ad.insertAddress();
		
	}
	public void displayAllCustomerAddress() throws SQLException {
		// TODO Auto-generated method stub
		ad.displayAllCustomerAddress();
	}
	public void displayCustAddressById() throws SQLException {
		// TODO Auto-generated method stub
		ad.displayCustAddressById();
	}
	public void updateAddress() throws SQLException {
		// TODO Auto-generated method stub
		ad.updateAddress();
	}
	public void deleteCustomerAddress() throws SQLException {
		// TODO Auto-generated method stub
		ad.deleteCustomerAddress();
	}

}
