package test.main;

import test.mypac.Person;
import test.mypac.Programmer;
import test.mypac.Singer;

public class MainClass08 {
	public static void main(String[] args) {
		// person 객체를 생성해서 person type 으로 받으면 모든 메소드를 다 사용할수 있다
		Person p1 = new Person();
		p1.work();
		p1.sing();
		p1.develop();
	
		System.out.println("---------------");
		// person 객체를 생성해서 singer type 으로 받으면 sing() 메소드만 사용가능
		Singer p2= new Person();
		p2.sing();
		
		// person 객체를 생성해서 Programmer type 으로 받으면 develop() 메소드만 사용가능
		Programmer p3= new Person();
		p3.develop();
	}
}
