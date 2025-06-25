package test.main;

import test.mypac.Car;
import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		Object p1=new HandPhone();
		Object c1=new Car();
	
		// p1 의 사용 설명서를 Phone type 으로 교체하면서 참조값을 p2 에 담아 보세요.
		Phone p2 = (Phone)p1;
		p2.call();
		
		// 오류는 안뜨지만 Run 하면 Console 에 ClassCastException 메시지가뜸
		Phone p3 = (Phone)c1;
		p3.call();
	}
}
