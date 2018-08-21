package org.gt.ho.inheritance1.day4;

import org.gt.ho.inheritance.day4.Inherit;

public class water extends Inherit {
	
	public void pepsi() {
		System.out.println("Taste of USA");

	}
	
	public static void main(String[] args) {
		water w =  new water ();
		w.pepsi();
		w.secondMsg();
		w.firstMsg();
		w.system();
	}

}
