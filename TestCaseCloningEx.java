package com.session.shallowcloning;

public class TestCaseCloningEx {
	public static void main(String[] args) throws CloneNotSupportedException {
		Department dept = new Department(10, "Human Resource");
		Employee originalEmp = new Employee(1, "HR_Srinivas", dept);

		System.out.println("Original Object State:" + originalEmp);
		// Lets Create a Clone of original object
		Employee clonedEmp = (Employee) originalEmp.clone();
		System.out.println("Cloned Object State:" + clonedEmp);
		// Let Change the department name in cloned object and we will verify
		// in original object
		clonedEmp.getDepartment().setDeptName("Training");
		System.out.println("HashCode For Cloned Object:" + clonedEmp.hashCode());
		System.out.println(clonedEmp);
		System.out.println(originalEmp.getDepartment().getDeptName());
		System.out.println("HashCode For Original Object:"
				+ originalEmp.hashCode());
		System.out.println(originalEmp);
	}
}
/*
 * OOPs..!! cloned object changes are visible in original also. This way cloned
 * objects can make havoc in system if allowed to do so. any body can come and
 * clone your application objects and do what ever they want.
 * 
 * We can prevent this by using deep cloning and use of copy constructors
 */
