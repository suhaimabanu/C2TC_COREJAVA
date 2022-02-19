package com.tns.framework;

public  class BankAcc {
	protected static int accNo;
	protected static String accNm;
	protected static float accBal;
	 
	 //constructor
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	//getters and setters
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	public String getAccNm() {
		return accNm;
	}
	public void withdraw(float accBal) {
		System.out.println("account balance after withdraw is:"+ accBal);
		
	}
	public void deposite(float accBal) {
		System.out.println("account balance after depositing:"+ accBal);
		
	}
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getAccNm( String accNm) {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm=accNm;
	}
	

}
