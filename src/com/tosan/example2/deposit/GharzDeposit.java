package com.tosan.example2.deposit;

import com.tosan.example2.Lotteryable;

public class GharzDeposit extends Deposit implements Lotteryable {
    private static final String title = "سپرده قرض الحسنه";
    public GharzDeposit(int balance){
        super(balance, title);
        WithdrawalMethod[] methods = {WithdrawalMethod.NORMAL, WithdrawalMethod.CARD};
        setWithdrawalMethod(methods);
    }

//    @Override
    public WithdrawalMethod[] getAllowedWithdrawalMethods() {
        return getWithdrawalMethod();
    }

    @Override
    protected float getAllowedPercent() {
        return 0.8f;
    }

    @Override
    public void lottery(){
        System.out.println("I can win money");
    }
}
