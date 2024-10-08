package ch06.exam01.A12;

public class FullTimeEmployee extends Employee {

	public FullTimeEmployee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return this.BASE_SALARY + (this.BASE_SALARY* this.BONUS_RATE);
	}

}
