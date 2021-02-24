package com.coforge.OnlineRentalSystem.bean;

public class Service {
	private int Rent_id;
	private int Service_id;
	private String Details;
	private Rent r;
	public Service() {
		// TODO Auto-generated constructor stub
	}
	
	public Service(int rent_id, int service_id, String details,Rent r) {
		Rent_id = rent_id;
		Service_id = service_id;
		Details = details;
		this.r=r;
	}
	public int getRent_id() {
		return Rent_id;
	}
	public void setRent_id(Rent r) {
		Rent_id =r.getRent_id();
	}
	public int getService_id() {
		return Service_id;
	}
	public void setService_id(int service_id) {
		Service_id = service_id;
	}
	public String getDetails() {
		return Details;
	}
	public void setDetails(String details) {
		Details = details;
	}
	
}
