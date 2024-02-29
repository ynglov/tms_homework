package org.task2;

import java.sql.SQLOutput;

public class CreditCard {
    public int accNumber;
    public int amountOnAcc;

    public CreditCard(int accNumber, int amountOnAcc) {
        this.accNumber = accNumber;
        this.amountOnAcc = amountOnAcc;
    }

    public void transfer(int money){
        amountOnAcc += money;
    }
    public void withdraw(int money){
        if(amountOnAcc-money < 0){
            System.out.println("insufficient funds for card " + accNumber);
        } else {
            amountOnAcc -= money;
        }
    }
    public void showCreditCard () {
        System.out.println("Account number: " + accNumber);
        System.out.println("Amount on account: " + amountOnAcc);
    }



}
