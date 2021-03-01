package com.coforge.OnlineRentalSystem.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.coforge.OnlineRentalSystem.bean.Customer;
import com.coforge.OnlineRentalSystem.db.DbConnect;

public class CustomerDaoImpl implements CustomerDao {
	
	Customer c = null;
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
			
			

				String str = "insert into Customer values(?,?,?,?,?,?,?)";
				pst = con.prepareStatement(str);

				System.out.println("Customer Id:");

				pst.setInt(1, sc.nextInt());
				sc.nextLine();

				System.out.println("Customer Name :");

				pst.setString(2, sc.nextLine());
				System.out.println("Costomer Mobile No. :");

				pst.setLong(3, sc.nextLong());
				sc.nextLine();
				
				System.out.println("Enter customergov type: ");
				pst.setString(4, sc.nextLine());
				
				System.out.println("Enter customer gov id: ");
				pst.setLong(5, sc.nextLong());
				
				sc.nextLine();
				
				System.out.println("Enter customer occupation");
				pst.setString(6, sc.nextLine());
				
				System.out.println("Enter customer occupation details ");

				pst.setString(7, sc.nextLine());
				
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

	public void displayAllCustomer() throws SQLException {
		try {
			con = DbConnect.dbConnectMethod();
			st = con.createStatement();
			con.setAutoCommit(false);
			String query = "select * from Customer";
			System.out.println("reterieved data");
			rs = st.executeQuery(query);
			while (rs.next()) {
				// System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+"
				// : "+rs.getLong(4)+" : "+rs.getString(5));
				System.out.println("Customer Id: " + rs.getInt(1));
				System.out.println("Customer Name: " + rs.getString(2));
				System.out.println("Customer Mobile: " + rs.getLong(3));
				System.out.println("Customer customer_gov_id_type:  " + rs.getString(4));
				System.out.println("Customer customer_gov_id_no:  " + rs.getLong(5));
				System.out.println("Customer customer_occupation :  " + rs.getString(6));
				System.out.println("Customer  customer_occupation details:  " + rs.getString(7) + "\n\n");

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

	public void displayByCustId() throws SQLException {
		try {
			System.out.println("enter the id to display the customer");
			int cust_Id = sc.nextInt();
			con = DbConnect.dbConnectMethod();
			st = con.createStatement();
			con.setAutoCommit(false);
			String query = "select * from Customer where customer_Id=" + cust_Id;

			System.out.println("reterieved data");
			rs = st.executeQuery(query);
			while (rs.next()) {
				// System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+"
				// : "+rs.getLong(4)+" : "+rs.getString(5));
				System.out.println("Customer Id: " + rs.getInt(1));
				System.out.println("Customer Name: " + rs.getString(2));
				System.out.println("Customer Mobile: " + rs.getLong(3));
				System.out.println("Customer customer_gov_id_type:  " + rs.getString(4));
				System.out.println("Customer customer_gov_id_no:  " + rs.getLong(5));
				System.out.println("Customer customer_occupation :  " + rs.getString(6));
				System.out.println("Customer  customer_occupation details:  " + rs.getString(7) + "\n\n");

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

	public void updateCustomer() throws SQLException {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			con = DbConnect.dbConnectMethod();
			con.setAutoCommit(false);
			String update = "update Customer set customer_name=?,customer_mobile=?,customer_gov_id_type=?,customer_gov_id_number=?,customer_occupation=?,customer_occupation_details=? where customer_id=?";
			pst = con.prepareStatement(update);

			System.out.println("Customer Name :");

			pst.setString(1,br.readLine());
			System.out.println("Costomer Mobile No. :");

			pst.setLong(2,Long.parseLong(br.readLine()));
			
			System.out.println("Enter customergov type: ");
			pst.setString(3, br.readLine());
			System.out.println("Enter customer gov id: ");
			pst.setLong(4,Long.parseLong(br.readLine()));
		
			System.out.println("Enter customer occupation");
			pst.setString(5, br.readLine());
			System.out.println("Enter customer occupation details ");

			pst.setString(6,br.readLine());
			System.out.println("Customer Id:");

			pst.setInt(7,Integer.parseInt(br.readLine()));
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

	public void deleteCustomer() throws SQLException {
		try {

			con = DbConnect.dbConnectMethod();
			con.setAutoCommit(false);
			String delete = "delete from Customer where customer_id=?";
			pst = con.prepareStatement(delete);

			System.out.println("Customer Id: ");
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

	public Customer getC() {
		return c;
	}

	/*
	 * public void addCustomer() { c=new Customer();
	 * System.out.println("enter customer id "); c.setCustomer_id(sc.nextInt());
	 * sc.nextLine();
	 * 
	 * System.out.println("Enter customer name :");
	 * c.setCustomer_name(sc.nextLine());
	 * 
	 * System.out.println("Enter customer mobile : ");
	 * c.setCustomer_mobile(sc.nextInt());
	 * 
	 * sc.nextLine();
	 * 
	 * System.out.println("Enter customergov type: ");
	 * c.setCustomer_gov_id_type(sc.nextLine());
	 * 
	 * System.out.println("Enter customer gov id: ");
	 * c.setCustomer_gov_id_number(sc.nextInt()); sc.nextLine();
	 * System.out.println("Enter customer occupation");
	 * 
	 * c.setCustomer_occupation(sc.nextLine());
	 * 
	 * System.out.println("Enter customer occupation details ");
	 * 
	 * c.setCustomer_occupation_details(sc.nextLine()); } public void
	 * displayCustomer() {
	 * System.out.println("customer id is ::"+c.getCustomer_id());
	 * System.out.println("customer name  is :: "+c.getCustomer_name());
	 * System.out.println("customer mobile is :: "+c.getCustomer_mobile());
	 * System.out.println("customer gov id type is :: "+c.getCustomer_gov_id_type())
	 * ;
	 * System.out.println("customer id gov no is :: "+c.getCustomer_gov_id_number())
	 * ;
	 * System.out.println("customer occupation  is :: "+c.getCustomer_occupation());
	 * System.out.println("customer occupation details is :: "+c.
	 * getCustomer_occupation_details());
	 * 
	 * 
	 * }
	 */

}
