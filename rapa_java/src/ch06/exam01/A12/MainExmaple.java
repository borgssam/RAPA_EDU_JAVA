package ch06.exam01.A12;

public class MainExmaple {

	public static void main(String[] args) {
		FullTimeEmployee ftemp = new FullTimeEmployee("홍길동");
		PartTimeEmployee ptemp = new PartTimeEmployee("나계약", 1.0, 30);

		System.out.println(ftemp.getName()+"의 급여는 " + ftemp.calculateSalary());
		System.out.println(ptemp.getName()+"의 급여는 " + ptemp.calculateSalary());
		

	}

}
