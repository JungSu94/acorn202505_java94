package test.main;

import test.company.Department;
import test.company.Employee;

public class MainClass10 {
	public static void main(String[] args) {
		
		Department d1=new Department("영업부", "대전");
		/*
		 *  위의 부서에서 근무하는 사원(Employee) 객체 3개를 만들어서 그 참조값 3개를
		 *  배열에 순서대로 담아 보세요.		 * 
		 */
		Employee emp1= new Employee("김구라",1000, d1);
		Employee emp2= new Employee("해골물",2000, d1);
		Employee emp3= new Employee("원숭이",3000, d1);
		
		//Employee[] e1= {emp1, emp2, emp3};
		Employee[] e1= new Employee[3];
		e1[0]=emp1;
		e1[1]=emp2;
		e1[2]=emp3;
		// for 문 이용해서 Employee[] 에 담긴 Employee 객체의 .printInfo() 메소드를 순서대로 호출하기
		for(int i=0; i<e1.length; i++) {
			// i 번째 방에 있는 Employee 객체의 참조값 얻어내기
			Employee tmp=e1[i];
			// 메소드 호출            e1[i].printInfo(); 한줄로 하는법
			tmp.printInfo();
		}
		System.out.println("--------------------------");
		for(Employee tmp : e1) {
			tmp.printInfo();
		}
	
	}
}
