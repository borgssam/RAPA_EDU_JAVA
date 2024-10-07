package ch02.sec02;

public class sample01 {

	public static void main(String[] args) {
		int total = 0;

		for (int i = 0; i < 5; i++) {
		    switch (i) {
		        case 1:
		        case 2:
		            total += i * 2;
		            break;
		        case 3:
		            total -= i;
		            break;
		        case 4:
		            total += 3;
		            break;
		    }
		}

		System.out.println(total);


	}

}
