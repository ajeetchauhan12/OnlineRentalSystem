package com.coforge.OnlineRentalSystem.bean;

public class Status {
	private int Rent_id;
	private boolean returned_or_not;
	private Rent r;
	public Status() {
		// TODO Auto-generated constructor stub
	}
	public Status(int rent_id, boolean returned_or_not) {
		Rent_id = rent_id;
		this.returned_or_not = returned_or_not;
	}
	public int getRent_id() {
		return Rent_id;
	}
	public void setRent_id(Rent r) {
		Rent_id =r.getRent_id();
	}
	public boolean isReturned_or_not() {
		return returned_or_not;
	}
	public void setReturned_or_not(boolean returned_or_not) {
		this.returned_or_not = returned_or_not;
	}
	
	
}
