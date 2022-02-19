package com.tns.framework;

public class PrimeAcc extends ShopAcc {
	//field
	public static boolean isPrime;
	protected static final float delivaryCharges=0;

	
	//constructor
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		PrimeAcc.setPrime(isPrime);
	}
	
	public static boolean isPrime() {
		return isPrime;
	}

	public static void setPrime(boolean isPrime) {
		PrimeAcc.isPrime = isPrime;
	}

	public void bookProduct(float charges) {
		System.out.println("charges are: "+charges);
		
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
