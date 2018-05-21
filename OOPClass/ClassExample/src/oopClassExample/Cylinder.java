package oopClassExample;

public class Cylinder extends Circle {

	//Properties
	public double length;
	
	//Constructors
	public Cylinder(double radius, double length) {
		//FIRST, we call the parent constructor
		super(radius);
		this.length = length;
	}
	
	//Methods
	public double calculateVolume() {
		return super.circleArea() * length;
	}

}
