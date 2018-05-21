package oopClassExample;

public class Employee2 {

	//Properties
	public String employeeName;	
	public double salary;	
		
	//Constructors
	Employee2(String empName, double salary){
		this.employeeName = empName;
		this.salary = salary;
	}
	
	//Methods	
	public String display() {
		return "Employee: " + employeeName + "-Salary: " + String.format("$%.2f", salary);
	}

}
