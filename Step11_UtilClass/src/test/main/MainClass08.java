package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 *  HashMap<key type, value type>
		 *  
		 *  key type 은 일반적으로 String type 을 가장 많이 사용한다.
		 *  value type 은 담고 싶은 데이터의 type 을 고려해서 지정하면 된다.
		 *  value type 을 Object 로 지정하면 어떤 data type 이던지 다 담을수가 있다.
		 *  순서가 없는 데이터를 다룰때 사용하면 된다.
		 *  dto 클래스 대신에 사용하기도 한다.
		 */
		// HashMap 클래스는 Map 인터페이스를 구현했다 HashMap 말고 Map만 써도됨
		HashMap<String, Object> map= new HashMap<>();
		//데이터를 담을때는 .put(key, value) 메소드를 이용해서 담고
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("isMan", true);
			/*System.out.println(map.get("num"));
			System.out.println(map.get("name"));
			System.out.println(map.get("isMan"));*/
	
			//데이터를 참조할때는 .get(key) 메소드를 이용한다.
			//value 의 Generic 이 Object 이기때문에 원래 type 으로 casting 이 필요하다
			int num = (int)map.get("num");
			String name = (String)map.get("name");
			boolean isMan = (boolean)map.get("isMan");
			
			//동일한 key 값으로 다시 담으면 수정
			map.put("name", "안정수");
			//특정 key 값으로 담긴 내용 삭제
			map.remove("isMan");
			//모두삭제
			map.clear();
			
			// Map 인터페이스 of() 라는 static 메소드로 read only Map 객체도 만들어 낼수 있다.
			Map<String, Object> map2 = Map.of(
					"num",2,
					"name","해골",
					"isMan",false
			);
	
	
	}
}
