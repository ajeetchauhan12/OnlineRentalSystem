package com.coforge.OnlineRentalSystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.coforge.OnlineRentalSystem.bean.Product;
import com.coforge.OnlineRentalSystem.db.DbConnect;

public class ProductDaoImpl implements ProductDao {
	Scanner sc=new Scanner(System.in);
	Product p=new Product();
	
	
	
	static Connection con=null;
	static PreparedStatement pst=null;
	static Statement st=null;
	 static ResultSet rs=null; 
	
	
	
	 
	 //method to insert customer into database
	public void insertProduct() throws SQLException  {
		
		try {
			
			
			
			con=DbConnect.dbConnectMethod();
	con.setAutoCommit(false);
		
		
			
			
			
			
			
			
			
			
			
	
		String str="insert into Product values(?,?)";
		pst=con.prepareStatement(str);
		
		System.out.println("Product Id:");
		
		pst.setInt(1,sc.nextInt());
		sc.nextLine();
	
		System.out.println("Product Name :");
	
		
		
		pst.setString(2,sc.nextLine());
		
		pst.executeUpdate();
		System.out.println("data inserted");
	
		

		}catch(Exception e ) {
			e.printStackTrace();
			con.rollback();
		}finally {
			try {
			con.commit();	
				pst.close();
				con.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
	
	//Display all Customer from database
	
	
	public void displayAllProduct() throws SQLException {
		try {
con=DbConnect.dbConnectMethod();
st=con.createStatement();
con.setAutoCommit(false);
String query="select * from Product";
System.out.println("reterieved data");
rs=st.executeQuery(query);
while(rs.next())
{
//System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getLong(4)+" : "+rs.getString(5));
	System.out.println("Product Id: "+rs.getInt(1));
	System.out.println("Product Name: "+rs.getString(2));
	
	
}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			con.rollback();
		}
		finally {
			try {
				con.commit();
				rs.close();
				st.close();
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	
	
	}
//display customer by customer id 
	
	public void displayByProductId() throws SQLException {
		try {
			System.out.println("enter the id to display the Product");
			int cust_Id=sc.nextInt();
con=DbConnect.dbConnectMethod();
st=con.createStatement();
con.setAutoCommit(false);
String query="select * from Product where product_id="+cust_Id;

System.out.println("reterieved data");
rs=st.executeQuery(query);
while(rs.next())
{
//System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getLong(4)+" : "+rs.getString(5));
	System.out.println("Customer Id: "+rs.getInt(1));
	System.out.println("Customer Name: "+rs.getString(2));
	
	
}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			con.rollback();
		}
		finally {
			try {
				con.commit();
				rs.close();
				st.close();
				con.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			}
		}
		
		
		
		
		//update customer in customer table in database
	
	
	
	public void updateProduct() throws SQLException {
		try {
			
			con=DbConnect.dbConnectMethod();
			con.setAutoCommit(false);
			String update="update Product set product_name=? where product_id=?";
			pst=con.prepareStatement(update);
	
			
			
		
			System.out.println("Product Name :");
		
		pst.setString(1,sc.nextLine());
			
			pst.executeUpdate();
					System.out.println("row updated");
		}catch(Exception e) {
			e.printStackTrace();
			con.rollback();
	}
	finally {
		try {
			con.commit();
		
			pst.close();
			con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}
		

	//delete customer from customer table in database
	
	public void deleteProduct() throws SQLException {
		try {
			
			con=DbConnect.dbConnectMethod();
			con.setAutoCommit(false);
			String delete="delete from Product where product_id=?";
			pst=con.prepareStatement(delete);

			System.out.println("Product Id: ");
			pst.setInt(1,sc.nextInt());
			pst.executeUpdate();
			
		System.out.println("row deleted");
		}catch(Exception e) {
			e.printStackTrace();
			con.rollback();
	}
	finally {
		try {
			con.commit();
			pst.close();
			con.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void addProduct() {
		System.out.println("enter the product id");
		p.setProduct_id(sc.nextInt());
		sc.nextLine();
		System.out.println("enter the product name");
		p.setProduct_name(sc.nextLine());
		
	}
	public void displayProduct() {
		System.out.println("product id is ::"+p.getProduct_id());
		System.out.println("product name  is :: "+p.getProduct_name());
		
		
	}*/
	public Product getProduct() {
		return p;
	}
}
