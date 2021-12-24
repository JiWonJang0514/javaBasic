package com.bProject;

public class Plus implements Calculable {
	public final String NAME = "Plus";  //»ó¼ö
	@Override
	public int calc(int num1, int num2) {
		return num1 + num2;
	}
	
}
