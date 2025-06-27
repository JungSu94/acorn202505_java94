package test.box;

import test.fruit.Orange;

public class OrangeBox {

	private Orange item;
	
	
	public void pack(Orange item) {
		this.item=item;
	}


	public Orange unpack() {
		return item;
	}
}
