package test.main;

import test.auto.Car;

public class MainClass02 {
	public static void main(String[] args) {
		// Car type 객체의 참조값(id) 을 담을수 있는 c1 이라는 이름의 비어 있는 변수 만들기
		Car c1 = null;
		// Car 클래스로 객체를 생성하고 할당된 참조값을 c1 에 대입하기
		c1 = new Car();
		// c1 에 들어 있는 참조값을 이용해서 drive() 메소드 호출하기
		c1.drive();
		
		// Car 클래스로 객체를 하나더 생성하고 할당된 참조값을 c2에 대입하기
		Car c2 = new Car();
		// c2 에 들어 있는 참조값을 이용해서 drive() 메소드 호출하기
		c2.drive();
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
