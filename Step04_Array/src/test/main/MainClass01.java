package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 *  in javascript
		 *  
		 *  let num=[10, 20, 30, 40, 50];
		 *  
		 *  nums[0]
		 *  nums[1]
		 *  .
		 *  .
		 *  
		 *  in java
		 *    정수가 들어 있는 배열의 data type 은 int[] 이다
		 *  int[] nums={10, 20, 30, 40, 50};
		 *  
		 *  nums[0]            java 에서 배열은 중괄호 열고 닫고해서 반든다
		 *  				   java는 배열이 한번 만들어지면 size 를 늘리거나 줄일수 없다.
		 *  nums[2]
		 */
		
		int[] nums= {10, 20, 30, 40, 50};
		
		/*
		 *  "김구라", "해골", "원숭이", "주뎅이", "덩어리" 5개의 문자열이 저장된 배열을 만들고
		 *  그 참조값은 names 라는 변수에 대입해 보세요		
		 */
		String[] names= {"김구라", "해골", "원숭이", "주뎅이", "덩어리"};
		
		//nums 배열에 저장된 숫자를 반복문 돌면서 콘솔창에 하나씩 순서대로 출력하기 (for 문)
		
		for(int i=0; i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		//names 배열에 저장된 문자열을 반복문 돌면서 콘솔창에 하나씩 순서대로 출력하기 (for 문)
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]);
		}

	}
}
