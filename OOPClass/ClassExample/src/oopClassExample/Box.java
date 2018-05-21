package oopClassExample;

public class Box {
	
	
	//Properties
	private double width;	
	private double height;	
	private double length;
	
	
	//Getters
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public double getLength() {
		return length;
	}
	
	
	//Setters
	public void setWidth(double w) {
		if (w > 0) 
			this.width = w;
		else
			this.width = 0;
	}
	public void setHeight(double h) {
		if (h > 0) 
			this.height = h;
		else
			this.height = 0;
	}
	public void setLength(double l) {
		if (l > 0) 
			this.length = l;
		else
			this.length = 0;
	}

	
	//Constructos
	//Rectangle
	Box(double width, double length, double height){
		this.width = width;
		this.height = height;
		this.length = length;
	}	
	//Square
	Box(double size) {
		this.width = this.height = this.length = size;		
	}
	
	//Methods	
	public double volume() {		
		return this.width * this.height * this.length;		
	}	
	
}
