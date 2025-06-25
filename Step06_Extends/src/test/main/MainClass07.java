package test.main;

import test.mypac.Circle;
import test.mypac.Rect;
import test.mypac.Shape;
import test.mypac.Triangle;

public class MainClass07 {
	public static void main(String[] args) {
		//Shape 객체 생성		
		//Shape s1=new Shape(); // default 생성자가 없어서 이렇게는 객체 생성불가
		Shape s1=new Shape(100, 200);
		s1.printInfo();
	
	Circle c1=new Circle(200, 300, 10);
	c1.printArea();
	c1.printInfo();
	
	Rect r1=new Rect(100, 200, 50);
	r1.printArea();
	r1.printInfo();
	
	
	Triangle t1=new Triangle(200, 200, 300, 150);
	t1.printArea();
	t1.printInfo();
	}
}
