package com.kodilla.good.patterns.airline;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightServiceFinder {

    private final List<Flight> connectionList = new ArrayList<>();

    public void addFlight(Airport depDest, Airport arrDest, List<Airport> stopOver){
        connectionList.add(new Flight(depDest, arrDest, stopOver));
    }

    public  void findDeparture(Airport depDest){
        System.out.println("Available flights from: " + depDest.getName());
        connectionList.stream().filter(e -> e.getDepDest().equals(depDest)).forEach(System.out::println);
    }

    public  void findArrival(Airport arrDest){
        System.out.println("Available flights to: " + arrDest.getName());
        connectionList.stream().filter(e -> e.getDepDest().equals(arrDest)).forEach(System.out::println);
    }

    public void findDepFlightViaStopOver(Airport depDest, Airport arrDest, List<Airport> stopOver){
        System.out.println("Departures from " + depDest.getName() + " with stopover");
        for (int i = 0; i<stopOver.size(); i++){
            int number = i;
            connectionList.stream().filter(e -> (e.getDepDest().equals(depDest)) && (e.getStopOverList() != null)).
                    collect(Collectors.toList()).stream().
                    filter(e -> e.getStopOverList().contains(stopOver.get(number))).forEach(System.out::println);
        }
    }



}
