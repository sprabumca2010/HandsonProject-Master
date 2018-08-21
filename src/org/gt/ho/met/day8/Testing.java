package org.gt.ho.met.day8;

import java.util.ArrayList;

public class Testing {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> ary = new ArrayList<Integer>();
		ary.add(5);
		ary.add(5);
		ary.add(5);
		ary.add(5);
		ary.add(5);
		ary.add(5);
		ary.add(15);
		
		/*for(int i =0;i<ary.size();i++) {
			if(ary.get(i) == 5)
			ary.set(i, 100);
			//System.out.println(ary);
		}
			System.out.println(ary);
	*/
		if (ary.get(2) == 5) {
			ary.set(5, 2);
		}
		System.out.println(ary);
	}

}
