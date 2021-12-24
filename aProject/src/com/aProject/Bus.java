package com.aProject;

public class Bus extends Car {

	public Bus(String color, int seat, String model, double maxSpeed) {
		super(color, seat, model, maxSpeed);
	}

	@Override
	boolean checkMaxSpeed(double maxSpeed) {
		if(maxSpeed > 120)
			return true; 
		else
			return false;
	}
	
}
