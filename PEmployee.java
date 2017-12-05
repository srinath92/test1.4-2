package com.session.abstractclass.examples;

public class PEmployee extends Employee {
	private double empBasic;
	private double empComm;

	public PEmployee(int empNumber, String empName, String empJob,
			int empDeptNumber, String empPassWord, double empBasic,
			double empComm) {
		// super at constructor level
		super(empNumber, empName, empJob, empDeptNumber, empPassWord);
		System.out.println("I Am From PEmployee Cons:" + this.hashCode());
		this.empBasic = empBasic;
		this.empComm = empComm;
	}

	@Override
	protected double doSalaryCaliculation() { // We are forcing the sub class
												// developer to strictly follow
												// the protocol
		double takeHomeSalary = 0.0d;
		if (empDeptNumber == 10) {
			takeHomeSalary = Math.round(empBasic + empBasic * .04 + empBasic
					* .03 + empComm);
		} else if (empDeptNumber == 20) {
			takeHomeSalary = Math.round(empBasic + empBasic * .03 + empBasic
					* .03 + empComm);
		} else if (empDeptNumber == 30) {
			takeHomeSalary = Math.round(empBasic + empBasic * .02 + empBasic
					* .02 + empComm);
		} else {
			takeHomeSalary = Math.round(empBasic + empComm);
		}
		return takeHomeSalary;
	}

	@Override
	public void displayEmployeeDetails() {
		super.displayEmployeeDetails();// super at method level
		System.out.println("Employee Basic:" + "\t" + empBasic);
		System.out.println("Employee Commission:" + "\t" + empComm);
		double takeHomeSalary = doSalaryCaliculation();
		System.out.println("Employee Take Home Salary:" + takeHomeSalary);
	}
}
