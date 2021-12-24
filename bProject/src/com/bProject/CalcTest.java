package com.bProject;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		/*
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		for(String arg : args) {  //foreach ..??
			System.out.println(arg);  
		}
		*/
		
		System.out.println("���� 2���� �Է��ϼ���.");	
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		
		if(Util.chkNumSize(num1) && Util.chkNumSize(num2)) {
			System.out.println("�����ڸ� �Է��ϼ���(+, -, *, /)");
			
			sc.nextLine();  //���� ������
			String op = sc.nextLine();
			System.out.println("������: " + op);
			
			Calc calc = new Calc(num1, num2, op);
			Calculable cab = calc.calc();
			
			if(cab instanceof Plus) {
				Plus plus = (Plus)cab;
				System.out.println(plus.NAME);
			} else if(cab instanceof Minus) {
				Minus minus = (Minus)cab;
				System.out.println(minus.NAME);
			} else if(cab instanceof Multiply) {
				Multiply multiply = (Multiply)cab;
				System.out.println(multiply.NAME);
			} else if(cab instanceof Divison) {
				Divison divison = (Divison)cab;
				System.out.println(divison.NAME);
			}
			
		}else {
			//4�ڸ� �̳��� ���������� ����
			System.out.println("3�ڸ� �������� ���ڸ� �Է� ����");
		}
	}
	
}
