package com.tns.application;

public class MMSavingAcc {
	private static final float MINBAL=100;
	
	public static float getMinbal() {
		return MINBAL;
	}
	
	//constructor
	public MMSavingAcc(int accNo, String accNm, int accBal, boolean isSalaried) {
		// TODO Auto-generated constructor stub
	}

	//methods
	public void withdraw (float creditLimit) {
		System.out.println("withdrawn the amount of:"+ creditLimit);
		
	}
	
	@Override
	public String toString() {
		return "MMSavingAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public void getaccNo() {
		// TODO Auto-generated method stub
		
	}

	public void getaccNm() {
		// TODO Auto-generated method stub
		
	}

	public void getaccBal() {
		// TODO Auto-generated method stub
		
	}
	

}
