package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
				
		//콘솔창으로 부터 입력 받을수 있는 Scanner 객체 생성
		Scanner scan=new Scanner(System.in);
		
		//문자열을 순서대로 저장할수 있는 ArrayList 객체 생성
		ArrayList<String> names = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			System.out.println("문자열 입력:");
			//Scanner 객체를 이용해서 여기서 문자열 입력받기
			String line=scan.nextLine();
			//입력받은 문자열을 ArrayList에 저장
			names.add(line);
		}
		
		for(String tmp:names) {
			System.out.println(tmp);
		}
	}
}
