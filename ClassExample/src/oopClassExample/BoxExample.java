package oopClassExample;

public class BoxExample {
	
	public static void main(String[] args) {
		
		//Red Box
		Box redBox = new Box(10, 20, 15);		
		
		//System.out.println("The box's volume is : " + redBox.volume());
		System.out.printf("Volume is : %.1f %n", redBox.volume());
		System.out.printf("for a red box %.2f by %.2f by %.2f %n", redBox.getWidth(), redBox.getHeight(), redBox.getLength() );
		
		
		//Blue Box
		Box blueBox = new Box(3, 6, 9);
				
		//System.out.println("The box's volume is : " + blueBox.volume());
		System.out.printf("Volume is : %.1f %n", blueBox.volume());
		System.out.printf("for a blue box %.2f by %.2f by %.2f %n", blueBox.getWidth(), blueBox.getHeight(), blueBox.getLength() );

		//Square Box
		Box squareBox = new Box(4);
				
		//System.out.println("The box's volume is : " + squareBox.volume());
		System.out.printf("Volume is : %.1f %n", squareBox.volume());
		System.out.printf("for a square box %.2f by %.2f by %.2f %n", squareBox.getWidth(), squareBox.getHeight(), squareBox.getLength() );


	}
	
}
