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
    }public double getNumberOfOutcomeOperations(){
        CashMachine cashMachine=new CashMachine();
        if(cashMachine.getTransactions().length==0){
            return 0;
        }
        double outcome=0;
        int i;
        for(i=0;i<cashMachine.getTransactions().length; i++){
            if(cashMachine.getTransactions()[i]<0) {
                outcome += cashMachine.getTransactions()[i];
            }
        }
        return outcome;
    }
    public double getAverageOfOutcome(){
        CashMachine cashMachine=new CashMachine();
        if(cashMachine.getTransactions().length==0){
            return 0;
        }
        double outcome=0;
        int i;
        for(i=0;i<cashMachine.getTransactions().length; i++){
            if(cashMachine.getTransactions()[i]<0) {
                outcome += cashMachine.getTransactions()[i];
            }
        }
        return outcome/cashMachine.getTransactions().length;
    }
    public double getAverageOfIncome(){
        CashMachine cashMachine=new CashMachine();
        if(cashMachine.getTransactions().length==0){
            return 0;
        }
        double income=0;
        int i;
        for(i=0;i<cashMachine.getTransactions().length; i++){
            if(cashMachine.getTransactions()[i]>0) {
                income += cashMachine.getTransactions()[i];
            }
        }
        return income/cashMachine.getTransactions().length;
    }
}


