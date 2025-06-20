package test.util;

import test.auto.Car;

public class MyUtil {
	//non static 필드
	public String owner;
	
	//Car type 을 담을수 있는 static 필드
	public static Car car;
	
	//data type 앞에 static 예약어를 붙여서 static 필드를 만들수 있다.
	//필드는 선언시에 초기값을 넣어줄수도 있다.
	public static String version="1.0";
	
	//method 의 return type 앞에 static 예약어를 붙여서 static 메소드를 만들수 있다.
	public static void send(){
		System.out.println("전송합니다.");
	
	}
}
