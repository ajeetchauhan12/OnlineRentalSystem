package com.coforge.OnlineRentalSystem.service;

import java.sql.SQLException;

import com.coforge.OnlineRentalSystem.bean.Service;

public interface ServiceServ {
	/*public void addService(RentServiceImpl rsi);
	public void displayService();
	public Service getService();*/
	public void insert() throws SQLException;
	public void displayAllServiceDetails() throws SQLException;
	public void displayByServiceId() throws SQLException;
	public void updateService() throws SQLException;
	public void deleteServiceDetails() throws SQLException;
}
