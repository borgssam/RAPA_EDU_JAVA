package ch05.sec12;

public class Exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {11,5,3,8,2};
		int _max = -1;
		for(int value : array) {
			if(value > _max ) { _max = value;}
		}
		
		System.out.println("최대값:"+_max);

	}

}
