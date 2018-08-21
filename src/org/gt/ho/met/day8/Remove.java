package org.gt.ho.met.day8;

import java.util.ArrayList;
import java.util.List;

public class Remove {
	
	public static void main(String[] args) {
		
		List<Integer> emp = new ArrayList<Integer>();
		emp.add(5);
		emp.add(5);
		emp.add(10);
		emp.add(55);
		emp.add(51);
		emp.add(52);
		emp.add(53);
		System.out.println(emp);
		//emp.remove(2);
		emp.add(2, 100);
		System.out.println(emp);
		
	}

}
