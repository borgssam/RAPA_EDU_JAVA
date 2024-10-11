package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> set = new HashSet<>();

		set.add(new Member("홍길동", 30));
		set.add(new Member("강감찬", 60));
		set.add(new Member("홍길동", 30));
		
		System.out.println(set.size());
		Iterator<Member> iter = set.iterator();
		while(iter.hasNext()) {
			Member element = iter.next();
			System.out.println(element);
		}
	}

}
