package ch06.exam01.A11;

public class MainExample {

	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		animals[0] = new Cat();
		animals[1] = new Dog();
		animals[2] = new Cat();
		for(Animal ani : animals) {
			ani.makeSound();
		}
		

	}

}
