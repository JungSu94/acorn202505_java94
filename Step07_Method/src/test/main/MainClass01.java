package test.main;

public class MainClass01 {
	
	// static 영역에 만들어지는 main() 메소드
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작됨");
		
		// 클래스명에 . 찍어서 static 메소드 호출하기
		MainClass01.test();
		// 동일한 클래스 안에 있는 static 메소드를 호출할때는 클래스명. 은 생략 가능하다
		test();
		System.out.println("main 메소드가 종료됩니다");
	}
	public static void test() {
		System.out.println("test() 메소드 호출됨");
	}

}
