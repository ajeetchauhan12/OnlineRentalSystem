package com.coforge.OnlineRentalSystem.service;

import java.sql.SQLException;

import com.coforge.OnlineRentalSystem.bean.TypeOfProduct;
import com.coforge.OnlineRentalSystem.dao.TypeOfProductDao;
import com.coforge.OnlineRentalSystem.dao.TypeOfProductDaoImpl;

public class TypeOfProductImpl implements TypeOfProductService  {
TypeOfProductDao tpd;
	public TypeOfProductImpl() {
	// TODO Auto-generated constructor stub
		tpd=new TypeOfProductDaoImpl();
}
	/*public void addTypeOfProduct(ProductServiceImpl psi) {
	tpd.addTypeOfProduct(psi);
}

public void displayTypeOfProduct() {
	// TODO Auto-generated method stub
	tpd.displayTypeOfProduct();
}
public TypeOfProduct getTypeOfProduct() {
	return tpd.getTypeOfProduct();
}*/
	public void insert() throws SQLException {
		// TODO Auto-generated method stub
		tpd.insert();
	}
	public void displayAllProductType() throws SQLException {
		// TODO Auto-generated method stub
		tpd.displayAllProductType();
	}
	public void displayProductTypeById() throws SQLException {
		// TODO Auto-generated method stub
		tpd.displayProductTypeById();
	}
	public void updateTypeOfProduct() throws SQLException {
		// TODO Auto-generated method stub
		tpd.updateTypeOfProduct();
	}
	public void deleteTypeOfProduct() throws SQLException {
		// TODO Auto-generated method stub
		tpd.deleteTypeOfProduct();
	}

}
