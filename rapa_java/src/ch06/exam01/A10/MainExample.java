package ch06.exam01.A10;

public class MainExample {
	
	public static int method(Calculator aCal, int a, int b) {
		return aCal.calculate(a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator adder = new Adder();

		System.out.println("연산자종류:"+ adder.OPERATION);
		System.out.println("결과:"+ adder.calculate(5, 3));
		
		Calculator mutiplier = new Multiplier();
		System.out.println("연산자종류:"+ mutiplier.OPERATION);
		System.out.println("결과:"+ mutiplier.calculate(5, 3));	

		System.out.println("결과"+method(adder, 5, 3));
		System.out.println("결과"+method(mutiplier, 5, 3));
		

	}

}
