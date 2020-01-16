package com.kodilla.bank.homework;

public class CashMachine {
    private int currentValue;
    private int[] transactions;

    public CashMachine() {
        this.currentValue = 0;
        this.transactions = new int[0];
    }

    public void add(int value) {
        this.currentValue++;
        int[] newTab = new int[this.currentValue];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.currentValue - 1] = value;
        this.transactions = newTab;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getBalance () {
        if (this.transactions.length == 0){
            return 0;
    }
    int sum = 0;
        for(int i = 0; i < this.transactions.length; i++) {
        sum += this.transactions[i];
    }
        return sum;
    }
}

