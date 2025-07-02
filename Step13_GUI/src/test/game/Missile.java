package test.game;

public class Missile {
	private int x;
	private int y;
	//제거할 미사일인지 여부
	private boolean isRemove;
	
	//디폴트 생성자
	public Missile() {}
	//필드에 저장할 값을 생성자로 전달 받을수 있는 생성자
	public Missile(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	//필드 접근 메소드 setter, getter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isRemove() {
		return isRemove;
	}
	public void setRemove(boolean isRemove) {
		this.isRemove = isRemove;
	}

	
}
