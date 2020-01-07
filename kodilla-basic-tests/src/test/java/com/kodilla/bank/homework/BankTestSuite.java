package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldDisplayTotalBalance() {
        Bank bank = new Bank ();

        int total = bank.getTotalBalance();
        assertEquals(4, total);
    }
    @Test
    public void shouldDisplayNumberOfOutcomeOperations(){
        Bank bank = new Bank();

    }
    @Test
    public void shouldDisplayNumberOfIncomeOperations(){
        Bank bank = new Bank();

    }
}