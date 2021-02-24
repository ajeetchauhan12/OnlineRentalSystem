package com.coforge.OnlineRentalSystem.service;

import java.sql.SQLException;

import com.coforge.OnlineRentalSystem.bean.Rent;

public interface RentService {
	/*public void addRent(ProductServiceImpl psi,CustomerServiceImpl csi);
	public void displayRent();
	public Rent getRent();*/

	public void insert() throws SQLException;
	public void displayAllRentDetails() throws SQLException;
	public void displayByRentId() throws SQLException;
	public void updateRent() throws SQLException;
	public void deleteRentDetails() throws SQLException;
}
