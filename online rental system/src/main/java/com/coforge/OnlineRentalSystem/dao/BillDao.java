package com.coforge.OnlineRentalSystem.dao;

import java.sql.SQLException;
import java.util.Scanner;

import com.coforge.OnlineRentalSystem.bean.Bill;
import com.coforge.OnlineRentalSystem.service.RentServiceImpl;


public interface BillDao {
	/*
	public void addBill(RentServiceImpl rsi);
	public void displayBill();
	public Bill getBill();	*/
	public void insert() throws SQLException;
	public void displayAllBillDetails() throws SQLException;
	public void displayBillByRentId() throws SQLException;
	public void updateBill() throws SQLException;
	public void deleteBillDetails() throws SQLException;

}
