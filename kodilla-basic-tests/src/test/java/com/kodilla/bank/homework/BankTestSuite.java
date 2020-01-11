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
        tab[0].add(10);
        tab[0].add(-5);
        tab[0].add(-5);
        tab[1].add(10);
        tab[1].add(-8);
        tab[1].add(-5);
        assertEquals(4,bank.getNumberOfOutcomeOperations());


    }
    @Test
    public void shouldDisplayNumberOfIncomeOperations(){
        Bank bank = new Bank ();
        CashMachine[] tab = bank.getCashMachines();
        tab[0].add(10);
        tab[0].add(-5);
        tab[0].add(-5);
        tab[1].add(10);
        tab[1].add(-8);
        tab[1].add(-5);
        assertEquals(2,bank.getNumberOfIncomeOperations());

    }
    @Test
    public void shouldDisplayAverageOfOutcome(){
        Bank bank = new Bank ();
        CashMachine[] tab = bank.getCashMachines();
        tab[0].add(10);
        tab[0].add(-5);
        tab[0].add(-5);
        tab[1].add(10);
        tab[1].add(-5);
        tab[1].add(-5);
        assertEquals(-5,bank.getAverageOfOutcome());
    }
    @Test
    public void shouldDisplayAverageOfIncome(){
        Bank bank = new Bank ();
        CashMachine[] tab = bank.getCashMachines();
        tab[0].add(10);
        tab[0].add(-5);
        tab[0].add(-5);
        tab[1].add(10);
        tab[1].add(-8);
        tab[1].add(-5);
        assertEquals(10,bank.getAverageOfIncome());
    }
}