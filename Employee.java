package com.session.shallowcloning;

// Serializable
// Cloneable  ==> Marker or Tagged Interface's..
public class Employee implements Cloneable {
	private int empId;
	private String empName;
	private Department department; // Dependent Object // HAS A Relation Ship //
									// Aggregation

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", department=" + department + "] " + "\n"
				+ "and department Hash Code" + "\t" + department.hashCode();
	}

	public Employee(int empId, String empName, Department department) {
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
