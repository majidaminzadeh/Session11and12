package com.tosan.example2.deposit.pasandaz;

import com.tosan.example2.deposit.PasandazDeposit;
import com.tosan.example2.deposit.WithdrawalMethod;

import java.util.Calendar;
import java.util.Date;

public class KotahPasandazDeposit extends PasandazDeposit {
    private static final String title = "سپرده پس انداز کوتاه مدت";
    private static final Date DUE_DATE;
    static{
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 6);
        DUE_DATE = calendar.getTime();
    }
    public KotahPasandazDeposit(int balance){
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
}
