package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * - Cyber 공간을 공격하고 싶다
		 * - 클래스 파일을 따로 만들기 싫다 => Local Inner Class 로 만들면 된다.
		 * - 근데 생각해보면 MyWeapon, SkyWeapon, SeaWeapon, SpaceWeapon 등의 type은
		 *   필요없다. 따라서 클래스의 이름을 짓기 귀찮다 => 익명의 Local Inner Class를 활용!
		 */
		Weapon w1= new Weapon() {
			@Override
			public void attack() {
				prepare();
				System.out.println("Cyber 공격을 해요");
			}
		};
		w1.attack();// Cyber 공격이 되면 된다.
		
		/*
		 *  가상(Virtual) 공간을 공격해야 한다.
		 *  익명의 Local Inner Class 를 이용해서 Weapon type 객체를 생성
		 *  1번만 공격한다 => 위에처럼 w1 이라는 변수를 만들지 않고 1회용을 객체를 만들어서 사용
		 */
		
		new Weapon() {
			
			@Override
			public void attack() {
				prepare();
				System.out.println("Virtual 공간을 공격해요!");
			}
		}.attack();
		
	}
}
