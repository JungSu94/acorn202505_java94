package test.main;

import test.mypac.MemberInfo;

public class MainClass07 {
	public static void main(String[] args) {
		//1. MemberInfo 객체를 생성해서 참조값을 mem1 이라는 변수에 담아보세요
		MemberInfo mem1 = new MemberInfo();
		//2. 회원의 번호 1을 위에서 생성한 객체에 담아 보세요.
		mem1.num=1;
		//3. 회원의 이름 "김구라" 를 위에서 생성한 객체에 담아 보세요.
		mem1.name="김구라";
		//4. 회원의 주소 "노량진" 을 위에서 생성한 객체에 담아 보세요.
		mem1.addr="노량진";
		// 5. 위의 작업을 모두 했으면 debug 모드로 실행해서 정상 동작 하는지 확인해 보세요.
		System.out.println(mem1.num);
		System.out.println(mem1.name);
		System.out.println(mem1.addr);
	}
}
