package ch06.exam01.A08;

public class Rectangle {
	private double width;
	private double height;
	private String color;
	
	public Rectangle(double width, double height, String color) {
		super();
		this.width = width;
		this.height = height;
		this.color = color;
	}
	

	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {

		return 2*(width+height);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
