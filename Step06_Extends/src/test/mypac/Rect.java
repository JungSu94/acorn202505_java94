package test.mypac;

public class Rect extends Shape {

	private int side;
	public Rect(int x, int y, int side) {
		super(x, y);		
		this.side=side;
	}
	public void printArea() {
		double area = side*side;
		System.out.println("한변의 길이:+"+side+" 이고 사각형의 넓이는:"+area);
	}
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("한변의 길이 :"+side);
	}		
}