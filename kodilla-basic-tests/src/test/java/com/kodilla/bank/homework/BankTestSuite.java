package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {


    @Test
    public void shouldDisplayTotalBalance() {
        Bank bank = new Bank ();
        CashMachine[] tab = bank.getCashMachines();
        tab[0].add(10);
        tab[0].add(-5);
        tab[1].add(10);
        tab[1].add(-6);
        assertEquals(9, bank.getTotalBalance());
    }

    @Test
    public void shouldDisplayNumberOfOutcomeOperations(){
        Bank bank = new Bank ();
        CashMachine[] tab = bank.getCashMachines();
        tab[0].add(-2);
        tab[0].add(3);
        tab[0].add(-5);
        tab[0].add(-7);
        tab[0].add(0);
        assertEquals(3,bank.getNumberOfOutcomeOperations(tab[0]));
    }

    @Test
    public void shouldDisplayNumberOfIncomeOperations(){
        Bank bank = new Bank ();
        CashMachine[] tab = bank.getCashMachines();
        tab[0].add(0);
        tab[0].add(15);
        tab[0].add(-2);
        tab[0].add(3);
        tab[0].add(1);
        assertEquals(3,bank.getNumberOfIncomeOperations(tab[0]));
    }

    @Test
    public void shouldDisplayAverageOfOutcome(){
        Bank bank = new Bank ();
        CashMachine[] tab = bank.getCashMachines();
        tab[0].add(-5);
        tab[0].add(-6);
        tab[0].add(2);
        tab[0].add(0);
        assertEquals(-5.5,bank.getAverageOfOutcome(tab[0]));
    }

    @Test
    public void shouldDisplayAverageOfIncome(){
        Bank bank = new Bank ();
        CashMachine[] tab = bank.getCashMachines();
        tab[0].add(10);
        tab[0].add(-5);
        tab[0].add(20);
        tab[0].add(0);
        assertEquals(15,bank.getAverageOfIncome(tab[0]));
    }
}