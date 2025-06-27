package test.box;

public class FruitBox<T> {
	// T 를 필드의 type 으로 활용
	private T item;

	// T 를 매개변수의 type 으로 활용
	public void pack(T item) {
		this.item=item;
	}

	// T 를 메소드의 리턴 type 으로 활용
	public T unPack() {
		return item;
	}

}
