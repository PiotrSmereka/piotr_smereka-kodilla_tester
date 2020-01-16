package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank() {
        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        this.cashMachines= new CashMachine[]{cashMachine,cashMachine2};
    }

    public int getTotalBalance () {
        if (cashMachines.length == 0){
            return 0;
        }
        int total = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            total += cashMachines[i].getBalance();
        }
        return total;
    }

    public CashMachine[] getCashMachines(){
        return cashMachines;
    }

    public int getNumberOfOutcomeOperations(CashMachine cashMachine) {
        int [] transactions = cashMachine.getTransactions(); // wyciagnięcie transakcji z jednego bankomatu i przypisanie do zmiennej int [] transactions
        if (transactions.length == 0) {
            return 0;
        }
        int n = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i]< 0) {
                n++;
            }
        }
        return n;
    }

    public int getNumberOfIncomeOperations(CashMachine cashMachine){
        int [] transactions = cashMachine.getTransactions(); // wyciagnięcie transakcji z jednego bankomatu i przypisanie do zmiennej int [] transactions
        if (transactions.length == 0) {
            return 0;
        }
        int n=0;
        for(int i=0;i<transactions.length; i++){
            if(transactions[i]>0) {
                    n++;
                }
        }
        return n;
    }

    public double getAverageOfOutcome(CashMachine cashMachine){
        int [] transactions = cashMachine.getTransactions(); // wyciagnięcie transakcji z jednego bankomatu i przypisanie do zmiennej int [] transactions
        if (transactions.length == 0) {
            return 0;
        }
        double outcome = 0;
        int n = 0;
        for(int i=0;i<transactions.length; i++){
            if(transactions[i]<0) {
                outcome += transactions[i];
                n++;
            }
        }
        if (n == 0){    //zapobieganie dzieleniu przez 0
            return 0;
        }
        return outcome/n;
    }

    public double getAverageOfIncome(CashMachine cashMachine){
        int [] transactions = cashMachine.getTransactions(); // wyciagnięcie transakcji z jednego bankomatu i przypisanie do zmiennej int [] transactions
        if (transactions.length == 0) {
            return 0;
        }
        double income = 0;
        int n = 0;
        for(int i=0;i<transactions.length; i++){
            if(transactions[i]>0) {
                income += transactions[i];
                n++;
            }
        }
        if (n == 0){    //zapobieganie dzieleniu przez 0
            return 0;
        }
        return income/n;
    }
}


