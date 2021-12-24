package com.bProject;

public class Minus implements Calculable {
	public final String NAME = "Minus";
	@Override
	public int calc(int num1, int num2) {
		return num1 - num2;
	}
	
}
