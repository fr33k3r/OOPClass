package oopClassExample;

public class Manager extends Employee2{

	//Properties
	public double bonus;	
		
	//Constructors
	Manager(String name, double salary, double bonus){
		super(name, salary);
		this.bonus = bonus;
	}
	
	//Methods	
	public double calculateSalary() {
		return salary + bonus;
	}
	public String display() {
		return super.display() + " with Bonus giving a Total: " + String.format("$%.2f", calculateSalary());
	}

}
