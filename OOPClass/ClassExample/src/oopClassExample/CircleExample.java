package oopClassExample;

public class CircleExample {

	public static void main(String[] args) {
		
		Circle myCircle = new Circle(1);
				
		System.out.printf("For a circle of radius %.2f %n", myCircle.radius);		
		System.out.printf("A diameter of %.2f, area of %.15f %n", myCircle.diameter(), myCircle.circleArea());

		Cylinder myCylinder = new Cylinder(3, 4);
		
		System.out.printf("For a cylinder of radius %.2f and length of %.2f %n", myCylinder.radius, myCylinder.length);		
		System.out.printf("The volume is %.2f %n", myCylinder.calculateVolume());
		
		
	}

}
