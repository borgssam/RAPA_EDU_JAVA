package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ThreadExample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> arrayList = new ArrayList<>();
		List<Integer> arrayList = new Vector<>();
		Thread thread1 = new Thread() {
			@Override
			public void run() {
				for(int i= 0; i<1000; i++) {
					arrayList.add(i);
					System.out.println("("+i+")"+arrayList.getLast());
				}
			}
		};

		Thread thread2 = new Thread() {
			@Override
			public void run() {
				for(int i= 0; i<1000; i++) {
					arrayList.add(i);
					System.err.println("("+i+")"+arrayList.getLast());
				}
			}
		};
		
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("총 데이터수:"+ arrayList.size());
	}

}
