package dbms;
import java.sql.*;

public class AdminMethods {
	
	public static String addStore(String storeID, String storeAddress, String storePhoneNumber, 
 					String managerFirstName,String managerLastName,String managerUserName,String managerPhoneNumber, String managerAddress,String managerEmail,  String managerSalary,String managerID,String minWage,String maxWage, String hourlyRateForMechanics)
	{
		//Insert a Store
		String managerFullName = managerFirstName.concat(managerLastName);
		try 
		{  
		 CarWash.conn=DBInstance.createConnection();
		 Statement stmt = CarWash.conn.createStatement();
	        try
	        {
		         		// Construct inserts - Manager and Store
				stmt.executeUpdate("CREATE TABLE MANAGER123(MANAGER_ID number PRIMARY KEY, Manager_ansal float, name varchar(50), phn_no varchar(15), address varchar(50), email varchar(30))");
				String SQLManagerText = (
		              "INSERT INTO MANAGER123 VALUES (" + managerID + "," + managerSalary + "," + "'"+ managerFullName + "'" + "," + managerPhoneNumber + "," + "'" + managerAddress + "'" + "," + "'" + managerEmail + "'" +
		              ")");
				stmt.executeUpdate(SQLManagerText);
				stmt.executeUpdate("CREATE TABLE SERVICE_CENTER123(SVC_ID number PRIMARY KEY,MANAGER_ID number DEFAULT NULL, phn_no varchar(15), address varchar(100),Saturday_flag smallint DEFAULT 0, mech_hourly_wages float, Min_wage number,Max_wage number, CONSTRAINT FK_MGR123 FOREIGN KEY(MANAGER_ID) REFERENCES MANAGER123(MANAGER_ID) ON DELETE SET NULL)");
				String SQLServiceCenterText = ( 
			              "INSERT INTO SERVICE_CENTER123 VALUES (" + storeID + "," + managerID + "," + storePhoneNumber + "," + "'" + storeAddress + "'" + ","+"0"+"," + hourlyRateForMechanics + "," + minWage + "," + maxWage + 
			              ")");
				stmt.executeUpdate(SQLServiceCenterText);
	        }
	        finally 
	        {
	            DBInstance.close(stmt);
	        }
		}
		catch(Throwable oops) 
		{
         oops.printStackTrace();
         return "Error";
	    }
		return "Success";
	}
	
	public static String addService(String serviceCategory, String serviceName, String serviceDuration, 
			String serviceID,String priceTier)
{
try 
{  
 CarWash.conn=DBInstance.createConnection();
 Statement stmt = CarWash.conn.createStatement();
    try
    {
         		// Construct inserts - Service
		//stmt.executeUpdate("CREATE TABLE REPAIR_SERVICES123(SERVICE_ID number PRIMARY KEY, repair_category varchar(50), repair_subcategory varchar(50), pricing_tier number, time_hrs number)");
		
		String query = "select count(*) from REPAIR_SERVICES123 where repair_category = " + "'" + serviceCategory + "'";
	      //Executing the query
	      ResultSet rs = stmt.executeQuery(query);
	      //Retrieving the result
	      rs.next();
	      int count = rs.getInt(1); 
	      if(count>0){
	    	  
	    	  String SQLServiceText = (
	                  "INSERT INTO REPAIR_SERVICES123 VALUES(" + serviceID + "," + "'" + serviceCategory + "'" + "," + "'" + serviceName + "'" + "," + priceTier + "," + serviceDuration +
	                  ")");
	    		stmt.executeUpdate(SQLServiceText);  
	      }else {
	    	  System.out.println("Category not found");
	    	  return "Error";
	      }	
    }
    finally 
    {
        DBInstance.close(stmt);
    }
}
catch(Throwable oops) 
{
 oops.printStackTrace();
 return "Error";
}
return "Success";
}
	
	
}