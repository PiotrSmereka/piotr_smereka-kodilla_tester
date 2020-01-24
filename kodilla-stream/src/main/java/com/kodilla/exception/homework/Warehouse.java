package com.kodilla.exception.homework;




import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    static Set<Order> orders;

    public static void orderSet() {
        orders = new HashSet<>();
        orders.add(new Order("1187"));
        orders.add(new Order("17"));
        orders.add(new Order("23445"));
        orders.add(new Order("123"));
        orders.add(new Order("187"));
    }
public static Set<Order> getOrderSet(){
        return orders;
}

    public static void addOrder(Order order) {
        getOrderSet().add(order);
    }

    public static String getOrder(String number) {
        String a = Warehouse.getOrderSet()
                .stream()
                .filter(u -> u.getNumber().equals(number))
                .findFirst()
                .toString();
        return a;

    }






    }




