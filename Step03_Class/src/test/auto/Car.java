package test.auto;
/*
 * class 의 역활
 * 
 * 1. 객체의 설계도 역활
 * 	- 객체는 heap 영역(사물함)에 들어 있는 물건이라고 생각하면된다.
 *  - class 를 이용해서 객체를 원하는 시점에 원하는 갯수 만큼 만들어 낼수 있다
 *  - 만들어진 객체가 어떤 저장소와 어떤 기능을 가지게 할지 class 로 설계할수 있다.
 *  
 *  2. data type 역활
 *  
 *  3. static 필드와 메소드를 포함하는 역활
 */
public class Car  {
	//차의 이름을 저장할 필드 만들기(필드는 지역변수가 아님, 객체 고유의 저장소이다, 필드는 선언만해도 기본값이 들어가면서 만들어짐)
	public String name; //참조데이터 type 의 기본값은 null
	//차긔 가격을 저장할 필드 만들기
	public int price; // 기본데이터(int) type 의 기본값은 0
	
	//달리는 기능(method) 만들기
	public void drive() {
		System.out.println(this.name+"이(가)달려요!");
	}
	
}
