package ch12.sec05;

public class ValueComareExample {

	public static void main(String[] args) {
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("== =>" +  (obj1 == obj2));
		System.out.println("equals =>" +  (obj1.equals(obj2)));
		System.out.println("== =>" +  ((int)obj1 == obj2));

		Integer obj3 = 100;
		Integer obj4 = 100;
		System.out.println("== =>" +  (obj3 == obj4));
		System.out.println("equals =>" +  (obj3.equals(obj4)));
		System.out.println("== =>" +  ((int)obj3 == obj4));

	}

}
