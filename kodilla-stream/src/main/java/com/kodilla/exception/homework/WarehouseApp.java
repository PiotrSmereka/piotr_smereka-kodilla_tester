package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse.orderSet();
        Warehouse.addOrder(new Order("3222"));
        Warehouse.addOrder(new Order("32"));
        Warehouse.addOrder(new Order("111"));
        System.out.println(Warehouse.orders.size() );

        System.out.println(Warehouse.getOrder("11"));



    }
}
