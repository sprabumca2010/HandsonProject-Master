package org.gt.ho.met.day8;

import java.util.ArrayList;

public class Methods {

	public static void main(String[] args) {

		ArrayList<Integer> ide = new  ArrayList<Integer>();
		ide.add(10);
		ide.add(10);
		ide.add(10);
		ide.add(10);
		ide.add(10);
		ide.add(10);
		ide.add(10);
		ide.add(90);

//Type Set
		for(int i =0; i < ide.size();i++) {
			System.out.println(i);
			System.out.println("size"+ide.size());
			System.out.println("ide value"+ide.get(i));
			if(ide.get(i) == 10) {
				ide.set(i, 100);
			}
		}
		System.out.println(ide);
		//Type set

		/*		ide.set(1, 100);
		ide.set(2, 100);
		ide.set(3, 100);
		ide.set(4, 100);
		ide.set(5, 100);
		ide.set(6, 100);
		ide.set(7, 100);
		System.out.println(ide);
		 */
	}

}
