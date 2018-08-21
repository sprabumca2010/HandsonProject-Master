package org.gt.ho.abst1.day6;

public abstract class Bank {
	
	public abstract void savingsAccount() ;
	public abstract void currentAccount() ;
	public abstract void joinAccount() ;
	public void branchDetails() {
		System.out.println("Branch Details : Chennai");

	}
	public static void main(String[] args) {
		System.out.println("Abstract Class:");
	}

}
