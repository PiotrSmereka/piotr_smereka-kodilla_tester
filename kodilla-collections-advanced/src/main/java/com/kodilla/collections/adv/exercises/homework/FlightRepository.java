package com.kodilla.collections.adv.exercises.homework;


import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static void getFlightsTable (){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("From Berlin","To Warsaw" ));
        flights.add(new Flight("From Berlin","To Moscow" ));
        flights.add(new Flight("From Berlin","To Frankfurt" ));


    }
}
