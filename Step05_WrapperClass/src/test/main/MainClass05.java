package test.main;


import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * 1. 콘솔창으로 부터 입력 받을수 있는 Scanner 객체를 생성해서 그 참조값을 scan 이라는 지역변수에 담아 보세요.
		 * 2. scan 에 담겨있는 Scanner 객체를 2번 사용해서 콘솔창으로 부터 숫자를 2개 입력 받으세요.
		 * 3. 입력받은 숫자(문자열)를 실제 숫자로 변경하세요
		 * 4. 두수의 합을 구해서 콘솔창에 이쁘게 출력해 보세요.
		 *-------- 
		 *출력 예시
		 *
		 *첫번째 숫자입력 :
		 *10
		 *두번째 숫자입력 :
		 *20
		 *10과 20의 합은 : 30
		 */
	
		Scanner scan=new Scanner(System.in);
								//InputStream type
		System.out.print("첫번째 숫자 입력: ");
		String str=scan.nextLine();
		
		System.out.print("두번째 숫자 입력: ");
		String str2=scan.nextLine();
		
		int num=Integer.parseInt(str);
		int num2=Integer.parseInt(str2);
		
		int sum=num+num2;
		System.out.println(num + "과 " + num2 + "의 합은 : " + sum);
		
		/*double num1=Double.parseDouble(str);
		 *double num2=Double.parseDouble(str2);
		 *double result=num1+num2;
		 *(실수는 %f 로 치환한다, 정수는 %d, 문자열은 %s)
		 *String.format("%f 과 %f 의 합은 : %f", num1, num2, result);
		 *System.out.println(info);
		 */
	
	
	}
}
