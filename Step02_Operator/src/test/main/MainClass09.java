package test.main;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 * 1~100 사이의 숫자 중에서 짝수의 총합을 구해서 출력하는 프로그래밍을 해보세요
		 */
	int sum=0;
	for(int i=1; i<=100; i++) {
	if (i%2 == 0) {
		sum += i;}	
	}
	System.out.println("1~100 사이의 숫자 중에서 짝수의 총합:"+sum);
	sum=0;

	for(int i=2; i <=100; i += 2) {
		sum += i;
	}
	System.out.println("1~100 사이의 숫자 중에서 짝수의 총합:"+sum);
	}
}
	