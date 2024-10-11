package ch15.sec05.exam03;

public class Person implements Comparable<Person> {
	public String name;
	public int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name)*-1;
	}
//	public int compareTo(Person o) {
//		if(age>o.age) {
//			return 1;
//		} else if(this.age<o.age) {
//			return -1;
//		} else{
//			return 0;
//		}
//	}
	
}
