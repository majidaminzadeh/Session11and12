package com.tosan.example2.deposit;

import java.util.Calendar;
import java.util.Date;

public abstract class PasandazDeposit extends Deposit {
    private Date dueDate;

    public PasandazDeposit(int balance, String title, Date dueDate){
        super(balance, title);
        setDueDate(dueDate);
        WithdrawalMethod[] methods = {WithdrawalMethod.CARD, WithdrawalMethod.NORMAL};
        setWithdrawalMethod(methods);
    }

    public void withdrawal(int balance, WithdrawalMethod withdrawalMethod) {
        validateWithdrawalForPasandaz(balance , withdrawalMethod);
        withdrawal(balance);
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    private void validateWithdrawalForPasandaz(int balance, WithdrawalMethod withdrawalMethod){
        super.validateWithdrawal(balance , withdrawalMethod);
        validateDueDate();
    }

    private void validateDueDate(){
        Calendar calendar = Calendar.getInstance();
        if (calendar.getTime().compareTo(getDueDate()) < 0){
            throw new RuntimeException("Can not withdrawal before " + getDueDate());
        }
    }
}
