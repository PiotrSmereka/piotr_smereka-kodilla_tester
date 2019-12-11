package com.kodilla.bank.homework;

public class CashMachine {
    private int currentValue;
    private int moneyIn;
    private int moneyOut;
    private int[] transactions;



    public CashMachine() {
        this.currentValue = 0;
        this.transactions = new int[1];
    }


    public int calculateBalanceOfCashMachine(int in, int out) {
        return in + out;
    }
}
