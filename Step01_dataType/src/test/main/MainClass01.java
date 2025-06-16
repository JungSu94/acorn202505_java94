package test.main;
/*
 *  [ Java 기본 데이터 type ]
 *  
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long
 *  
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647
 *  - long 변수명; // -9223372036854775808 ~ 9,223,372,036,854,775,807
 *  
 *  실수형 : float, double
 *  
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */

public class MainClass01 {
	//run 했을때 실행의 흐름이 시작되는 특별한 메소드
	public static void main(String[] args) {
		//정수형 변수선언하고 값 대입하기
		byte iByte=10;
		short iShort=500;
		int iInst=1000;
		long iLong=10000;
		
		//실수형 변수 선언하고 값 대입하기
		float num1=10.1f;
		double num2=10.2d;
		double num3=10.3; // d, f 를 붙이지 않으면 double type 으로 간주된다.
	
		//상수를 만들때는 final 이라는 예약어를 추가로 붙여준다.
		final int num=10;
		//type 이 맞아도 변경불가
		//num=20;
		final double myNum=10.1;
		//myNum=10.2; //변경 불가
		
		
	}
}
