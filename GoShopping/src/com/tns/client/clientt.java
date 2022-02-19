package com.tns.client;

import com.tns.application.GSNormalAcc;
import com.tns.application.GSPrimeAcc;
import com.tns.application.GSShopFactory;

public class clientt {

	public static void main(String[] args) {
		//step1
		GSShopFactory gsshopfactory = new GSShopFactory();
		gsshopfactory.getNewPrimeAccount(1234,"syeda",250,true);
		gsshopfactory.getNewNormalAccount(5678,"banu",220,50);
		
		//step2
		GSPrimeAcc gsprime = new GSPrimeAcc();
		gsprime.getAccNm();
		gsprime.getAccNo();
		gsprime.getcharges();
		
		//step3
		gsprime.bookProduct(140);
		
		//step4
		gsprime.toString();
		
		//
	    GSNormalAcc gsnormal = new GSNormalAcc();
	    gsnormal.getAccNo();
	    gsnormal.getAccNm();
	    gsnormal.getCharges();	
        gsnormal.bookProduct(600);
        gsnormal.toString();
	    
	}

}
