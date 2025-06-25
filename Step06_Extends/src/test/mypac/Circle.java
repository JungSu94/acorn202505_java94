package test.mypac;

// Shape(도형) 클래스를 상속 받아서 Circle 클래스 정의하기
public class Circle extends Shape {
/*
 * public class Circle extends Shape {}
 * error, 문법이 성립안됨
 * 문법이 맞다고 가정하면 
 * new Circle() 이 가능하다는 것
 * 상속관계 때문에 new Shape() 도 호출된다.
 * Shape 클래스는 디폴트 생성자가 없어서 생성불가
 * Shape 클래스는 생성자의 매개변수에 x, y 좌표를 전달해야함
 */
	
	private int radius;
	
	public Circle(int x, int y, int radius) {
		super(x, y); //super() 는 부모 클래스의 생성자를 의미한다.		
		this.radius=radius;
	}
	public void printArea() {
		//원의 넓이
		double area = Math.PI*radius*radius;
		System.out.println("반지름은:+"+radius+" 이고 원의 넓이는:"+area);
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("반지름은 :"+radius);
			
	}

}
