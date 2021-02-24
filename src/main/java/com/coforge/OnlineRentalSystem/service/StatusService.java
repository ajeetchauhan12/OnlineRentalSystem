package com.coforge.OnlineRentalSystem.service;

import java.sql.SQLException;

import com.coforge.OnlineRentalSystem.bean.Status;

public interface StatusService {
/*	public void addStatus(RentServiceImpl rsi);
	public void displayStatus();
	public Status getStatus();*/
	public void insert() throws SQLException;
	public void displayAllStatusDetails() throws SQLException;
	public void displayStatusByRentId() throws SQLException;
	public void updateRent() throws SQLException;
	public void deleteRentDetails() throws SQLException;
}
