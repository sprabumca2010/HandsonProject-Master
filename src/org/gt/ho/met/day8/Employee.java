package org.gt.ho.met.day8;

import javax.lang.model.element.Element;

public class Employee extends Departments{

	private String Name;
	private int Salary;

	public static void main(String[] args) {
		Employee E1 = new Employee();
		E1.setName("Merlin");
		E1.setDepartmentName("English");
		int c = E1.salary(5, 50);
		E1.setSalary(c);
		System.out.println(E1.getName());
		System.out.println(E1.getDepartmentName());
		System.out.println(E1.getSalary());
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}



}
