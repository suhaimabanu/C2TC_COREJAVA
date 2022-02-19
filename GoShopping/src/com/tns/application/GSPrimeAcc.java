package com.tns.application;

import com.tns.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	private static final float charges=0;
	
	//getter
	 public float getcharges() {
		 return charges;
	 }
	//constructor
	public GSPrimeAcc() {
		super(accNo, accNm, charges, isPrime);
	}

	public void bookProduct(float charges) {
		System.out.println("dear prime user, your product charges are:"+ charges);
		
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
