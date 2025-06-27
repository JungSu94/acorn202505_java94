package test.box;

import test.fruit.Banana;

public class BananaBox {
	private Banana item;
	

	public void pack(Banana item) {
		this.item=item;
	}


	public Banana unpack() {
		return item;
	}
}
