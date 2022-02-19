package com.tns.application;

import com.tns.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc {
	
	
	
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}
	
	public GSNormalAcc() {
		super(accNo, accNm, deliveryCharge, deliveryCharge);
		
	}

	public void bookProduct(float deliveryCharge) {
		System.out.println("dear normal user, Your delivery Charges are: "+charges+" with charges: "+deliveryCharge);
		
	}

	@Override
	public String toString() {
		return "GSNormalAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
