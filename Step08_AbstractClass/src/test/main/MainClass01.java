package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass01 {
	public static void main(String[] args) {
		//추상 클래스도 data type 의 역활을 할수가 있다.
		Weapon w1 = null;
		
		
		//그렇다면 Weapon type 의 참조값은 어떻게 얻어내나?
		//Weapon w2 = new Weapon(); //추상클래스 단독으로 객체 생성은 불가하다
		
		Weapon w2 = new MyWeapon();
		w2.prepare();
		w2.attack();
		
	}
}
