package com.tns.framework;

public  class CurrentAcc extends BankAcc {
	
	protected static float creditLimit;
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		CurrentAcc.creditLimit = creditLimit;
		// TODO Auto-generated constructor stub
	}
	public void withdraw(float creditLimit) {
		System.out.println("withdrawing limit is:"+creditLimit);
		
	}
	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
