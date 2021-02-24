package com.coforge.OnlineRentalSystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.coforge.OnlineRentalSystem.bean.Address;
import com.coforge.OnlineRentalSystem.db.DbConnect;
import com.coforge.OnlineRentalSystem.service.CustomerServiceImpl;

public class AddressDaoImpl implements AddressDao {
	Scanner sc=new Scanner(System.in);
	Address a=null;
	
	
	static Connection con=null;
	static PreparedStatement pst=null;
	static Statement st=null;
	 static ResultSet rs=null; 
	
	
	
	 
	 //method to insert customer into database
	public void insertAddress() throws SQLException  {
		
		try {
			
			
			
			con=DbConnect.dbConnectMethod();
	con.setAutoCommit(false);
			
			
		String str="insert into Address values(?,?,?,?,?,?,?)";
		pst=con.prepareStatement(str);
		
		
	
		
		
		

		
		

		
		

		
	
	
		
		
		System.out.println("Customer Id:");
		
		pst.setInt(1,sc.nextInt());
		sc.nextLine();
	
		System.out.println("House no :");
	
		pst.setInt(2,sc.nextInt());
		sc.nextLine();

		System.out.println("Enter street name : ");
		pst.setString(3,sc.nextLine());
		System.out.println("Enter customer city name: ");
		pst.setString(4,sc.nextLine());
		
		System.out.println("Enter customer city pinCode ");
		pst.setLong(5,sc.nextLong());
		sc.nextLine();
		System.out.println("Enter customer state name ");
		
		pst.setString(6,sc.nextLine());

		System.out.println("enter the country name ");
		pst.setString(7,sc.nextLine());
		
		
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
	
	
	public void displayAllCustomerAddress() throws SQLException {
		try {
con=DbConnect.dbConnectMethod();
st=con.createStatement();
con.setAutoCommit(false);
String query="select * from Address";
System.out.println("reterieved data");
rs=st.executeQuery(query);




while(rs.next())
{
	
	
	
	
	
	
	
//System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getLong(4)+" : "+rs.getString(5));
	System.out.println("Customer Id: "+rs.getInt(1));
	System.out.println("customer house no  is :: "+rs.getInt(2));
	System.out.println("customer street name  is :: "+rs.getString(3));
	System.out.println("customer city  name is ::"+rs.getString(4));
	System.out.println("city pincode is :: "+rs.getLong(5));
	System.out.println("State name  is :: "+rs.getString(6));
	System.out.println("country name is :: "+rs.getString(7)+"\n\n");
	
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
	
	public void displayCustAddressById() throws SQLException {
		try {
			System.out.println("enter the id to display the customer address");
			int cust_Id=sc.nextInt();
con=DbConnect.dbConnectMethod();
st=con.createStatement();
con.setAutoCommit(false);
String query="select * from Address where customer_Id="+cust_Id;

System.out.println("reterieved data");
rs=st.executeQuery(query);
while(rs.next())
{
//System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getLong(4)+" : "+rs.getString(5));
	System.out.println("Customer Id: "+rs.getInt(1));
	System.out.println("customer house no  is :: "+rs.getInt(2));
	System.out.println("customer street name  is :: "+rs.getString(3));
	System.out.println("customer city  name is ::"+rs.getString(4));
	System.out.println("city pincode is :: "+rs.getLong(5));
	System.out.println("State name  is :: "+rs.getString(6));
	System.out.println("country name is :: "+rs.getString(7)+"\n\n");
	
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
	
	
	
	public void updateAddress() throws SQLException {
		try {
			
			con=DbConnect.dbConnectMethod();
			con.setAutoCommit(false);
			String update="update Address set house_no=?,street_name=?,pincode=?,state=?,country=? where customer_id=?";
			pst=con.prepareStatement(update);
	
			
			
		
			System.out.println("House no :");
		
			pst.setInt(1,sc.nextInt());
			sc.nextLine();

			System.out.println("Enter street name : ");
			pst.setString(2,sc.nextLine());
			System.out.println("Enter customer city name: ");
			pst.setString(3,sc.nextLine());
			
			System.out.println("Enter customer city pinCode ");
			pst.setLong(4,sc.nextLong());
			sc.nextLine();
			System.out.println("Enter customer state name ");
			
			pst.setString(5,sc.nextLine());

			System.out.println("enter the country name ");
			pst.setString(6,sc.nextLine());
			
			System.out.println("Customer Id:");
			
			pst.setInt(7,sc.nextInt());
			
			

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
	
	public void deleteCustomerAddress() throws SQLException {
		try {
			
			con=DbConnect.dbConnectMethod();
			con.setAutoCommit(false);
			String delete="delete from Address where customer_id=?";
			pst=con.prepareStatement(delete);

			System.out.println("Customer Id: ");
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
		
	
/*public void addCustomerAddress(CustomerServiceImpl csi) {
	a=new Address();
	a.setCustomer_id(csi.getC());

	System.out.println("Enter house no :");
	a.setHouse_no(sc.nextInt());
	sc.nextLine();
	
	System.out.println("Enter street name : ");
	a.setStreet_name(sc.nextLine());
	

	
	System.out.println("Enter customer city name: ");

	
	a.setCity(sc.nextLine());

	System.out.println("Enter customer city pinCode ");
	
a.setPincode(sc.nextInt());
sc.nextLine();
	System.out.println("Enter customer state name ");
	
a.setState(sc.nextLine());
System.out.println("enter the country name ");
a.setCountry(sc.nextLine());

}
public void displayCustomerAddress() {
	System.out.println("customer id is ::"+ a.getCustomer_id());
	System.out.println("customer house no  is :: "+ a.getHouse_no());
	System.out.println("customer street name  is :: "+ a.getStreet_name());
	System.out.println("customer city  name is :: "+ a.getCity());
	System.out.println("city pincode is :: "+ a.getPincode());
	System.out.println("State name  is :: "+ a.getState());
	System.out.println("country name is :: "+ a.getCountry());
	
	
}
*/


}
