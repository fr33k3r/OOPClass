package oopClassExample;

public class Circle {
	
	//Properties
	public double radius;
	
	//Constructors
	Circle(double radius){
		this.radius = radius;
	}
	
	//Methods
	public double diameter() {
		return 2 * radius;
	}
	
	public double circleArea() {
		return Math.PI * radius * radius;
	}
}
