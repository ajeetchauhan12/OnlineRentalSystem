package com.coforge.OnlineRentalSystem.dao;

import java.sql.SQLException;
import java.util.Scanner;


import com.coforge.OnlineRentalSystem.bean.Status;
import com.coforge.OnlineRentalSystem.service.RentServiceImpl;

public interface StatusDao {
	/*public void addStatus(RentServiceImpl rsi);
	public void displayStatus();
	public Status getStatus();*/
	public void insert() throws SQLException;
	public void displayAllStatusDetails() throws SQLException;
	public void displayStatusByRentId() throws SQLException;
	public void updateRent() throws SQLException;
	public void deleteRentDetails() throws SQLException;

}
