package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RoutePlanner {


    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airportCheck = new HashMap<>();
        airportCheck.put(flight.getDepartureAirport(), flight.arrivalAirportIfOpen);

        if(flight.getArrivalAirportIfOpen() != null) {
            for (Map.Entry<String, Boolean> entry : airportCheck.entrySet()) {
                if(entry.getValue()) {
                    System.out.println("You can fly to: " + entry.getKey());
                } else {
                    System.out.println("This airport is closed.");
                }
            }
        } else {
            throw new RouteNotFoundException("Unable to check the system");
        }



    }


}
