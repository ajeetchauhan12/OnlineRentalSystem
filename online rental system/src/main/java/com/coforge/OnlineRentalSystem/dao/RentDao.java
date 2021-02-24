package com.coforge.OnlineRentalSystem.dao;

import java.sql.SQLException;
import java.util.Scanner;

import com.coforge.OnlineRentalSystem.bean.Rent;
import com.coforge.OnlineRentalSystem.service.CustomerServiceImpl;
import com.coforge.OnlineRentalSystem.service.ProductServiceImpl;

public interface RentDao {
	/*public void addRent(ProductServiceImpl psi,CustomerServiceImpl csi);
public void displayRent();
public Rent getRent();*/
	public void insert() throws SQLException;
	public void displayAllRentDetails() throws SQLException;
	public void displayByRentId() throws SQLException;
	public void updateRent() throws SQLException;
	public void deleteRentDetails() throws SQLException;
}
