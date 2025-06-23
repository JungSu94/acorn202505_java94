package test.main;

import java.util.Random;

public class MainClass08 {
	public static void main(String[] args) {
		//String type 이 저장되어 있는 배열 
		String[] data = {"🍒", "🍎", "🍌", "🍈", "7"};
		String[] data2 = {"김무옥", "시라소니", "김또깡", "휘발류", "개코"};
		// 위에 배열에 저장된 5개의 문자열중에서 랜덤하게 1개만 출력되도록 해 보세요
		Random ran=new Random();
		int ranNum =ran.nextInt(5);
		System.out.println(data[ranNum]);
		
		Random ran2=new Random();
		int ranNum2 =ran2.nextInt(5);
		System.out.println(data2[ranNum2]);
	}
}
