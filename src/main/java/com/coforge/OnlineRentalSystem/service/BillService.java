package com.coforge.OnlineRentalSystem.service;

import java.sql.SQLException;

import com.coforge.OnlineRentalSystem.bean.Bill;


public interface BillService {
	/*public void addBill(RentServiceImpl rsi);
	public void displayBill();
	public Bill getBill();*/
	public void insert() throws SQLException;
	public void displayAllBillDetails() throws SQLException;
	public void displayBillByRentId() throws SQLException;
	public void updateBill() throws SQLException;
	public void deleteBillDetails() throws SQLException;
}
