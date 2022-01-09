package com.tosan.example2.deposit;

import com.tosan.example2.Chequeable;
import com.tosan.example2.Lotteryable;

public class JariDeposit extends Deposit implements Lotteryable, Chequeable {
    private static final String title = "سپرده جاری";
    public JariDeposit(int balance){
        super(balance, title);
        WithdrawalMethod[] methods =  {WithdrawalMethod.CHEQUE, WithdrawalMethod.NORMAL, WithdrawalMethod.CM};
        setWithdrawalMethod(methods);
    }

//    @Override
    public WithdrawalMethod[] getAllowedWithdrawalMethods() {
        return getWithdrawalMethod();
    }


    public void lottery(){
        System.out.println("I can win money");
    }
    @Override
    protected float getAllowedPercent() {
        return 1;
    }

    @Override
    public void cheque() {

    }
}
