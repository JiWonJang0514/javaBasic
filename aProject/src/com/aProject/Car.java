package com.aProject;

public abstract class Car {
	String color;		//String -> null
	int seat;			//int -> 0
	String model;  		//String -> null
	double speed;		//double -> 0.0
	double maxSpeed;	//double -> 0.0
	boolean power;		//false
	
	abstract boolean checkMaxSpeed(double maxSpeed);  //�߻�޼ҵ�: �̿ϼ��޼ҵ�
	
	public Car(String model) {
		this("���", 5, model, 150);
	}
	public Car(String color, int seat, String model, double maxSpeed) {
		//super();  //�ݵ�� �� ó���� ��ġ
		//�������� ���ÿ� ������ color, seat, model, maxSpeed ����
		//���� ����� ��ü�� ��������� �����Ѵ�.
		if(checkMaxSpeed(maxSpeed)) {
			System.out.println("�ְ�ӵ��� �Ѿ����ϴ�.");
			return;
		}
		this.color = color;
		this.seat = seat;
		this.model = model;
		this.maxSpeed = maxSpeed;
		System.out.println("���ο� �ڵ��� '"+ model + "'�� ����������ϴ�.");
	}
	
	void power() {   //�õ�
		power = !power;  //�õ� ���
	}
	void move(double speed) {   //������
		if(!power) {
			System.out.println("�õ��� �����ֽ��ϴ�.");
			return;
		}
		if(speed > maxSpeed) {
			System.out.println("�ְ�ӵ����� �� ������ ������ �� �����ϴ�.");
			return;
		}
		this.speed = speed;
		System.out.println(model + "  " + speed+"km/h�� �̵��մϴ�.");
	}
	void stop() {   //����
		speed = 0;
		System.out.println("�����߽��ϴ�.");
	}
	
	
	//public static void main(String[] args) {
		
	//}
}
