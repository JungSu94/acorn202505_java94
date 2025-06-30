package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class MainClass12 {
	public static void main(String[] args) {
		//1. 로또 번호를 담을 HashSet 객체를 생성해서 Set type set1 이라는 지역변수에 담아 보세요
		Set<Integer> set1 = new HashSet<>();
		//2. Random 객체를 생성해서 참조값을 ran 이라는 지역변수에 담아 보세요
		Random ran= new Random();
		
		/*
		 *3. while 문을 이용해서 랜덤한 로또 번호를 set1 에 반복적으로 담아 보세요
		 *  
		 *   while 문은 무한 루프로 만들고 while 문 탈출 조건은 set1.size() 가 6이 되면 탈출되도록 해보세요
		 *   
		 *   ran.nextInt(45) + 1 은 1~45 사이의 랜덤한 정수를 얻어낼수 있습니다
		 *   로또 번호는 총 6개 입니다
		 */
		
		while(set1.size() <6) {
			set1.add(ran.nextInt(45)+1);
		
		/*while(true) {
		 * 	int ranNum=ran.nextInt(45)+1;
		 * 	set1.add(ranNum);
		 * 	if(set1.size() == 6){
		 * 		break;	
		 * 	}
		 * 
		 * }
		 */
		
		}
		//4. set1 에 담긴 번호를 모두 하나씩 콘솔창에 출력해 보세요.
		System.out.println(set1);
		/*set1.forEach((item)->{
		 *	System.out.print(item+" ");
		 * });
		 */
		 
		//5. AI에 물어봐서 set1 에담신 내용을 List에 담은 다음 오름차순 정렬해 보세요
		List<Integer> list = new ArrayList<>(set1);
		Collections.sort(list);
		//6. 오름차순 정렬된 번호를 하나씩 순서대로 콘솔창에 출력해 보세요.
		System.out.println("---------------------");
		for(int number : list) {
			System.out.println(number);
		}
		//list.forEach(item -> System.out.println(item+" "));
	
	}
}
