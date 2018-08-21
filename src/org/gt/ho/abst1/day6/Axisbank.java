package org.gt.ho.abst1.day6;

public class Axisbank extends Bank {

	@Override
	public void savingsAccount() {
		System.out.println("Savings account Interest Rate is : 4%");

	}

	@Override
	public void currentAccount() {
		// TODO Auto-generated method stub

	}

	@Override
	public void joinAccount() {
		// TODO Auto-generated method stub

	}
public static void main(String[] args) {
	Axisbank a= new Axisbank();
	a.savingsAccount();
	a.branchDetails();
	
}




}
