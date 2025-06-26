package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;
import test.mypac.Zoo.Tiger;

public class MainClass03 {
	public static void main(String[] args) {
		Zoo z1=new Zoo();
		// Zoo 객체의 getMonkey() 메소드를 호출해서 얻어낸 Monkey 객체의 say() 메소드 호출하기
		Monkey m1= z1.getMonkey();
		m1.say();
		
		//z1 에 들어 있는 참조값을 이용해서 Tiger 객체의 참조값을 얻어낸다음 roar() 메소드를 호출해 보세요
	
		Tiger t1= z1.gerTiger();
		t1.roar();
	}
}
