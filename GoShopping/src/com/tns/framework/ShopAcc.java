package com.tns.framework;

public class ShopAcc {
	//fields
	 protected static int accNo;
	 protected static String accNm;
	 protected static float charges;
	 
      //constructor
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	//getters and setters for accNo charges
	public  static int getAccNo() {
		return accNo;
	}

	public static void setAccNo(int accNo) {
		ShopAcc.accNo = accNo;
	}

	public static float getCharges() {
		return charges;
	}

	public static void setCharges(float charges) {
		ShopAcc.charges = charges;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		ShopAcc.accNm = accNm;
	}


	//methods
	public void bookProduct(float charges) {
		System.out.println("Product booked and charges are : "+charges);

	}
	public void items(float charges) {
		System.out.println("Items delivered with charges : "+charges);

	}
	

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", getClass()=" + getClass()
		+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	


}
