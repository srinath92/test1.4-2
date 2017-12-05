package com.session.abstractclass.examples;

public class CEmployee extends Employee {
	private int numberOfDays;
	private double perDayCost;

	public CEmployee(int empNumber, String empName, String empJob,
			int empDeptNumber, String empPassWord, int numberOfDays,
			double perDayCost) {
		super(empNumber, empName, empJob, empDeptNumber, empPassWord);
		System.out.println("I Am From CEmployee Cons:" + this.hashCode());
		this.numberOfDays = numberOfDays;
		this.perDayCost = perDayCost;
	}

	@Override
	protected double doSalaryCaliculation() {
		// We are forcing the sub class
		// developer to strictly follow
		// the protocol
		double takeHomeSalary = 0.0d;
		takeHomeSalary = Math.round(perDayCost * numberOfDays);
		return takeHomeSalary;
	}

	@Override
	public void displayEmployeeDetails() {
		super.displayEmployeeDetails();// super at method level
		System.out.println("Employee Per Day Salary:" + "\t" + perDayCost);
		System.out.println("Employee Worked Days:" + "\t" + numberOfDays);
		double takeHomeSalary = doSalaryCaliculation();
		System.out.println("Employee Take Home Salary:" + takeHomeSalary);
	}

}
