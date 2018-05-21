package Interfaces;

public class ClaimsClass {

	public static void main(String[] args) {
		
		CarClaimsClass myCarClaimsClass = new CarClaimsClass();
		
		myCarClaimsClass.personalDetails();
		myCarClaimsClass.productDetails();
		
		CarClaimsClassImplementsInterface myCarClaimsClassImplementsInterface = new CarClaimsClassImplementsInterface();
		
		myCarClaimsClassImplementsInterface.personalDetails();
		myCarClaimsClassImplementsInterface.productDetails();
		System.out.println("(Interface) " + myCarClaimsClassImplementsInterface.carDetails());
	}

}
