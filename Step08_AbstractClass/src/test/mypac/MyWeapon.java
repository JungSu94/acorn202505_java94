package test.mypac;
// 추상클래스를 상속받으면 자식 클래스는 부모의 추상 메소드를 반드시 Override 해야 한다.
public class MyWeapon extends Weapon {
	
	@Override
	public void attack() {
		System.out.println("지상 공격을 해요!");
		
	}
}
