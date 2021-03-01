package com.coforge.OnlineRentalSystem.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.coforge.OnlineRentalSystem.bean.Rent;
import com.coforge.OnlineRentalSystem.db.DbConnect;
import com.coforge.OnlineRentalSystem.service.CustomerServiceImpl;
import com.coforge.OnlineRentalSystem.service.ProductServiceImpl;

public class RentDaoImpl implements RentDao {
	
	Rent r=new Rent();
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
			
			
	
			
				String str = "insert into Rent values(?,?,?,?,?)";
				pst = con.prepareStatement(str);

				/*System.out.println("Customer Id:");

				pst.setInt(1, sc.nextInt());*/

				System.out.println("Enter the  Customer Id that already exist:");
				boolean flag=true;
				while(flag)
				{
					int c=sc.nextInt();
					String query1="select * from Customer where customer_id=?";
					
					PreparedStatement pst1=con.prepareStatement(query1);
					pst1.setInt(1,c);
					ResultSet rs1=pst1.executeQuery();
					if(rs1.next()) {
						pst.setInt(1,c);
						flag=false;
					}
					else {
						System.out.println("enter the correct customer id");
					}
				}
			//	sc.nextLine();
				System.out.println("enter the rent id");
				pst.setInt(2, sc.nextInt());
				//sc.nextLine();				
				/*System.out.println("Product Id:");

				pst.setInt(3, sc.nextInt());*/
				System.out.println("Enter the  Product Id that already exist:");
				boolean flag1=true;
				while(flag1)
				{
					int c=sc.nextInt();
					String query1="select * from Product where Product_id=?";
					
					PreparedStatement pst1=con.prepareStatement(query1);
					pst1.setInt(1,c);
					ResultSet rs1=pst1.executeQuery();
					if(rs1.next()) {
						pst.setInt(3,c);
						flag1=false;
					}
					else {
						System.out.println("enter the correct Product id");
					}
				}
				
				System.out.println("enter the No of days");
				pst.setInt(4, sc.nextInt());
				System.out.println("enter the product quantity");
				pst.setInt(5, sc.nextInt());
				pst.executeUpdate();
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

	public void displayAllRentDetails() throws SQLException {
		try {
			con = DbConnect.dbConnectMethod();
			st = con.createStatement();
			con.setAutoCommit(false);
			String query = "select * from Rent";
			System.out.println("reterieved data");
			rs = st.executeQuery(query);
			while (rs.next()) {
				
				
				// System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+"
				// : "+rs.getLong(4)+" : "+rs.getString(5));
				System.out.println("Customer Id: " + rs.getInt(1));
				System.out.println("rent id  is ::" + rs.getInt(2));
				System.out.println("product id is ::" + rs.getInt(3));
				System.out.println("no of days  is :: " + rs.getInt(4));
				System.out.println("Product quantity is :: " + rs.getInt(5));

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

	public void displayByRentId() throws SQLException {
		try {
			System.out.println("enter the id to display the Rent details by id");
			int cust_Id = sc.nextInt();
			con = DbConnect.dbConnectMethod();
			st = con.createStatement();
			con.setAutoCommit(false);
			String query = "select * from Rent where Rent_id=" + cust_Id;

			System.out.println("reterieved data");
			rs = st.executeQuery(query);
			while (rs.next()) {
				// System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+"
				// : "+rs.getLong(4)+" : "+rs.getString(5));
				System.out.println("Customer Id: " + rs.getInt(1));
				System.out.println("rent id  is ::" + rs.getInt(2));
				System.out.println("product id is ::" + rs.getInt(3));
				System.out.println("no of days  is :: " + rs.getInt(4));
				System.out.println("Product quantity is :: " + rs.getInt(5));
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

	public void updateRent() throws SQLException {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			con = DbConnect.dbConnectMethod();
			con.setAutoCommit(false);
			String update = "update Rent set Customer_id=?,Product_id=?,No_of_days=?,Product_quantity=? where Rent_id=?";
			pst = con.prepareStatement(update);
				
			System.out.println("Enter the  Customer Id that already exist:");
			boolean flag=true;
			while(flag)
			{
				int c=Integer.parseInt(br.readLine());
				String query1="select * from Customer where customer_id=?";
				
				PreparedStatement pst1=con.prepareStatement(query1);
				pst1.setInt(1,c);
				ResultSet rs1=pst1.executeQuery();
				if(rs1.next()) {
					pst.setInt(1,c);
					flag=false;
				}
				else {
					System.out.println("enter the correct customer id");
				}
			}
			
			System.out.println("Enter the  Product Id that already exist:");
			boolean flag1=true;
			while(flag1)
			{
				int c=Integer.parseInt(br.readLine());
				String query1="select * from Product where Product_id=?";
				
				PreparedStatement pst1=con.prepareStatement(query1);
				pst1.setInt(1,c);
				ResultSet rs1=pst1.executeQuery();
				if(rs1.next()) {
					pst.setInt(2,c);
					flag1=false;
				}
				else {
					System.out.println("enter the correct Product id");
				}
			}
	
			System.out.println("enter the No of days");
			pst.setInt(3, Integer.parseInt(br.readLine()));
			System.out.println("enter the product quantity");
			pst.setInt(4, Integer.parseInt(br.readLine()));
			
			System.out.println("enter the rent id");
			pst.setInt(5, Integer.parseInt(br.readLine()));
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

	public void deleteRentDetails() throws SQLException {
		try {

			con = DbConnect.dbConnectMethod();
			con.setAutoCommit(false);
			String delete = "delete from Rent where Rent_id=?";
			pst = con.prepareStatement(delete);

			System.out.println("Rent Id: ");
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

	
	
	/*public void addRent(ProductServiceImpl psi,CustomerServiceImpl csi) {
		r.setCustomer_id(csi.getC());
		r.setProduct_id(psi.getProduct());
		System.out.println("enter the rent id");
		r.setRent_id(sc.nextInt());
		sc.nextLine();
		System.out.println("enter the No of days");
		r.setNo_of_days(sc.nextInt());
		sc.nextLine();
		System.out.println("enter the product quantity");
		r.setProduct_quantity(sc.nextInt());
	}
	public void displayRent() {
//		System.out.println("product id is ::"+r.getProduct_id());
//		System.out.println("product name  is :: "+r.getCustomer_id());
		
		System.out.println("rent id  is ::"+ r.getRent_id());
		System.out.println("no of days  is :: "+r.getNo_of_days());
		System.out.println("Product quantity is :: "+r.getProduct_quantity());
	}
	public Rent getRent() {
		return r;
	}*/

}
