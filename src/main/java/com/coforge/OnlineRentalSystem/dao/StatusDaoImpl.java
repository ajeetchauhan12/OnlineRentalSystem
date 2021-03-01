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
import com.coforge.OnlineRentalSystem.bean.Status;
import com.coforge.OnlineRentalSystem.db.DbConnect;
import com.coforge.OnlineRentalSystem.service.RentServiceImpl;

public class StatusDaoImpl implements StatusDao{
	
	/*Rent r=new Rent();*/
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
			
			
	
			
				String str = "insert into Status values(?,?)";
				pst = con.prepareStatement(str);

				/*System.out.println("Rent Id:");

				pst.setInt(1, sc.nextInt());*/
				
				
			//	sc.nextLine();
				System.out.println("Enter the  rent Id that already exist:");
				boolean flag=true;
				while(flag)
				{
					int c=sc.nextInt();
					String query1="select * from Rent where Rent_id=?";
					
					PreparedStatement pst1=con.prepareStatement(query1);
					pst1.setInt(1,c);
					ResultSet rs1=pst1.executeQuery();
					if(rs1.next()) {
						pst.setInt(1,c);
						flag=false;
					}
					else {
						System.out.println("enter the correct Product id");
					}
				}
				
				sc.nextLine();
				
				
				
				System.out.println("returned or not ");
				pst.setBoolean(2,sc.nextBoolean());
							

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

	public void displayAllStatusDetails() throws SQLException {
		try {
			con = DbConnect.dbConnectMethod();
			st = con.createStatement();
			con.setAutoCommit(false);
			String query = "select * from Status";
			System.out.println("reterieved data");
			rs = st.executeQuery(query);
			while (rs.next()) {
				
				
				// System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+"
				// : "+rs.getLong(4)+" : "+rs.getString(5));
				
				System.out.println("rent id  is ::" + rs.getInt(1));
				System.out.println("item returned or not ::" + rs.getBoolean(2));
				

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

	public void displayStatusByRentId() throws SQLException {
		try {
			System.out.println("enter the rent id ");
			int cust_Id = sc.nextInt();
			con = DbConnect.dbConnectMethod();
			st = con.createStatement();
			con.setAutoCommit(false);
			String query = "select * from Status where Rent_id=" + cust_Id;

			System.out.println("reterieved data");
			rs = st.executeQuery(query);
			while (rs.next()) {
				// System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+"
				// : "+rs.getLong(4)+" : "+rs.getString(5));
				System.out.println("rent id  is ::" + rs.getInt(1));
				
				System.out.println("item returned or not ::" + rs.getBoolean(2));
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
			String update = "update Status set returned_or_not=? where Rent_id=?";
			pst = con.prepareStatement(update);
				
			
			
	
			System.out.println("enter the returned or not stauts");
			pst.setBoolean(1,sc.nextBoolean());
			
			System.out.println("Enter the  Rent Id that already exist:");
			boolean flag=true;
			while(flag)
			{
				int c=Integer.parseInt(br.readLine());
				String query1="select * from Rent where Rent_id=?";
				
				PreparedStatement pst1=con.prepareStatement(query1);
				pst1.setInt(1,c);
				ResultSet rs1=pst1.executeQuery();
				if(rs1.next()) {
					pst.setInt(2,c);
					flag=false;
				}
				else {
					System.out.println("enter the correct Rent id");
				}
			}
			
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
			String delete = "delete from Status where Rent_id=?";
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

	
	
	
	
	
	
	
	/*Scanner sc=new Scanner(System.in);
	Status st=new Status();
	public void addStatus(RentServiceImpl rsi) {
	//	st.setRent_id(rd.getRent());
		System.out.println("enter the rent id");
		r.setRent_id(sc.nextInt());
		sc.nextLine();
		System.out.println("item returned or not");
		st.setReturned_or_not(sc.nextBoolean());
	}
	public void displayStatus() {
	//	System.out.println("rent id  is ::"+ b.getRent_id());
		System.out.println("item returned or not :: "+st.isReturned_or_not());
	}
	public Status getStatus() {
		return st;
	}
*/
}
