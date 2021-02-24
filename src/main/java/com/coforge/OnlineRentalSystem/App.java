package com.coforge.OnlineRentalSystem;

import java.sql.SQLException;
import java.util.Scanner;

import com.coforge.OnlineRentalSystem.dao.AddressDao;
import com.coforge.OnlineRentalSystem.dao.BillDao;
import com.coforge.OnlineRentalSystem.dao.CustomerDao;
import com.coforge.OnlineRentalSystem.dao.ProductDao;
import com.coforge.OnlineRentalSystem.dao.RentDao;
import com.coforge.OnlineRentalSystem.dao.ServiceDao;
import com.coforge.OnlineRentalSystem.dao.StatusDao;
import com.coforge.OnlineRentalSystem.dao.TypeOfProductDao;
import com.coforge.OnlineRentalSystem.service.AddressServiceImpl;
import com.coforge.OnlineRentalSystem.service.BilServiceImpl;
import com.coforge.OnlineRentalSystem.service.CustomerServiceImpl;
import com.coforge.OnlineRentalSystem.service.ProductServiceImpl;
import com.coforge.OnlineRentalSystem.service.RentServiceImpl;
import com.coforge.OnlineRentalSystem.service.ServiceServImpl;
import com.coforge.OnlineRentalSystem.service.StatusServiceImpl;
import com.coforge.OnlineRentalSystem.service.TypeOfProductImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {	Scanner sc=new Scanner(System.in);
       /* CustomerDao cd=new CustomerDao();
        
        AddressDao ad=new AddressDao();
        
        ProductDao pd=new ProductDao();
        
        TypeOfProductDao tpd=new TypeOfProductDao();
        RentDao rd=new RentDao();
        BillDao bd=new BillDao();
        ServiceDao sd=new ServiceDao();
        StatusDao sdo=new StatusDao();
        
        
        cd.addCustomer();
        ad.addCustomerAddress(cd);  
  //  ad.addCustomerAddress();
        pd.addProduct();
        tpd.addTypeOfProduct(pd);
        rd.addRent(pd,cd);
        bd.addBill(rd);
        sd.addService(rd);
        sdo.addStatus(rd);*/
       /* System.out.println("enter input -->>\n 1.display Customer \n 2.display Address \n 3.display product \n 4.display type of product \n 5.display Rent \n 6. display Bill \n 7.display service \n 8.display status");
        int i=sc.nextInt(); 
        switch(i) {
        case 1:
        cd.displayCustomer();
        break;
        case 2:
        ad.displayCustomerAddress();
        break;
        case 3:
        pd.displayProduct();
        break;
        case 4:
        tpd.displayTypeOfProduct();
        break;
        case 5:
        rd.displayRent();
        break;
        case 6:
        bd.displayBill();
        break;
        case 7:
        sd.displayBill();
       break;
        case 8:
        sdo.displayStatus();
        break;
        default:
        	System.out.println("you enter wrong input");
        }*/
   CustomerServiceImpl csi=new CustomerServiceImpl();
    
    AddressServiceImpl asi=new AddressServiceImpl();
    
    ProductServiceImpl psi=new ProductServiceImpl();
    
    TypeOfProductImpl tpi=new TypeOfProductImpl();
    
    RentServiceImpl rsi=new RentServiceImpl();
    
    ServiceServImpl ssi=new ServiceServImpl();
    
    BilServiceImpl bsi=new BilServiceImpl();
    
    StatusServiceImpl sti=new StatusServiceImpl();
    
    
    
    boolean flag= true;
	while(flag) {
		System.out.println("Enter\n1-->Add Customer"
    			+ "\n2-->Add Address"
    			+ "\n3-->Add Product"
    			+ "\n4-->Add Product_type"
    			+ "\n5-->Add Rent details"
    			+ "\n6-->Add Service "
    			+ "\n7-->Add Bill"
    			+ "\n8-->Add Status"
    			+ "\n--> Any other number to exit !!");
    	
		switch (sc.nextInt()) {
		case 1:
			csi.insert();
			break;
		case 2:
			asi.insertAddress();
			break;
		case 3:
			psi.insertProduct();
			break;
		case 4:
			tpi.insert();
			break;
		case 5:
			rsi.insert();
			break;
		case 6:
			ssi.insert();
			break;
		case 7:
			bsi.insert();
			break;
		case 8:
			sti.insert();
			break;
		default:
			flag=false;
			break;
		}
	}
    
	boolean flag2= true;
	while(flag2) {
		System.out.println("Enter\n1-->Retreive Customer"
    			+ "\n2-->Retreive Address"
    			+ "\n3-->Retreive Product"
    			+ "\n4-->Retreive Product_type"
    			+ "\n5-->Retreive Rent details"
    			+ "\n6-->Retreive Service "
    			+ "\n7-->Retreive Bill"
    			+ "\n8-->Retreive Status"
    			+ "\n--> Any other number to exit !!");
    	
		switch (sc.nextInt()) {
		case 1:
			csi.displayAllCustomer();
			break;
		case 2:
			asi.displayAllCustomerAddress();
			break;
		case 3:
			psi.displayAllProduct();
			break;
		case 4:
			tpi.displayAllProductType();
			break;
		case 5:
			rsi.displayAllRentDetails();
			break;
		case 6:
			ssi.displayAllServiceDetails();
			break;
		case 7:
			bsi.displayAllBillDetails();
			break;
		case 8:
			sti.displayAllStatusDetails();
			break;
		default:
			flag2=false;
			break;
		}
	}
    
	
	boolean flag3= true;
	while(flag3) {
		System.out.println("Enter\n1-->Retreive Customer By id"
    			+ "\n2-->Retreive Address By id"
    			+ "\n3-->Retreive Product By id"
    			+ "\n4-->Retreive Product_type By id"
    			+ "\n5-->Retreive Rent details By id"
    			+ "\n6-->Retreive Service By id "
    			+ "\n7-->Retreive Bill By id"
    			+ "\n8-->Retreive Status By id"
    			+ "\n--> Any other number to exit !!");
    	
		switch (sc.nextInt()) {
		case 1:
			csi.displayByCustId();
			break;
		case 2:
			asi.displayCustAddressById();
			break;
		case 3:
			psi.displayByProductId();
			break;
		case 4:
			tpi.displayProductTypeById();
			break;
		case 5:
			rsi.displayByRentId();
			break;
		case 6:
			ssi.displayByServiceId();
			break;
		case 7:
			bsi.displayBillByRentId();
			break;
		case 8:
			sti.displayStatusByRentId();
			break;
		default:
			flag3=false;
			break;
		}
	}
	boolean flag4= true;
	while(flag4) {
		System.out.println("Enter\n1-->Update Customer"
    			+ "\n2-->Update Address"
    			+ "\n3-->Update Product"
    			+ "\n4-->Update Product_type"
    			+ "\n5-->Update Rent details"
    			+ "\n6-->Update Service"
    			+ "\n7-->Update Bill"
    			+ "\n8-->Update Status"
    			+ "\n--> Any other number to exit !!");
    	
		switch (sc.nextInt()) {
		case 1:
			csi.updateCustomer();
			break;
		case 2:
			asi.updateAddress();
			break;
		case 3:
			psi.updateProduct();
			break;
		case 4:
			tpi.updateTypeOfProduct();
			break;
		case 5:
			rsi.updateRent();
			break;
		case 6:
			ssi.updateService();
			break;
		case 7:
			bsi.updateBill();
			break;
		case 8:
			sti.updateRent();
			break;
		default:
			flag4=false;
			break;
		}
	}
    
	boolean flag5= true;
	while(flag5) {
		System.out.println("Enter\n1-->Delete Customer"
    			+ "\n2-->Delete Address"
    			+ "\n3-->Delete Product"
    			+ "\n4-->Delete Product_type"
    			+ "\n5-->Delete Rent details"
    			+ "\n6-->Delete Service"
    			+ "\n7-->Delete Bill"
    			+ "\n8-->Delete Status"
    			+ "\n--> Any other number to exit !!");
    	
		switch (sc.nextInt()) {
		case 1:
			csi.deleteCustomer();
			break;
		case 2:
			asi.deleteCustomerAddress();
			break;
		case 3:
			psi.deleteProduct();
			break;
		case 4:
			tpi.deleteTypeOfProduct();
			break;
		case 5:
			rsi.deleteRentDetails();
			break;
		case 6:
			ssi.deleteServiceDetails();
			break;
		case 7:
			bsi.deleteBillDetails();
			break;
		case 8:
			sti.deleteRentDetails();
			break;
		default:
			flag5=false;
			break;
		}
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   /* csi.addCust();
    asi.addCustomerAddress(csi);
    psi.addProduct();
    tpi.addTypeOfProduct(psi);
    rsi.addRent(psi,csi);
    ssi.addService(rsi);
    bsi.addBill(rsi);
    sti.addStatus(rsi);
    csi.dispCust();
    asi.displayCustomerAddress();
    psi.dispProduct();
    tpi.displayTypeOfProduct();
    rsi.displayRent();
    ssi.displayService();
    bsi.displayBill();
    sti.displayStatus();
    */
    
    
        }
}
