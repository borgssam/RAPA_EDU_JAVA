package ch08.sec03;

public class MainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc = new Televison();
		rc.turnOn();
		
		RemoteControl rc2 = new Audio();
		rc2.turnOn();
		
		RcCar myCar = new RcCar();
		RemoteControl rCar = myCar;
		rCar.turnOn();
		RemoteControlRc rcCar = myCar;
		rcCar.SpeedUp();
		rcCar.SpeedUp();
		rcCar.SpeedUp();
		
		System.out.println("RC카 속도:"+ myCar.speed);
		
	}

}
