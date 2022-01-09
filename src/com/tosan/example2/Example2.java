package com.tosan.example2;

import com.tosan.example2.deposit.*;
import com.tosan.example2.deposit.pasandaz.BolandPasandazDeposit;
import com.tosan.example2.deposit.pasandaz.KotahPasandazDeposit;

public class Example2 {
    public static void main(String[] args) {
//        Deposit gharz = new GharzDeposit(100);
//        Deposit jari = new JariDeposit(100);
//        Deposit kotah = new KotahPasandazDeposit(100);
//        Deposit boland = new BolandPasandazDeposit(100);
//        withdrawal(gharz, 70, WithdrawalMethod.CARD);
//        withdrawal(jari, 100, WithdrawalMethod.CHEQUE);
//        withdrawal(kotah, 50, WithdrawalMethod.NORMAL);
//        withdrawal(boland, 20, WithdrawalMethod.CARD);
    }

    private static void withdrawal(Deposit deposit, int balance, WithdrawalMethod method) {
        deposit.withdrawal(balance, method);

    }
}
