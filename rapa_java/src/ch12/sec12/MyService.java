package ch12.sec12;

public class MyService {
	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용1");
	}
	@PrintAnnotation(value="*")
	public void method2() {
		System.out.println("실행 내용2");
	}
	@PrintAnnotation(value="#",number=20)
	public void method3() {
		System.out.println("실행 내용3");
	}
}