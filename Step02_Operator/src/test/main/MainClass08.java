package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * for 문을 이용해서
		 * 
		 * 1 + 2+ 3 + 4... + 99 + 100
		 * 
		 * 의 총합을 콘솔창에 출력하는 프로그래밍을 해보세요
		 */
	
	int sum=0;
	for(int i=0; i<100; i++)
		sum += i + 1;
		System.out.println("1~100 까지 총합:"+sum);
	}

}
