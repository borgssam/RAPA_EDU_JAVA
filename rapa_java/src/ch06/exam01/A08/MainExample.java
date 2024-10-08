package ch06.exam01.A08;

public class MainExample {

	public static void main(String[] args) {
		Circle c = new Circle(10,"RED");

		System.out.println("원의 면적:"+c.getArea());
		System.out.println("원의 둘레:"+c.getPerimeter());
		System.out.println("원의 색상:"+c.getColor());
		
		Rectangle r = new Rectangle(30.0,50.0,"BLUE");
		System.out.println("사각형의 면적:"+r.getArea());
		System.out.println("사각형의 둘레:"+r.getPerimeter());
		System.out.println("사각형의 색상:"+r.getColor());
		
		

	}

}
