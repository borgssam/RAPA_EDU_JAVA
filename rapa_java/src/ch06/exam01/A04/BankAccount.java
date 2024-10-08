package ch06.exam01.A04;

public class BankAccount {
	private int account;
	public BankAccount() {
		this.account = 0;
	}
	public void inputMoney(int aMoney) {
		this.account += aMoney;
	}
	public void outputMoney(int aMoney) {
		this.account -= aMoney;
	}
	public void showAccount() {
		System.out.println("예금 잔고가 "+this.account+"입니다.");
	
	}
}
