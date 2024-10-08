package ch06.exam01.A09;

public class Dog extends Animal {
	public Dog() {
		super("강아지");
	}
	@Override
	public void makeSound() {
		System.out.println("멍멍");
		
	}
}
