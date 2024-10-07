package ch05.sec11;

public class MainArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {

			System.out.println("입력값 수량 불일치");
			System.exit(0);
		}
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		try {
			int num1 = Integer.parseInt(strNum1);
			int num2 = Integer.parseInt(strNum2);
			System.out.println(num1+"+"+num2+"=" + (num1+num2) );
		} catch (Exception e){
			System.out.println("입력값 오류");
		}
	}
}
