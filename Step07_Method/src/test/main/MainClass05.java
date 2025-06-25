package test.main;

import test.mypac.Messenger;
import test.mypac.Post;

public class MainClass05 {
	public static void main(String[] args) {
		// Messenger type 객체의 sendPost() 메소드를 호출해 보세요.
		// 실행했을때 Exception 이 발생하지 않아야 합니다.
		
		// Messenger type 객체의 sendPost() 메소드를 호출 하기 위해서는
		// Messenger 객체를 생성해야 한다.
		Messenger m= new Messenger();
		m.sendPost(new Post(1, "가", "나"));
	
	}
}
