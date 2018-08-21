package org.gt.ho.met.day8;

import java.util.ArrayList;

public class Method1 {

	public static void main(String[] args) {

		ArrayList<Integer> ide = new ArrayList<Integer>();
		/*ide.add(50);
	ide.add(55);
	ide.add(30);
	ide.add(106);
	ide.add(100);
	ide.add(-10);
	ide.add(-60);
	ide.add(10);*/
		System.out.println(ide.size());
	
		try {
			int i=1/0;
			if(ide.get(3) == 10) {
				ide.set(3, 66);
			
				System.out.println(ide);	
			}else {
				ide.set(3, 10);
				System.out.println(ide);
			}
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic"+e.getMessage());
			// TODO: handle exception
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("AAA"+e.getMessage());
		}
		
		/*catch (Exception exe) {
			System.out.println("inexception"+exe.getMessage());
		}*/
		System.out.println("test");
		
		
		//System.out.println(ide);
	}
}
