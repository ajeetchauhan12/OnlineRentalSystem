package com.coforge.OnlineRentalSystem.service;

import java.sql.SQLException;

import com.coforge.OnlineRentalSystem.bean.Service;
import com.coforge.OnlineRentalSystem.dao.ServiceDao;
import com.coforge.OnlineRentalSystem.dao.ServiceDaoImpl;

public class ServiceServImpl implements ServiceServ{
ServiceDao sd=null;
	public ServiceServImpl() {
		sd=new ServiceDaoImpl();
	// TODO Auto-generated constructor stub
}
	/*public void addService(RentServiceImpl rsi) {
		// TODO Auto-generated method stub
		sd.addService(rsi);
	}

	public void displayService() {
		// TODO Auto-generated method stub
		sd.displayService();
	}
	public Service getService() {
		return sd.getService();
	}*/
	public void insert() throws SQLException {
		// TODO Auto-generated method stub
		sd.insert();
	}
	public void displayAllServiceDetails() throws SQLException {
		// TODO Auto-generated method stub
		sd.displayAllServiceDetails();
	}
	public void displayByServiceId() throws SQLException {
		// TODO Auto-generated method stub
		sd.displayByServiceId();
	}
	public void updateService() throws SQLException {
		// TODO Auto-generated method stub
		sd.updateService();
	}
	public void deleteServiceDetails() throws SQLException {
		// TODO Auto-generated method stub
		sd.deleteServiceDetails();
	}
	

}
