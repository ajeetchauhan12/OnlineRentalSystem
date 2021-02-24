package com.coforge.OnlineRentalSystem.bean;

public class Address {
private int house_no;
private String street_name;
private String city;
private int pincode;
private String state;
private String country;

private Customer c;
private int customer_id;
public Address() {
	// TODO Auto-generated constructor stub
}
public Address(int house_no, String street_name, String city, int pincode, String state, String country,Customer c) {
	this.house_no = house_no;
	this.street_name = street_name;
	this.city = city;
	this.pincode = pincode;
	this.state = state;
	this.country = country;
	this.c = c;
}
public int getHouse_no() {
	return house_no;
}
public void setHouse_no(int house_no) {
	this.house_no = house_no;
}
public String getStreet_name() {
	return street_name;
}
public void setStreet_name(String street_name) {
	this.street_name = street_name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
/*public Customer getC() {
	return c;
}
public void setC(Customer c) {
	this.c = c;
}
*/

public int getCustomer_id() {
	return customer_id;
}
public void setCustomer_id(Customer c) {
	this.customer_id = c.getCustomer_id();
}


}
