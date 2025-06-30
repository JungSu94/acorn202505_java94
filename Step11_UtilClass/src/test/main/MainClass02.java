package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		//정수를 저장할수 있는 ArrayList<Integer> 객체를 생성해서 참조값을 지역변수 nums에담기
		ArrayList<Integer> nums = new ArrayList<>();
		//ArrayList 객체에 10, 20, 30 숫자 3개를 담아 보세요
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		//ArrayList 객체에 저장된 숫자를 for 문을 이용해서 순서대로 콘솔창에 출력해 보세요.
		for(int i=0; i<nums.size(); i++) {
			//i번째 item
			int tmp=nums.get(i);
			//콘솔창에 출력
			System.out.println(tmp);
			//System.out.println(nums.get(i));
		}
		System.out.println("확장 for 문을 이용하면----------------->");
		for(int tmp:nums) {
			System.out.println(tmp);
		}
	
				
		//위에서 생성한 Scanner 객체로 반복문 돌면서 문자열 5번 입력받아서
		//입력 받을때 마다 Array<String> 객체에 add()하고
		//다 입력 받으면 다시 한번 반목문 돌면서 Array<String> 객체에 저장된 문자열 5개를
		//순서대로 콘솔창에 출력하는 프로그래밍을 해보세요
		ArrayList<String> names = new ArrayList<>();
		for(int i=0; i<5; i++) {
			Scanner scan=new Scanner(System.in);
			System.out.println(i+"번째 문자열 입력:");
			String result = scan.nextLine();
			names.add(result);
		}
		for(String tmp2:names) {
			System.out.println(tmp2);
		}
	
	}

}
