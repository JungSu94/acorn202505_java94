package test.main;

import test.mypac.MyFunction;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 *  MyFunction 인터페이스는
		 *  execute() 추상메소드 1개, log() default 메소드 1개, help() static 메소드 1개를 가지고 있다.
		 */
		MyFunction f1 = ()->{
			System.out.println("실행합니다");
		};
		// 구현 메소드 호출
		f1.execute();
		// default 메소드 호출
		f1.log();
		// static 메소드 호출
		MyFunction.help();
	
	}
}
