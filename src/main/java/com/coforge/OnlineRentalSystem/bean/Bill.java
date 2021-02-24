package com.coforge.OnlineRentalSystem.bean;

public class Bill {
	private int Rent_id;
	private int Total_amount;
	private int Amount_paid;
	private Rent r;
	public Bill() {
		// TODO Auto-generated constructor stub
	}
	public Bill(int rent_id, int total_amount, int amount_paid,Rent r) {
		Rent_id = rent_id;
		Total_amount = total_amount;
		Amount_paid = amount_paid;
		this.r=r;
	}
	public int getRent_id() {
		return Rent_id;
	}
	public void setRent_id(Rent r) {
		Rent_id =r.getRent_id();
	}
	public int getTotal_amount() {
		return Total_amount;
	}
	public void setTotal_amount(int total_amount) {
		Total_amount = total_amount;
	}
	public int getAmount_paid() {
		return Amount_paid;
	}
	public void setAmount_paid(int amount_paid) {
		Amount_paid = amount_paid;
	}
	

}
