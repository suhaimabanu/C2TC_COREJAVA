package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class client {

	public static void main(String[] args) {
		// step1
		MMBankFactory mmb=new MMBankFactory();
		mmb.getNewCurrentAccount(743, "raj", 10000, 20000);
        mmb.getNewSavingAccount(7896, "priya", 40000, 15000);
        
        //step2
        MMSavingAcc mms = new MMSavingAcc(222, "diya",700, true);
        mms.getaccNo();
        mms.getMinbal();
        mms.getaccNm();
        mms.getaccBal();
        
        mms.withdraw(10000);
        mms.toString();
        
        MMCurrentAcc mmc = new MMCurrentAcc(111, "raj",500, 5000);
        mmc.getAccBal();
        mmc.getAccNo();
        mmc.getAccNm();
        mmc.withdraw(20000);
        mmc.toString();
        
	}

}
