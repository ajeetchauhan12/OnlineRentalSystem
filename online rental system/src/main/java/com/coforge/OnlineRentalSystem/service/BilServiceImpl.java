package com.coforge.OnlineRentalSystem.service;

import java.sql.SQLException;

import com.coforge.OnlineRentalSystem.bean.Bill;

import com.coforge.OnlineRentalSystem.dao.BillDao;
import com.coforge.OnlineRentalSystem.dao.BillDaoImpl;


public class BilServiceImpl implements BillService{
BillDao bd=null;
public BilServiceImpl() {
	// TODO Auto-generated constructor stub
bd=new BillDaoImpl();
}
	/*public void addBill(RentServiceImpl rsi) {
		// TODO Auto-generated method stub
	bd.addBill(rsi);	
	}

	public void displayBill() {
		// TODO Auto-generated method stub
		bd.displayBill();
	}
	public Bill getBill() {
		return bd.getBill();
	}*/
public void insert() throws SQLException {
	// TODO Auto-generated method stub
	bd.insert();
}
public void displayAllBillDetails() throws SQLException {
	// TODO Auto-generated method stub
	bd.displayAllBillDetails();
}
public void displayBillByRentId() throws SQLException {
	// TODO Auto-generated method stub
	bd.displayBillByRentId();
}
public void updateBill() throws SQLException {
	// TODO Auto-generated method stub
	bd.updateBill();
}
public void deleteBillDetails() throws SQLException {
	// TODO Auto-generated method stub
	bd.deleteBillDetails();
}


}
