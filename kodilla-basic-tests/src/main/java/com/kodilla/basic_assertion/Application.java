package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int c = 4;
        int sumResult = calculator.sum(a, b);
        boolean correct1 = ResultChecker.assertEquals(13, sumResult);
        if (correct1) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int subtractResult = calculator.subtract(a, b);
        boolean correct2 = ResultChecker.assertEquals(-3, subtractResult);
        if (correct2) {
            System.out.println("Metoda odejmowania działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda odejmowania nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int squaredResult = calculator.squared(c);
        boolean correct3 = ResultChecker.assertEquals(16, squaredResult);
        if (correct3) {
            System.out.println("Metoda podnosząca liczbę do kwadratu działa poprawnie dla liczby " + c);
        } else {
            System.out.println("Metoda podnosząca liczbę do kwadratu nie działa poprawnie dla liczby " + c);;
        }
    }


}
