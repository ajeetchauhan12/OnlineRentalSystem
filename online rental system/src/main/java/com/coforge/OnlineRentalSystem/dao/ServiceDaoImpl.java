package com.coforge.OnlineRentalSystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.coforge.OnlineRentalSystem.bean.Service;
import com.coforge.OnlineRentalSystem.db.DbConnect;
import com.coforge.OnlineRentalSystem.service.RentServiceImpl;

public class ServiceDaoImpl implements ServiceDao{
	/*Scanner sc=new Scanner(System.in);
	Service s=new Service();*/
	
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
			
			
			
			
		
			
				String str = "insert into Service values(?,?,?)";
				pst = con.prepareStatement(str);

				
				System.out.println("enter the rent id");
				pst.setInt(1, sc.nextInt());
				//sc.nextLine();			
				
				
				System.out.println("enter the service id");

				pst.setInt(2, sc.nextInt());
				sc.nextLine();
				System.out.println("enter the details ");
				
				
				
				
				pst.setString(3, sc.nextLine());
				
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

	public void displayAllServiceDetails() throws SQLException {
		try {
			con = DbConnect.dbConnectMethod();
			st = con.createStatement();
			con.setAutoCommit(false);
			String query = "select * from Service";
			System.out.println("reterieved data");
			rs = st.executeQuery(query);
			while (rs.next()) {
				
				
				// System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+"
				// : "+rs.getLong(4)+" : "+rs.getString(5));
				
				System.out.println("rent id  is ::" + rs.getInt(1));
				System.out.println("service id  is ::" + rs.getInt(2));
				System.out.println("Details are :: " + rs.getString(3));
				

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

	public void displayByServiceId() throws SQLException {
		try {
			System.out.println("enter the service  id to display the service details id");
			int cust_Id = sc.nextInt();
			con = DbConnect.dbConnectMethod();
			st = con.createStatement();
			con.setAutoCommit(false);
			String query = "select * from Service where Rent_id=" + cust_Id;

			System.out.println("reterieved data");
			rs = st.executeQuery(query);
			while (rs.next()) {
				// System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+"
				// : "+rs.getLong(4)+" : "+rs.getString(5));
				System.out.println("rent id  is ::" + rs.getInt(1));
				System.out.println("service id  is ::" + rs.getInt(2));
				System.out.println("service details is :: " + rs.getString(3));
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

	public void updateService() throws SQLException {
		try {

			con = DbConnect.dbConnectMethod();
			con.setAutoCommit(false);
			String update = "update Service set Details=? where Service_id=?";
			pst = con.prepareStatement(update);
				
			
			//sc.nextLine();			
		
			System.out.println("enter the details ");
			
			
			
			
			pst.setString(3, sc.nextLine());
			

			System.out.println("enter the service id");

			pst.setInt(2, sc.nextInt());
			
			
			
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

	public void deleteServiceDetails() throws SQLException {
		try {

			con = DbConnect.dbConnectMethod();
			con.setAutoCommit(false);
			String delete = "delete from Service where service_id=?";
			pst = con.prepareStatement(delete);

			System.out.println("Service Id: ");
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void addService(RentServiceImpl rsi) {
	//	System.out.println("enter the rent id");
		r.setRent_id(sc.nextInt());
		sc.nextLine();
	s.setRent_id(rsi.getRent());
	
	System.out.println("enter the service  id");
		s.setService_id(sc.nextInt());
		sc.nextLine();
		System.out.println("enter the details");
		s.setDetails(sc.nextLine());
			}
	public void displayService() {
	//	System.out.println("rent id  is ::"+ b.getRent_id());
		System.out.println("service id  is :: "+s.getService_id());
		System.out.println("Service details  is :: "+s.getDetails());
	}
	public Service getService() {
		return s;
	}*/
}
