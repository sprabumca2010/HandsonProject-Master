package org.gt.ho.poly.day4;

public class load {
	
	public void empId(int age) {
		System.out.println(age);

	}
	public void empId(String Name) {
		System.out.println(Name);

	}
	public void empId(short age) {
		System.out.println(age);

	}
	public void empId(float sal) {
		System.out.println(sal);

	}	public void empId(boolean values) {
		System.out.println(values);

	}
	public static void main(String[] args) {
		load l = new load();
		l.empId("PRABU MS");
		l.empId(50000);
		l.empId("True");
		l.empId(30);
		
		
	}

}
