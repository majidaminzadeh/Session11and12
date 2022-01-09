package com.tosan.example2.deposit;

import com.tosan.example2.customer.Customer;

import java.util.Date;

public abstract class Deposit {
    private String title;
    private int balance;
    private String depositNumber;
    private Customer customer;
    private Date openDate;
    private float withdrawalAllowedPercent;
    private WithdrawalMethod[] withdrawalMethod;

    public Deposit(int balance, String title){
        setBalance(balance);
    }

    public Deposit(String depositNumber, int balance, Customer customer){

    }

    public void defray(int balance){
        //..
    }

    public abstract WithdrawalMethod[] getAllowedWithdrawalMethods();

    public void withdrawal(int balance, WithdrawalMethod withdrawalMethod){
        validateWithdrawal(balance, withdrawalMethod);
        withdrawal(balance);
    }

    protected void withdrawal(int balance) {
        setBalance(getBalance() - balance);
        System.out.println("Withdrawal success");
    }

    protected void validateWithdrawal(int balance, WithdrawalMethod withdrawalMethod){
        if(balance < 0){
            throw new RuntimeException("Balance is negative");
        }
        if(balance > getBalance()){
            throw new RuntimeException("Balance is not permitted, Max balance exceeded");
        }
        if(balance > getMaxAllowedWithdrawalBalance()){
            throw new RuntimeException("Balance is not permitted");
        }
        if(!isWithdrawalContain(withdrawalMethod)){
            throw new RuntimeException("Withdrawal method is not permitted");
        }
    }

    private boolean isWithdrawalContain(WithdrawalMethod withdrawalMethod) {
        for (WithdrawalMethod method : this.withdrawalMethod){
            if(method.equals(withdrawalMethod)){
                return true;
            }
        }
        return false;
    }

    public int getMaxAllowedWithdrawalBalance(){
        return (int)(getBalance() * getWithdrawalAllowedPercent());
    }

    protected float getWithdrawalAllowedPercent(){
        return this.withdrawalAllowedPercent;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDepositNumber(String depositNumber) {
        this.depositNumber = depositNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public int getBalance() {
        return balance;
    }

    public String getDepositNumber() {
        return depositNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setWithdrawalAllowedPercent(float withdrawalAllowedPercent) {
        this.withdrawalAllowedPercent = getAllowedPercent();
    }

    protected abstract float getAllowedPercent();

    public void setWithdrawalMethod(WithdrawalMethod[] withdrawalMethod) {
        this.withdrawalMethod = withdrawalMethod;
    }

    public WithdrawalMethod[] getWithdrawalMethod() {
        return withdrawalMethod;
    }
}
