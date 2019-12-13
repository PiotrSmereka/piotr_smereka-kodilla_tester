package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
private CashMachine cashMachine = new CashMachine();
    @Test
    public void shouldDisplayIncome() {
        cashMachine.add (1);
        int[] transactions = cashMachine.getTransactions();
        assertEquals(1, transactions[0]);
    }
    @Test
    public void shouldDisplayOutcome() {
        cashMachine.add(-3);
        int[] transactions = cashMachine.getTransactions();
        assertEquals(-3, transactions[0]);
    }
    @Test
    public void shouldDisplayBalance() {
        cashMachine.add (-3);
        cashMachine.add (8);
        cashMachine.add (10);
        int balance= cashMachine.getBalance();
        assertEquals(15, balance);
    }
    @Test
    public void shouldDisplayZeroTransactions() {
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }
    @Test
    public void shouldDisplayNumberOfTransactions() {
        cashMachine.add (-15);
        cashMachine.add (5);
        cashMachine.add (7);
        int[] transactions = cashMachine.getTransactions();
        assertEquals(3, transactions.length);
    }
    @Test
    public void shouldDisplayAllTransactionsInOrder() {
        cashMachine.add (1);
        cashMachine.add (-4);
        int[] transactions = cashMachine.getTransactions();
        assertArrayEquals(new int[]{1, -4}, transactions);
    }
}

