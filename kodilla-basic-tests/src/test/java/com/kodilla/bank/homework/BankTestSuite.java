package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite extends CashMachineTestSuite {
private Bank bank = new Bank();


    @Test
    public void shouldDisplayTotalBalance() {
        int total = bank.getTotalBalance();
        assertEquals(4, total);
    }
}