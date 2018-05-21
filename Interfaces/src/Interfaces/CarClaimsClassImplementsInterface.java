package Interfaces;

public class CarClaimsClassImplementsInterface implements IClaims {

	@Override
	public void personalDetails() {
		
		System.out.println("(Interface) What is your name: ");
		
	}

	@Override
	public void productDetails() {
		
		System.out.println("(Interface) What is the product name: ");
		
	}

	@Override
	public double carDetails() {
		
		return 20;
	}

	
}
