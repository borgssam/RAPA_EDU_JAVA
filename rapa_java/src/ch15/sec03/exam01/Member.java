package ch15.sec03.exam01;

public class Member {
	public String name;
	public int age;
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode()+age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			
			if(target.name.equals(this.name)&& target.age == this.age) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름:"+this.name+",나이:"+age;
	}
	
	
}
