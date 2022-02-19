package com.tns.framework;

public  class SavingAcc extends BankAcc {
	static boolean isSalary;
	static final float MINBAL=0;
	
	//constructor
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		SavingAcc.isSalary = isSalary;
	}
	
	//methods
	public void withdraw(float accBal) {
		System.out.println("withdrawn below minimum balance is :"+ accBal);

	}
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
		+ ", toString()=" + super.toString() + "]";
	}

}
