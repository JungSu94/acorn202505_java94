package test.mypac;

public class Triangle extends Shape {
	private int base;
	private int height;
	
	public Triangle(int x, int y, int base, int height) {
		super(x, y);		
		this.base=base;
		this.height=height;
	}
	public void printArea() {
		double area = (base*height)/2.0;
		System.out.println("밑변의 길이:"+base+", 높이 :"+height+" 이고 삼각형의 넓이는:"+area);
	}
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("밑변 :"+base+",높이 :"+height);
			
	}
}
