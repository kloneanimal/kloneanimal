package com.introductiontooops;

public class MotorBike {
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		System.out.println(speed);
		System.out.println(this.speed);
		this.speed = speed;
	}

	void start() {
		System.out.println("bike started");
	}
}
