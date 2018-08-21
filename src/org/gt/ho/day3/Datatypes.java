package org.gt.ho.day3;

public class Datatypes {
	
	public static void main(String[] args) {
		Datatypes dec = new Datatypes();
		dec.declaration();
	}

	public void declaration() {
		System.out.println("List of Datatypes are displaying:");
		
		byte numValue = 12;
		System.out.println("1.Byte:"+numValue);
		short s = 182;
		System.out.println("2.short:"+s);
		long a = 963258741l;
		System.out.println("3.long:"+a);
		int i = 7896541; 
		System.out.println("4.int:"+i);

		float f = (float) 8989.1234;
		System.out.println("5.float:"+f);
		double d = 8989.12345678;
		System.out.println("6.double:"+d);

		boolean b = true;
		System.out.println("7.boolean:"+b);
		boolean bb = false;
		System.out.println("8.boolean:"+bb);
		
		char ch = 'a';
		System.out.println("9.char:"+ch);
		char cha = 'A';
		System.out.println("10.char:"+cha);

		String name = "BABA the Boss";
		System.out.println("11.String:"+name);

	}


}
