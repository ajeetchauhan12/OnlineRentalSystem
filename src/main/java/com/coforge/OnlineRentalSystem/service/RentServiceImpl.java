package com.coforge.OnlineRentalSystem.service;


import java.sql.SQLException;

import com.coforge.OnlineRentalSystem.bean.Rent;
import com.coforge.OnlineRentalSystem.dao.RentDao;
import com.coforge.OnlineRentalSystem.dao.RentDaoImpl;

public class RentServiceImpl implements RentService  {
RentDao rd=null;
	public RentServiceImpl() {
	// TODO Auto-generated constructor stub
rd=new RentDaoImpl();
	}
	public void insert() throws SQLException {
		// TODO Auto-generated method stub
		rd.insert();
		
	}
	public void displayAllRentDetails() throws SQLException {
		// TODO Auto-generated method stub
		rd.displayAllRentDetails();
	}
	public void displayByRentId() throws SQLException {
		// TODO Auto-generated method stub
		rd.displayByRentId();
	}
	public void updateRent() throws SQLException {
		// TODO Auto-generated method stub
		rd.updateRent();
	}
	public void deleteRentDetails() throws SQLException {
		// TODO Auto-generated method stub
		rd.deleteRentDetails();
	}

/*public void addRent(ProductServiceImpl psi,CustomerServiceImpl csi) {
	// TODO Auto-generated method stub
	rd.addRent(psi,csi);
}

public void displayRent() {
	// TODO Auto-generated method stub
	rd.displayRent();
}
public Rent getRent() {
	return rd.getRent();
}*/

}
