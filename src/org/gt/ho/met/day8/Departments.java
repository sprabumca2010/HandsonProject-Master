package org.gt.ho.met.day8;

public class Departments {

	private String departmentName;
	public int salary(int hours, int pay) {
		int c= hours*pay;
		return c;


	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	/*public void English() {
	System.out.println("English Department");

	}
	public void Tamil() {
		System.out.println("Tamil Department");

	}
	public void German() {
		System.out.println("German Department");

	}
	 */	


}
