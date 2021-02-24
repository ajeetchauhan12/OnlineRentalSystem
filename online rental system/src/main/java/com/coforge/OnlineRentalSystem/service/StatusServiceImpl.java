package com.coforge.OnlineRentalSystem.service;

import java.sql.SQLException;

import com.coforge.OnlineRentalSystem.bean.Status;
import com.coforge.OnlineRentalSystem.dao.StatusDao;
import com.coforge.OnlineRentalSystem.dao.StatusDaoImpl;

public class StatusServiceImpl implements StatusService {
	StatusDao sd=null;
	public StatusServiceImpl() {
		// TODO Auto-generated constructor stub
	sd=new StatusDaoImpl();
	}
	public void insert() throws SQLException {
		// TODO Auto-generated method stub
		sd.insert();
	}
	public void displayAllStatusDetails() throws SQLException {
		// TODO Auto-generated method stub
		sd.displayAllStatusDetails();
	}
	public void displayStatusByRentId() throws SQLException {
		// TODO Auto-generated method stub
		sd.displayStatusByRentId();
	}
	public void updateRent() throws SQLException {
		// TODO Auto-generated method stub
		sd.updateRent();
	}
	public void deleteRentDetails() throws SQLException {
		// TODO Auto-generated method stub
		sd.deleteRentDetails();
	}

	/*public void addStatus(RentServiceImpl rsi) {
		// TODO Auto-generated method stub
	sd.addStatus(rsi);	
	}

	public void displayStatus() {
		// TODO Auto-generated method stub
		sd.displayStatus();
	}
	public Status getStatus() {
		return sd.getStatus();
	}*/

}
