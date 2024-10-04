package ch02.sec04;

public class Sample2 {
	public static int print(String msg) {
		System.out.println( msg );
		return 0;
	}
	public static void main(String[] args) {
		int a = 10;
		String result = (a>=0) ? "양수" : "음수";
		System.out.println(result);

		
        int b = 0;  // 변수 b를 0으로 초기화

        // 삼항 연산자를 사용한 조건문
		int result_b = (b==0)? print("제로입니다."): print("제로가 아닙니다.");
		System.out.println(result_b);


	}

}
