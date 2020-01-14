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
        if (cashMachines.length == 0) {
            return 0;
        }
        int outcome = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            if (cashMachine.getTransactions()[i]< 0) {
                outcome += cashMachine.getTransactions()[i];
            }
        }
        return outcome;
    }

    public int getNumberOfIncomeOperations(CashMachine cashMachine){

        if (cashMachines.length==0){
            return 0;
        }
        int income =0;
        for(int i=0;i<cashMachines.length; i++){
            if(cashMachine.getTransactions()[i]>0) {
                    income += cashMachine.getTransactions()[i];
                }
        }
        return income;
    }

    public double getAverageOfOutcome(CashMachine cashMachine){
        if(cashMachines.length==0){
            return 0;
        }
        double outcome=0;
        int n = 1;
        for(int i=0;i<cashMachines.length; i++){
            if(cashMachines[i].getTransactions()[i]<0) {
                outcome += cashMachines[i].getTransactions()[i];
                n = cashMachines[i].getTransactions()[i];
            }
        }
        return outcome/n;
    }

    public double getAverageOfIncome(CashMachine cashMachine){
        if(cashMachines.length==0){
            return 0;
        }
        double income=0;
        int n =1;
        for(int i=0;i<cashMachines.length; i++){
            if(cashMachines[i].getTransactions()[i]>0) {
                income += cashMachines[i].getTransactions()[i];
                n = cashMachines[i].getTransactions()[i];
            }
        }
        return income/n;
    }
}


