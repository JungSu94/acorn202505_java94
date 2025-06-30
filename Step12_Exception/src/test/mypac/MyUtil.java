package test.mypac;

import java.util.Random;

public class MyUtil {
	
	public static void generate() {
		Random ran=new Random();
		// 0~9 사이의 랜덤한 정수를 발생시켜서
		int ranNum=ran.nextInt(10);
		
		//만일 우연히 7 이라는 숫자가 나오면
		if(ranNum == 7) {
			// throw 예약어와 함께 예외 객체를 생성하면 Exception 발생한다
			throw new WowException("wow ! 행운의 7번");
		}
		
		System.out.println(ranNum+" 숫자가 나왔습니다");
	
	}
	//5초가 걸리는 가상의 그림을 그리는 메소드
	public static void draw() {
		System.out.println("5초 동안 그림을 그려요...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("그림 완성!");
	}
	// 5초가 걸리는 가상의 전송을 하는 메소드
	public static void send() throws InterruptedException {
		System.out.println("5초 동안 전송을 해요...");
		
		Thread.sleep(5000);
		
		System.out.println("전송 완료!");
	}
}
