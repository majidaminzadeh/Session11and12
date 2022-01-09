package com.tosan.example2;

import com.tosan.example2.deposit.Deposit;
import com.tosan.example2.deposit.GharzDeposit;
import com.tosan.example2.deposit.JariDeposit;

public class Example3 {
    public static void main(String[] args) {
        GharzDeposit[] deposits = {new GharzDeposit(100), new GharzDeposit(200)};
        lottery(deposits);
        JariDeposit[] jariDeposits = {new JariDeposit(100)};
        lottery(jariDeposits);
        Lotteryable[] lotteryables = {new GharzDeposit(200), new JariDeposit(300)};
        lottery(lotteryables);
    }

    private static void lottery(Lotteryable[] deposits) {
        System.out.println("lottery system");
    }

}
