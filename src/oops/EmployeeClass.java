package oops;

public class EmployeeClass {
	public int EmpId;
	public String Department;
	public String Name;
	
	public EmployeeClass() {
		System.out.println("Inside Default Constructor");
	}
	
	public EmployeeClass(String P1, int P2, String P3) {
		Name = P1;
		Department = P3;
		EmpId = P2;
		
	}
	
	public void display() {
		System.out.println(Name);
		System.out.println(EmpId);
		System.out.println(Department);
		System.out.println("Test");
		System.out.println("test");
	}

	
}
