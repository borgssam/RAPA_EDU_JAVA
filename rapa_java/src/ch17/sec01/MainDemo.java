package ch17.sec01;
import java.util.Scanner;

public class MainDemo {
    private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("\n===== 도서 관리 시스템 =====");
            System.out.println("1. 회원 관리");
            System.out.println("2. 도서 관리");
            System.out.println("3. 대여 관리");
            System.out.println("0. 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manageMembers();
                    break;
                case 2:
                    manageBooks();
                    break;
                case 3:
                    manageRentals();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    exit = true;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
            }
        }

        scanner.close();

	}

    // 회원 관리 메서드
    private static void manageMembers() {
        System.out.println("\n--- 회원 관리 ---");
        System.out.println("1. 회원 추가");
        System.out.println("2. 회원 조회");
        System.out.println("3. 회원 수정");
        System.out.println("4. 회원 삭제");
        System.out.print("원하는 작업을 선택하세요: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("회원 추가 기능을 실행합니다.");
                // 추가 로직 작성
                break;
            case 2:
                System.out.println("회원 조회 기능을 실행합니다.");
                // 조회 로직 작성
                break;
            case 3:
                System.out.println("회원 수정 기능을 실행합니다.");
                // 수정 로직 작성
                break;
            case 4:
                System.out.println("회원 삭제 기능을 실행합니다.");
                // 삭제 로직 작성
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }// 도서 관리 메서드
    private static void manageBooks() {
        System.out.println("\n--- 도서 관리 ---");
        System.out.println("1. 도서 추가");
        System.out.println("2. 도서 조회");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.print("원하는 작업을 선택하세요: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("도서 추가 기능을 실행합니다.");
                // 추가 로직 작성
                break;
            case 2:
                System.out.println("도서 조회 기능을 실행합니다.");
                // 조회 로직 작성
                break;
            case 3:
                System.out.println("도서 수정 기능을 실행합니다.");
                // 수정 로직 작성
                break;
            case 4:
                System.out.println("도서 삭제 기능을 실행합니다.");
                // 삭제 로직 작성
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }

    // 대여 관리 메서드
    private static void manageRentals() {
        System.out.println("\n--- 대여 관리 ---");
        System.out.println("1. 도서 대여");
        System.out.println("2. 대여 현황 조회");
        System.out.println("3. 도서 반납");
        System.out.print("원하는 작업을 선택하세요: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("도서 대여 기능을 실행합니다.");
                // 대여 로직 작성
                break;
            case 2:
                System.out.println("대여 현황 조회 기능을 실행합니다.");
                // 조회 로직 작성
                break;
            case 3:
                System.out.println("도서 반납 기능을 실행합니다.");
                // 반납 로직 작성
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }

}
