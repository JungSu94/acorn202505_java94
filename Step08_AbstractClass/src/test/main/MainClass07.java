package test.main;

import test.mypac.Weapon;

public class MainClass07 {
	public static void main(String[] args) {
	
		/*
		 *  여기서 아래에 정의된 useWeapon() 메소드를 호출하려면?
		 */
		
		Weapon w1 = new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("공격!");			
			}
		};
		useWeapon(w1);
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("하단 공격!");
				
			}
		});
	}
	
	public static void useWeapon(Weapon w) {
		w.attack();
		
	}


}
