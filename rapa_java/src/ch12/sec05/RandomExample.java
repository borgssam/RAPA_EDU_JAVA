package ch12.sec05;
import java.util.*;
public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] selectNumber = new int[6];
		Random random = new Random(4);
		System.out.println("선택번호");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) +1;
			System.out.print(selectNumber[i] + ", ");
		}
		System.out.println();

		int[] winnerNumber = new int[6];
		random = new Random(4);
		System.out.println("당첨번호");
		for(int i=0; i<6; i++) {
			winnerNumber[i] = random.nextInt(45) +1;
			System.out.print(winnerNumber[i] + ", ");
		}
		System.out.println();

		Arrays.sort(selectNumber);
		Arrays.sort(winnerNumber);
		boolean result = Arrays.equals(selectNumber, winnerNumber);
		if(result) {
			System.out.println("축하합니다. 당첨되셨습니다.");
		} else {
			System.out.println("다음기회에....");
		}

	}

}
