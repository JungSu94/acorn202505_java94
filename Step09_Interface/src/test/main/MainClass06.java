package test.main;

import test.mypac.Warmer;

public class MainClass06 {
	public static void main(String[] args) {
		
		Warmer w1 = new Warmer() {
			
			@Override
			public void warm(String target) {
				System.out.println(target+" 을 따듯하게 해요");
			}
		};
		useWarmer(w1);
		
		Warmer w2 = (String target)->{
			System.out.println(target+" 을(를) 뜨겁게 해요");
		};
		useWarmer(w2);
	
		//매개변수의 type 생략가능
		Warmer w3 = (t)->{
			System.out.println(t+" 에 불을 붙여요");
		};
	}
	public static void useWarmer(Warmer w) {
		w.warm("손");
	}
}
