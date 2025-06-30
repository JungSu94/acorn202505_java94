package test.main;

import java.util.List;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 *  List<String> names=new ArrayList<>();
		 *  names.add("kim");
		 *  names.add("lee");
		 *  names.add("park");
		 *  위의 작업을 아래의 코드로 대체 할수 있다.
		 */
		
		// 대신 이 List는 읽기 전용이다 (수정, 삭제, 변경 불가)
		List<String> names = List.of("kim", "lee", "park");
		
		//아래의 코드는 모두 에러 발생
		names.add("choi");
		names.remove(0);
		names.set(0, "김구");
	}
}
