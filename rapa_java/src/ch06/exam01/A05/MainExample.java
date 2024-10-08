package ch06.exam01.A05;

public class MainExample {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("홍길동");
		person.setAge(30);
		
		System.out.println("이름:"+person.getName());
		System.out.println("나이:"+person.getAge());

	}

}
