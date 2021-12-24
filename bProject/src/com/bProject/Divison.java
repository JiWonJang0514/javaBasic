package com.bProject;

public class Divison implements Calculable {
	public final String NAME = "Divison";
	@Override
	public int calc(int num1, int num2) {
		return num1 / num2;
	}
	
}
