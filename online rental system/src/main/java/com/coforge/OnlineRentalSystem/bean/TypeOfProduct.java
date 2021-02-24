package com.coforge.OnlineRentalSystem.bean;

public class TypeOfProduct {
private int Product_id;
private String Product_type;
private String Product_specification;
private int Product_rentprice;
private Product p;
public TypeOfProduct() {
	// TODO Auto-generated constructor stub
}
public TypeOfProduct(int product_id, String product_type, String product_specification, int product_rentprice) {
	Product_id = product_id;
	Product_type = product_type;
	Product_specification = product_specification;
	Product_rentprice = product_rentprice;
}
public int getProduct_id() {
	return Product_id;
}
public void setProduct_id(Product p) {
	Product_id =p.getProduct_id();
}
public String getProduct_type() {
	return Product_type;
}
public void setProduct_type(String product_type) {
	Product_type = product_type;
}
public String getProduct_specification() {
	return Product_specification;
}
public void setProduct_specification(String product_specification) {
	Product_specification = product_specification;
}
public int getProduct_rentprice() {
	return Product_rentprice;
}
public void setProduct_rentprice(int product_rentprice) {
	Product_rentprice = product_rentprice;
}

}
