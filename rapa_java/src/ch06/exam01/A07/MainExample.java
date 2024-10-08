package ch06.exam01.A07;

public class MainExample {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("홍길동");
		stu.setId("2400271");
		stu.setScore(77);

		System.out.println("이름:"+ stu.getName());
		System.out.println("학번:"+ stu.getId());
		System.out.println("점수:"+ stu.getScore());
		System.out.println("등급:"+ stu.getGrade());
		
	}
}
