package ch06.exam01.A12;

public class Employee {
	protected final double BASE_SALARY = 3000.0;
	protected final double BONUS_RATE = 0.2;
	
	private String name;
	public Employee(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public double calculateSalary() {
		return 0.0;
	}

}
