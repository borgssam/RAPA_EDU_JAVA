package ch12.sec05;

import java.util.Arrays;

public class SplitExample {

	public static void main(String[] args) {
	    String data = "apple123, orange; banana. kiwi:grape banana42@orange90";
	        
        // 정규표현식을 사용해 쉼표, 세미콜론, 마침표, 콜론, 공백을 포함해 
	       //숫자나 특수문자로 시작하는 문자들을 구분자로 사용
        String[] tokens = data.split("[,;.:\\s@]+");  // 여러 구분자를 포함한 정규표현식
        String strAge = "10";
        int age = Integer.parseInt(strAge);
        
        String strWeight = "45.67";
        double weight = Double.parseDouble(strWeight);
        
        // 결과 출력
        System.out.println(Arrays.toString(tokens));	

	}

}
