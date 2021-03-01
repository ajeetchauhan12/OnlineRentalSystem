package com.coforge.OnlineRentalSystem.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.coforge.OnlineRentalSystem.bean.Bill;
import com.coforge.OnlineRentalSystem.db.DbConnect;
import com.coforge.OnlineRentalSystem.service.RentServiceImpl;

public class BillDaoImpl implements BillDao {
	
	Bill b=new Bill();
	
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
			
			
			
			
		
			
				String str = "insert into Bill values(?,?,?)";
				pst = con.prepareStatement(str);

				
				/*System.out.println("enter the rent id");
				pst.setInt(1, sc.nextInt());*/
				//sc.nextLine();			
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
				
				System.out.println("enter the total amount");

				pst.setInt(2, sc.nextInt());
				System.out.println("enter the amount paid");
				
				
				
				
				pst.setInt(3, sc.nextInt());
				
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

	public void displayAllBillDetails() throws SQLException {
		try {
			con = DbConnect.dbConnectMethod();
			st = con.createStatement();
			con.setAutoCommit(false);
			String query = "select * from Bill";
			System.out.println("reterieved data");
			rs = st.executeQuery(query);
			while (rs.next()) {
				
				
				// System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+"
				// : "+rs.getLong(4)+" : "+rs.getString(5));
				
				System.out.println("rent id  is ::" + rs.getInt(1));
				System.out.println("total amount  is ::" + rs.getInt(2));
				System.out.println("amount paid is :: " + rs.getInt(3));
				

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

	public void displayBillByRentId() throws SQLException {
		try {
			System.out.println("enter the rent  id to display the Bill details by id");
			int cust_Id = sc.nextInt();
			con = DbConnect.dbConnectMethod();
			st = con.createStatement();
			con.setAutoCommit(false);
			String query = "select * from Bill where Rent_id=" + cust_Id;

			System.out.println("reterieved data");
			rs = st.executeQuery(query);
			while (rs.next()) {
				// System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+"
				// : "+rs.getLong(4)+" : "+rs.getString(5));
				System.out.println("rent id  is ::" + rs.getInt(1));
				System.out.println("total amount  is ::" + rs.getInt(2));
				System.out.println("amount paid is :: " + rs.getInt(3));
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

	public void updateBill() throws SQLException {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			con = DbConnect.dbConnectMethod();
			con.setAutoCommit(false);
			String update = "update Bill set Total_amount=?,Amount_paid=? where Rent_id=?";
			pst = con.prepareStatement(update);
				
			
			//sc.nextLine();			
			
			
			System.out.println("enter the total amount");

			pst.setInt(1,Integer.parseInt(br.readLine()));
			System.out.println("enter the amount paid");
			
			
			
			
			pst.setInt(2, Integer.parseInt(br.readLine()));

			/*System.out.println("enter the rent id");
			pst.setInt(3, sc.nextInt());*/
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
					pst.setInt(3,c);
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

	public void deleteBillDetails() throws SQLException {
		try {

			con = DbConnect.dbConnectMethod();
			con.setAutoCommit(false);
			String delete = "delete from Bill where Rent_id=?";
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
	
	
	
	
	
	
	
	
	
	
	/*public void addBill(RentServiceImpl rsi) {
		System.out.println("enter the rent id");
		r.setRent_id(sc.nextInt());
		sc.nextLine();
		b.setRent_id(rsi.getRent());
		System.out.println("enter the total amount");
		b.setTotal_amount(sc.nextInt());
		sc.nextLine();
		System.out.println("enter the amount paid");
		b.setAmount_paid(sc.nextInt());
	}
	public void displayBill() {
	//	System.out.println("rent id  is ::"+ b.getRent_id());
		System.out.println("total amount  is :: "+b.getTotal_amount());
		System.out.println("amount paid is :: "+b.getAmount_paid());
	}
public Bill getBill() {
	return b;
}*/

}
