package test.mypac;

public abstract class Weapon {
	//무기 작동을 준비하는 메소드
	public void prepare() {
		System.out.println("무기 작동을 준비 합니다.");
	}
	//공격하는 메소드
	public abstract void attack();
	
}
