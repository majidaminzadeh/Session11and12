package com.tosan.example2;

import com.tosan.example2.deposit.GharzDeposit;
import com.tosan.example2.deposit.JariDeposit;
import com.tosan.example2.deposit.pasandaz.BolandPasandazDeposit;

public class Example4 {
    public static void main(String[] args) {
        Chequeable[] chequeables = {new BolandPasandazDeposit(10), new JariDeposit(90), new GharzDeposit(400)};
    }
    public static void cheque(Chequeable[] chequeables){
        chequeables[0].cheque();
    }
}
