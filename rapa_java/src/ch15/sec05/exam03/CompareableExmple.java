package ch15.sec05.exam03;

import java.util.TreeSet;

public class CompareableExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> treeSet = new TreeSet<>();
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("고길동", 65));
		treeSet.add(new Person("홍돌이", 18));
		
		for(Person person: treeSet) {
			System.out.println(person.name + ","+person.age);
		}
		
		
	}

}