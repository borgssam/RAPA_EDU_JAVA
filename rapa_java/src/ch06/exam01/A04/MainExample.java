package ch06.exam01.A04;

public class MainExample {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		acc.inputMoney(10000);
		acc.outputMoney(3000);
		acc.inputMoney(5000);
		acc.showAccount();
	}

}
