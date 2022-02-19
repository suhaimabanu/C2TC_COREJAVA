package com.tns.application;

import com.tns.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	
	//constructor
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}
	
	//methods
	public void withdraw(float creditLimit) {
		System.out.println("your credit limitis:"+creditLimit);
		
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public float getAccBal() {
		return accBal;
		// TODO Auto-generated method stub
		
	}

}
