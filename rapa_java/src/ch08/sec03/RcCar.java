package ch08.sec03;

public class RcCar implements RemoteControlRc , RemoteControl{
	public int speed = 0;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("시동을 겁니다.");

	}

	@Override
	public void SpeedUp() {
		// TODO Auto-generated method stub
		this.speed += 10;
	}

	@Override
	public void SpeedDown() {
		// TODO Auto-generated method stub
		this.speed -= 10;
	}

}
