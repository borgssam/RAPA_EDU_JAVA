package ch12.sec03.exam02;

public record Member(String id, String name, int age) {

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+","+name;
	}

}
