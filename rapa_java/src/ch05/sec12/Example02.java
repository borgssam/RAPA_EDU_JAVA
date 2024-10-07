package ch05.sec12;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드입력받기
		// Scanner 사용
		// import java.util.Scanner
		//  nextLine(문자열입력)  nextInt(숫자입력)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열입력:");
		String strBuffer = scan.nextLine();
		System.out.println("당신이 입력하신 값은 [" +strBuffer+"]입니다.");

		System.out.print("첫번째 숫자입력:");
		int intBuffer1 = scan.nextInt();
		System.out.print("두번째 숫자입력:");
		int intBuffer2 = scan.nextInt();
		System.out.println("당신이 입력하신 숫자의 합은 ["+(intBuffer1+intBuffer2)+"]입니다.");
	}

}
