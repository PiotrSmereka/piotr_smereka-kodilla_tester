package com.kodilla.stream.exception.homework;


import java.util.Set;

public class Warehouse {
     static Set<Order> orders;

    Warehouse( Set<Order> orders) {

        orders.add(new Order("1187"));
        orders.add(new Order("17"));
        orders.add(new Order("23445"));
        orders.add(new Order("123"));
        orders.add(new Order("187"));
    }

    public static Set<Order> getOrderSet(){
        return orders ;
    }

    public static void addOrder(Order order) {
        getOrderSet().add(order);
    }

    // public static void getOrder(String number) {
       // Warehouse.getOrderSet()
         //       .stream()
          //      .filter(u -> u.getNumber().equals(number))
           //     .findFirst();


    }




