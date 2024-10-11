package ch11.exma01;

import java.util.ArrayList;

public class ExceptionExample {
	private static ArrayList<Member> list = new ArrayList<>();
	public static void addMember(String name, int age) throws MyException {
		if(age<18) {
			throw new MyException(name+"은 미성년자입니다. 미성년자는 클럽회원이 될수없습니다.");
		}
		list.add(new Member(name,age));
	}
	
	public static void main(String[] args) {
		 try {
			 addMember("홍길동", 22);
			 addMember("나관중", 60);
			 addMember("유치원", 4);
			 addMember("어린이", 15);
			 System.out.println("회원목록");
			 for(Member m : list) {
				 System.out.println("이름:"+m.name+", 나이:"+m.age+"");
			 }
		 } catch(MyException e) {
			 System.err.println(e.getMessage());
		 }finally {
			 System.out.println("프로그램종료");
		 }
		 
	}

}
