package test.mypac;

@FunctionalInterface
public interface Operator {
	//매개변수에 전달되는 두 수를 연산해서 어떤 결과 값을 리턴해주는 추상 메소드 (구현은 자유)
	public double execute(double num1, double num2);
}
