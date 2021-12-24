package com.bProject;

public class Multiply implements Calculable {
	public final String NAME = "Multiply";
	@Override
	public int calc(int num1, int num2) {
		return num1 * num2;
	}
}
