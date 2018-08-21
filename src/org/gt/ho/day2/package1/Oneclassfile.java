package org.gt.ho.day2.package1;

import org.gt.ho.day2.package2.Classfiles;

public class Oneclassfile {
	
	public void company() {
		System.out.println("DARDEN is company and details followed:");

	}
	public static void main(String[] args) {
		Oneclassfile c = new Oneclassfile();
		c.company();
		Classfiles clie = new Classfiles ();
		clie.client();
		Classfiles pro = new Classfiles ();
		pro.project();
		Classfiles emp = new Classfiles ();
		emp.employee();
			
		
	}

}
