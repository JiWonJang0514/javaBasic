package com.bProject;

public class Calc {
	private int num1;
	private int num2;
	private String op;   //연산자 변수
	private int result;
	
	
	
	public Calculable calc() {
		Calculable calc = null;
		
		switch (op) {
		case "+":
//			Plus plus = new Plus();
//			result = plus.calc(num1, num2);
			calc = new Plus();
			System.out.print("더하기");
			break;
		case "-":
			calc = new Minus();
			System.out.print("빼기");
			break;
		case "*":
			calc = new Multiply();
			System.out.print("곱하기");
			break;
		case "/":
			calc = new Divison();
			System.out.print("나누기");
			break;
		}
		
		result = calc.calc(num1, num2);
		System.out.println(" 결과: " + result);
		
		return calc;
	}
	
	
	
	//생성자
	public Calc(int num1, int num2, String op) {
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}
	
	
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	
}
