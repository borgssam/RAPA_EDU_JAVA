package ch06.exam01.A09;

public class Cat extends Animal {

//	private static final String TYPE = "고양아";
	public Cat() {
		super("고양이");
	}
	@Override
	public void makeSound() {
		System.out.println("야옹");
		
	}
}
