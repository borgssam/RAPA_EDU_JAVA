package ch12.sec03.exam02;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student(100,"홍길동");
		Student s2 = new Student(100,"홍길동2");
		Student s3 = new Student(100,"홍만동");
		Student s4 = s1;
		
		System.out.println(s1);
		System.out.println(Integer.toHexString(s1.hashCode()));

		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));

	}

}
