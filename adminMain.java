package dbms;
import java.util.Scanner;
public class adminMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please submit data necessary to create a new Store.");
		System.out.print("Store ID:");
		String storeID = scanner.nextLine();
		System.out.print("Store Address:");
		String storeAddress = scanner.nextLine();
		System.out.print("Store Phone number:");
		String storePhoneNumber = scanner.nextLine();
		System.out.print("Manager first Name: ");
		String managerFirstName = scanner.nextLine();
		System.out.print("Manager Last Name:");
		String managerLastName = scanner.nextLine();
		System.out.print("Manager Username: ");
		String managerUserName = scanner.nextLine();
		System.out.print("Manager Phone number: ");
		String managerPhoneNumber = scanner.nextLine();
		System.out.print("Manager Address:");
		String managerAddress = scanner.nextLine();
		System.out.print("Manager Email: ");
		String managerEmail = scanner.nextLine();
//		System.out.print("Manager Password:");
//		String managerPassword = scanner.nextLine();
		System.out.print("Manager Salary:");
		String managerSalary = scanner.nextLine();
		System.out.print("Manager ID: ");
		String managerID = scanner.nextLine();
		System.out.print("Store Minimum Wage for mechanics:");
		String minWage = scanner.nextLine();
		System.out.print("Store Maximum Wage for mechanics: ");
		String maxWage = scanner.nextLine();
		System.out.print("Store Hourly rate for mechanics:");
		String hourlyRateForMechanics  = scanner.nextLine();
	
		// Perform add Store
		String addStoreOutcome = AdminMethods.addStore(storeID, storeAddress,storePhoneNumber,managerFirstName, managerLastName, managerUserName,managerPhoneNumber,managerAddress,managerEmail, managerSalary,managerID, minWage, maxWage,hourlyRateForMechanics );
		if (addStoreOutcome != "Error")
		{
			// Add Store successful
			System.out.println("Store added successfully.");
			CarWash.systemState = "Admin: Landing";
		}
		else
		{
			System.out.println("Error: Failed to create store. Please try again.");
		}
		

	}

}
