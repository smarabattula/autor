package dbms;

import java.util.Scanner;

public class queryMain {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Which service center has the most number of customers?");
		System.out.println("2. What is the average price of an Evaporator Repair for Hondas across all service centers?");
		System.out.println("3. Which customer(s) have unpaid invoices in Service Center 30003");
		System.out.println("4. List all services that are listed as both maintenance and repair services globally.");
		System.out.println("5. What is the difference between the cost of doing a belt replacement + schedule on a Toyota at center 30001 vs 30002?");
		System.out.println("6. What is the next eligible maintenance schedule service for the car with VIN 34KLE19D");
		System.out.println("7. Go back");
		String input = scanner.nextLine();
		switch (input)
		{
			case "1":
				queryMethods.query1();
				break;
			
			case "2":
				queryMethods.query2();
				break;
			
			case "3":
				queryMethods.query3();
				break;
				
			case "4":
				queryMethods.query4();
				break;
				
			case "5":
				queryMethods.query5();
				break;
				
			case "6":
				queryMethods.query6();
				break;
				
			case "7":
				CarWash.systemState = "Home";
				break;
				
			default:
				System.out.println("Error: please choose a valid input");
				break;
		}

	}

}
