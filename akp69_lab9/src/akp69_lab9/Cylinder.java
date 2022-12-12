package akp69_lab9;

public class Cylinder extends Circle{
	
	private double height = 8.0;
	
	public Cylinder() {
		
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public Cylinder(double radius, double height, String color) {
		super(radius,color);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return Math.PI * (getRadius() * getRadius()) * height;
	}
	
	
}