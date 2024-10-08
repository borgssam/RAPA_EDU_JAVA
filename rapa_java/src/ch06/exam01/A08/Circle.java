package ch06.exam01.A08;

public class Circle {
	private final double PI = 3.14;
	private double radius;
	private String color;
	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}
	
	public double getArea() {
		return radius*radius*PI;
	}
	public double getPerimeter() {

		return 2*radius*PI;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
