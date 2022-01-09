package com.tosan.example2.deposit.pasandaz;

import com.tosan.example2.Chequeable;
import com.tosan.example2.deposit.PasandazDeposit;
import com.tosan.example2.deposit.WithdrawalMethod;

import java.util.Calendar;
import java.util.Date;

public class BolandPasandazDeposit extends PasandazDeposit implements Chequeable {
    private static final String title = "سپرده پس انداز بلند مدت";
    private static final Date DUE_DATE;
    static{
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 2);
        DUE_DATE = calendar.getTime();
    }
    public BolandPasandazDeposit(int balance){
        super(balance, title, DUE_DATE);
    }

//    @Override
    public WithdrawalMethod[] getAllowedWithdrawalMethods() {
        return new WithdrawalMethod[0];
    }

    @Override
    protected float getAllowedPercent() {
        return 0;
    }

    @Override
    public void cheque() {
        System.out.println("...");
    }
}
