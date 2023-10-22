package dbms;
import java.util.Scanner;
public class adminAddService {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please submit data necessary to create a new Service.");
		System.out.print("Enter existing Service Category: ");
		String serviceCategory = scanner.nextLine();
		System.out.print("Service name:");
		String serviceName = scanner.nextLine();
		System.out.print("Duration of Service:");
		String serviceDuration = scanner.nextLine();
		System.out.print("Service ID: ");
		String serviceID = scanner.nextLine();
		System.out.print("Price Tier:");
		String priceTier = scanner.nextLine();
	
		// Perform add Service
		String addStoreOutcome = AdminMethods.addService(serviceCategory, serviceName,serviceDuration,serviceID, priceTier);
		if (addStoreOutcome != "Error")
		{
			// Add Store successful
			System.out.println("Service added successfully.");
			CarWash.systemState = "Admin: Landing";
		}
		else
		{
			System.out.println("Error: Failed to create service. Please try again.");
		}
		

	}

}
