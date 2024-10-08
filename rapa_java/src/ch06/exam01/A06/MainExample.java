package ch06.exam01.A06;

public class MainExample {

	public static void main(String[] args) {
		Car car = new Car();
		car.setBrand("현대자동차");
		car.setSpeed(300);
		
		System.out.println("브랜드:"+car.getBrand());
		System.out.println("속도:"+car.getSpeed());

	}

}
