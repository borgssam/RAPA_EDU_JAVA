package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class sample {

	public static void main(String[] args) {

        // ArrayList를 사용하는 경우 (스레드 안전하지 않음)
        List<Integer> arrayList = new ArrayList<>();

        // 스레드 1
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    arrayList.add(i); // ArrayList에 요소 추가
                    System.out.println(arrayList.getLast());
                }
            }
        };

        // 스레드 2
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    arrayList.add(i); // ArrayList에 요소 추가
                    System.err.println(arrayList.getLast());
                }
            }
        };

        // 스레드 시작
        thread1.start();
        thread2.start();
        
        try {
            thread1.join(); // 스레드 1이 끝날 때까지 대기
            thread2.join(); // 스레드 2가 끝날 때까지 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
        // 결과 출력
        System.out.println("ArrayList Size: " + arrayList.size()); // ArrayList의 크기 출력
        System.out.println("---------------------------------------------------"); 
        
        // Vector를 사용하는 경우 (스레드 안전함)
        List<Integer> vector = new Vector<>();

        // 스레드 3
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                vector.add(i); // Vector에 요소 추가
                System.out.println(vector.getLast());
            }
        });

        // 스레드 4
        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                vector.add(i); // Vector에 요소 추가
                System.err.println(vector.getLast());
            }
        });

        // 스레드 시작
        thread3.start();
        thread4.start();

        try {
            thread3.join(); // 스레드 3이 끝날 때까지 대기
            thread4.join(); // 스레드 4가 끝날 때까지 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 결과 출력
        System.out.println("Vector Size: " + vector.size()); // Vector의 크기 출력


	}

}
