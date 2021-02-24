package com.coforge.OnlineRentalSystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


import com.coforge.OnlineRentalSystem.bean.TypeOfProduct;
import com.coforge.OnlineRentalSystem.db.DbConnect;
import com.coforge.OnlineRentalSystem.service.ProductService;
import com.coforge.OnlineRentalSystem.service.ProductServiceImpl;

public class TypeOfProductDaoImpl implements TypeOfProductDao{
	
	TypeOfProduct tp=new TypeOfProduct();
	
	static Scanner sc = new Scanner(System.in);
	static Connection con = null;
	static PreparedStatement pst = null;
	static Statement st = null;
	static ResultSet rs = null;

	// method to insert customer into database
	public void insert() throws SQLException {

		try {

			con = DbConnect.dbConnectMethod();
			con.setAutoCommit(false);
			
	
			
			
	

				String str = "insert into Product_type values(?,?,?,?)";
				pst = con.prepareStatement(str);
String id="select Product_id from Product";
		int a=Integer.parseInt(id);
System.out.println("Product Id:");

				pst.setInt(1,a);
				//sc.nextLine();

			
				System.out.println("Enter product type :");
				pst.setString(2, sc.nextLine());
				System.out.println("enter the product specification :");
				pst.setString(3,sc.nextLine());
				System.out.println("Enter product rent price : ");
				pst.setInt(4, sc.nextInt());
				
				pst.executeUpdate();
				System.out.println("data inserted");
				
		} catch (Exception e) {
			e.printStackTrace();
			con.rollback();
		} finally {
			try {
				con.commit();
				pst.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	// Display all Customer from database

	public void displayAllProductType() throws SQLException {
		try {
			con = DbConnect.dbConnectMethod();
			st = con.createStatement();
			con.setAutoCommit(false);
			String query = "select * from Product_type";
			System.out.println("reterieved data");
			rs = st.executeQuery(query);
			while (rs.next()) {
				//System.out.println("product id is ::"+p.getProduct_id());
//				System.out.println(" "+p.getProduct_name());
				
				System.out.println(""+ tp.getProduct_type());
				System.out.println(""+tp.getProduct_specification());
				System.out.println(""+tp.getProduct_rentprice());
				
				
				
				
				// System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+"
				// : "+rs.getLong(4)+" : "+rs.getString(5));
				System.out.println("product id is ::" + rs.getInt(1));
				System.out.println("Product type  is ::" + rs.getString(2));
				
				System.out.println("Product specification  is :: " + rs.getString(3));
				System.out.println("Product rent price is :: " + rs.getInt(4));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			con.rollback();
		} finally {
			try {
				con.commit();
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	// display customer by customer id

	public void displayProductTypeById() throws SQLException {
		try {
			System.out.println("enter the product id to display the product type");
			int cust_Id = sc.nextInt();
			con = DbConnect.dbConnectMethod();
			st = con.createStatement();
			con.setAutoCommit(false);
			String query = "select * from Product_type where cust_Id=" + cust_Id;

			System.out.println("reterieved data");
			rs = st.executeQuery(query);
			while (rs.next()) {
				// System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+"
				// : "+rs.getLong(4)+" : "+rs.getString(5));
				System.out.println("product id is ::" + rs.getInt(1));
				System.out.println("Product type  is ::" + rs.getString(2));
				
				System.out.println("Product specification  is :: " + rs.getString(3));
				System.out.println("Product rent price is :: " + rs.getInt(4));

			}
		} catch (Exception e) {
			e.printStackTrace();
			con.rollback();
		} finally {
			try {
				con.commit();
				rs.close();
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// update customer in customer table in database

	public void updateTypeOfProduct() throws SQLException {
		try {

			con = DbConnect.dbConnectMethod();
			con.setAutoCommit(false);
			String update = "update Product_type set product_type=?,Product_specification=?,Product_rentprice=? where Product_id=?";
			pst = con.prepareStatement(update);

			

		
			System.out.println("Enter product type :");
			pst.setString(1, sc.nextLine());
			System.out.println("enter the product specification :");
			pst.setString(2,sc.nextLine());
			System.out.println("Enter product rent price : ");
			pst.setInt(3, sc.nextInt());

			System.out.println("Product Id:");

			pst.setInt(4, sc.nextInt());
			
			
			pst.executeUpdate();
			System.out.println("row updated");
		} catch (Exception e) {
			e.printStackTrace();
			con.rollback();
		} finally {
			try {
				con.commit();

				pst.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// delete customer from customer table in database

	public void deleteTypeOfProduct() throws SQLException {
		try {

			con = DbConnect.dbConnectMethod();
			con.setAutoCommit(false);
			String delete = "delete from Product_type where Product_id=?";
			
			pst = con.prepareStatement(delete);

			System.out.println("Product Id: ");
			pst.setInt(1, sc.nextInt());
			pst.executeUpdate();

			System.out.println("row deleted");
		} catch (Exception e) {
			e.printStackTrace();
			con.rollback();
		} finally {
			try {
				con.commit();
				pst.close();
				con.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
/*public void addTypeOfProduct(ProductServiceImpl psi ) {
	tp.setProduct_id(psi.getProduct());
	
	System.out.println("Enter product type :");
	tp.setProduct_type(sc.nextLine());
	
	System.out.println("Enter product specification : ");
	tp.setProduct_specification(sc.nextLine());
	
	
	
	System.out.println("Enter product rent price : ");
	tp.setProduct_rentprice(sc.nextInt());
	
}
public void displayTypeOfProduct() {
	//System.out.println("product id is ::"+p.getProduct_id());
//	System.out.println("product name  is :: "+p.getProduct_name());
	
	System.out.println("Product type  is ::"+ tp.getProduct_type());
	System.out.println("Product specification  is :: "+tp.getProduct_specification());
	System.out.println("Product rent price is :: "+tp.getProduct_rentprice());
	
	
}
public TypeOfProduct getTypeOfProduct() {
	return tp;
}*/
}
