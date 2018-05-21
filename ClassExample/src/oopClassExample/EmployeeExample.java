package oopClassExample;

public class EmployeeExample {
	
	public static void main(String[] args) {
		
		//Joe Smith
		Employee JSmith = new Employee("Joe Smith", 1800, 200);

		//System.out.printf("%s has a total salary of $%.2f %n", JSmith.name, JSmith.totalSalary());
		JSmith.displayEmployee();
		
		//Daniel Brown
		Employee DBrown = new Employee("Daniel Brown", 2200, 350);

		DBrown.displayEmployee();
		//System.out.printf("%s has a total salary of $%.2f %n", DBrown.name, DBrown.totalSalary());
		
		//Gerry Bryne
		Employee2 GBryne = new Employee2("Daniel Brown", 45000);
		
		System.out.println(GBryne.display());

		//David Wilson
		Manager DWilson = new Manager("David Wilson", 42000, 1500);

		System.out.println(DWilson.display());


	}
	
}
