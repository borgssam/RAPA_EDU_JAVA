package ch12.sec03.exam02;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member m1 = new Member("winder", "눈송이", 25);

		System.out.println(m1.toString());
		System.out.println(m1.name());
		System.err.println(m1.toString());
	}

}
