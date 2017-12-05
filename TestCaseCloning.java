package com.session.shallowcloning;

public class TestCaseCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Department dept = new Department(10, "Human Resource");
		Employee originalEmp = new Employee(1, "HR_Srinivas", dept);
		// Lets Create a Clone of original object
		Employee clonedEmp = (Employee) originalEmp.clone();
		// Lets Verify Using Employee ID , if cloning actually worked
		System.out.println(originalEmp.getEmpId());
		System.out.println(clonedEmp.getEmpId());
		// Verify JDK's rules
		// Must be true and objects must have different memory addresses
		System.out.println(originalEmp.hashCode());
		System.out.println(clonedEmp.hashCode());
		System.out.println(originalEmp != clonedEmp);

		// As we are returning same class; so it should be true
		System.out.println(originalEmp.getClass());
		System.out.println(clonedEmp.getClass());
		System.out.println(originalEmp.getClass() == clonedEmp.getClass());

		// Default equal method checks for references so it should be false
		System.out.println(originalEmp.equals(clonedEmp));
	}
}
