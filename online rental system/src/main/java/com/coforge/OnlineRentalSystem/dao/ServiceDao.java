package com.coforge.OnlineRentalSystem.dao;

import java.sql.SQLException;
import java.util.Scanner;

import com.coforge.OnlineRentalSystem.bean.Service;
import com.coforge.OnlineRentalSystem.service.RentServiceImpl;

public interface ServiceDao {
/*	public void addService(RentServiceImpl rsi);
	public void displayService();
	public Service getService();*/
	public void insert() throws SQLException;
	public void displayAllServiceDetails() throws SQLException;
	public void displayByServiceId() throws SQLException;
	public void updateService() throws SQLException;
	public void deleteServiceDetails() throws SQLException;
	
}
