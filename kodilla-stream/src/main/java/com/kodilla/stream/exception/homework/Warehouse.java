package com.kodilla.stream.exception.homework;


import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    public static Set<Order> orderSet() {
        Set<Order> orders = new HashSet<>();
        orders.add(new Order("1187"));
        orders.add(new Order("17"));
        orders.add(new Order("23445"));
        orders.add(new Order("123"));
        orders.add(new Order("187"));
        return orders;
    }

    public static void addOrder(Order order) {
        orderSet().add(order);
    }

    public static void getOrder(String number) {
        Warehouse.orderSet()
                .stream()
                .filter(u -> u.getNumber().equals("17"))
                .map(u -> orderSet());




    }

}


