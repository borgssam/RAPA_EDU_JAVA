package ch06.exam01.A12;

public class PartTimeEmployee extends Employee {
	private double hourSalery;
	private int hourWork;
	
	public PartTimeEmployee(String name, double hourSalery, int hourWork) {
		super(name);
		this.hourSalery = hourSalery;
		this.hourWork = hourWork;
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return this.BASE_SALARY + (this.hourSalery*this.hourWork);
	}
	
	
	
}
