package com.kodilla.stream.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse.getOrderSet();
        Warehouse.addOrder(new Order("3222"));
        Warehouse.addOrder(new Order("32"));
        System.out.println(Warehouse.orders.size());

    }
}
