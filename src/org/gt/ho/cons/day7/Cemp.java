package org.gt.ho.cons.day7;

public class Cemp extends Axis{

	/*public Cemp() {
		System.out.println("Constructor");

	}*/

	public Cemp (int a) {
		super();
		System.out.println(a);
	}
	
	public void test(String name) {
			System.out.println("test");
	}
	public static void main(String[] args) {
		Cemp v = new Cemp(123654);
		v.test();
		

	}

}
