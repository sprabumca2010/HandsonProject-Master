package org.gt.ho.abst1.day6;

public class Inter3 implements Inter1,Inter2 {
	
	@Override
	public void test1() {
		System.out.println("TEST1");
		
	}
	public void test2() {
		System.out.println("TEST2");
		
	}
	public static void main(String[] args) {
		Inter3 i = new Inter3 ();
		i.test1();
		i.test2();
	}

}
