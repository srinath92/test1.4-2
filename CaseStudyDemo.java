package com.session.abstractclass.examples;

import java.util.Scanner;

public class CaseStudyDemo {
	public static void main(String[] args) {
		System.out.println("I Am From Main Metod");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Type of Employee");
		String empType = scanner.next();
		Employee employee = null; // polymorphic object
		if ("PEmployee".equals(empType)) {
			employee = new PEmployee(2001, "ZZZ", "Tester", 10, "Guest@321",
					9000, 2456);
		} else if ("CEmployee".equals(empType)) {
			employee = new CEmployee(2002, "BBB", "Tester", 20, "Aa@123", 24,
					780.50d);
		} else {
			System.out.println("Enter Correct Type OF Employee");
			System.exit(0);
		}
		// polymorphic statements
		employee.changePassWord("Admin@123"); // The Method Call will be
												// resolved by the JVM at
												// runtime
		employee.displayEmployeeDetails(); // Run time Polymorphisam
		scanner.close();
	}
}
