package com.aProject;

public abstract class Car {
	String color;		//String -> null
	int seat;			//int -> 0
	String model;  		//String -> null
	double speed;		//double -> 0.0
	double maxSpeed;	//double -> 0.0
	boolean power;		//false
	
	abstract boolean checkMaxSpeed(double maxSpeed);  //추상메소드: 미완성메소드
	
	public Car(String model) {
		this("흰색", 5, model, 150);
	}
	public Car(String color, int seat, String model, double maxSpeed) {
		//super();  //반드시 맨 처음에 위치
		//생성자의 스택에 저장한 color, seat, model, maxSpeed 값을
		//힙에 저장된 객체의 멤버변수에 저장한다.
		if(checkMaxSpeed(maxSpeed)) {
			System.out.println("최고속도를 넘었습니다.");
			return;
		}
		this.color = color;
		this.seat = seat;
		this.model = model;
		this.maxSpeed = maxSpeed;
		System.out.println("새로운 자동차 '"+ model + "'가 만들어졌습니다.");
	}
	
	void power() {   //시동
		power = !power;  //시동 토글
	}
	void move(double speed) {   //움직임
		if(!power) {
			System.out.println("시동이 꺼져있습니다.");
			return;
		}
		if(speed > maxSpeed) {
			System.out.println("최고속도보다 더 빠르게 움직일 수 없습니다.");
			return;
		}
		this.speed = speed;
		System.out.println(model + "  " + speed+"km/h로 이동합니다.");
	}
	void stop() {   //정지
		speed = 0;
		System.out.println("정지했습니다.");
	}
	
	
	//public static void main(String[] args) {
		
	//}
}
