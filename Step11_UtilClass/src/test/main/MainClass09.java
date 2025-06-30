package test.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

/*
 *  HashSet 은 Set 인터페이스를 구현한 클래스이다.
 *  
 *  - 순서가 없다
 *  - key 값도 없다
 *  - 중복을 허용하지 않는다
 *  - 어떤 data 를 묶음(집합) 으로 관리하고자 할때 사용한다
 */
public class MainClass09 {
	public static void main(String[] args) {
		//정수를 저장할수 있는 HashSet 객체를 생성해서 참조값을 Set 인터페이스 type 지역변수에 담기
		Set<Integer> set1=new HashSet<>();
		set1.add(10);
		set1.add(10);
		set1.add(20);
		set1.add(20);
		set1.add(30);
		set1.add(30);
		set1.add(40);
		
		//문자열을 저장할수 있는 HashSet 객체
		Set<String> set2=new HashSet<>();
		set2.add("kim");
		set2.add("lee");
		set2.add("park");
		set2.add("kim");
		set2.add("lee");
		//Set 객체에 저장된 모든 아이템을 순서를 보장할수 없지만 모두 참조해서 사용해 보기  
		set1.forEach((item)->{
			//set1 은 Set<Integer> 이기 때문에 item 은 Integer type 이 된다.
			Integer tmp=item;
			System.out.println(tmp);
		});
			System.out.println("------------");
			
			set2.forEach((item)->{
				//set2 는 Set<String> 이기 때문에 item 은 String type 이 된다.
				String tmp=item;
				System.out.println(tmp);
			});
			System.out.println("-------------");
			/*set2.forEach(new Consumer<String>() {

				@Override
				public void accept(String t) {
					
				System.out.println(t);
				}
			});*/
			
			//Iterator 를 사용하는 구조도 연습해 보자
			Iterator<String> it= set2.iterator();
			/*
			 * 무한 루프를 구성하거나 정확한 반복횟수를 알수 없을때 while(){} 문을 많이 사용한다.
			 */
			while(it.hasNext()) {// 다음 item 이 있는지 확인해서
				//다음 item 을 얻어낸다 (item 의 type 은 iterator 의 Generic type 이다)
				String item=it.next();
				//얻어낸 item 을 사용하고 또 다음 item 이 있는지 위에서 확인이 된다
				System.out.println(item);
			}
	
	}
}
