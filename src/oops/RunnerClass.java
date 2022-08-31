package oops;

import java.util.Random;

public class RunnerClass {

	public static void main(String[] args) {
		EmployeeClass E1 = new EmployeeClass();
		E1.Name = "Mike";
		E1.EmpId = 558;
		E1.Department = "HR";
		E1.display();
		
		EmployeeClass E2 = new EmployeeClass("Jack", 552, "IT");
	E2.display();
	}

}
