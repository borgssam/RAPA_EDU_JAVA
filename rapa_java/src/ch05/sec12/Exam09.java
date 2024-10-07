package ch05.sec12;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numStudent = 0;
		int [] scores = {};
		while(true) {
			//메뉴출력
			System.out.println("------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------------");
			//메뉴1차입력
			System.out.print("선택 > ");
			
			int select = scan.nextInt();		
			
			
			//메뉴1차값에 따라서 나눠서 실행문 실행
			switch(select) {
			case 1:
				System.out.print("학생수 > ");
				numStudent = scan.nextInt();
				System.out.println("입력받은 학생수: "+ numStudent + "명");
				scores = new int[numStudent];
				break;
			case 2:
				//점수입력받기
				for(int i= 0; i< numStudent; i++) {
					System.out.print("scores["+i+"] > ");
					
					int score = scan.nextInt();
					scores[i] = score;
				}
				break;
			case 3:
				//점수목록
				for(int i= 0; i< numStudent; i++) {
					System.out.println("scores["+i+"] > "+scores[i]);
				}
				break;
			case 4:
				//최고점수 구하기
				int max = -1;
				int sum = 0;
				for(int score: scores) {
				  if(score>max) {max=score;}
				  sum += score;
				}
				//평균구하기
				double avg = (double)sum/numStudent;
				System.out.println("최고점:"+max+", 평균:"+avg);
				break;
			case 5:
				System.out.println("프로그램 종료");				
				System.exit(0);
				break;
			default:
				System.out.println("입력값이 잘못됬습니다. 다시입력하세요");
				break;
			}
			
			
		}
		

	}

}
