package com.kodilla.good.patterns.airline;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightServiceFinder {

    private final List<Flight> connectionList = new ArrayList<>();

    public void addFlight(Airport depDest, Airport arrDest){
        connectionList.add(new Flight(depDest, arrDest));
    }

    public  void findDeparture(Airport depDest){
        System.out.println("Available flights from: " + depDest.getName());
        connectionList.stream().filter(e -> e.getDepDest().equals(depDest)).forEach(System.out::println);
    }

    public  void findArrival(Airport arrDest){
        System.out.println("Available flights to: " + arrDest.getName());
        connectionList.stream().filter(e -> e.getDepDest().equals(arrDest)).forEach(System.out::println);
    }

//    public void findDepFlightViaStopOver(Airport depDest, Airport arrDest, Airport stopOver){
//        System.out.println("Departures from " + depDest.getName() + " with stopover");
//        connectionList.stream().filter(e -> (e.getDepDest().equals(depDest)))
//                .filter(e -> (e.getArrDest().equals(arrDest)))
//                .filter(e -> (e.getStopOverList().contains(stopOver))).forEach(System.out::println);
//    }
//
//    public void findDepFlightViaStopOvers(Airport depDest, Airport arrDest, Set<Airport> stopOvers){
//        System.out.println("Departures from " + depDest.getName() + " with stopover");
//        connectionList.stream().filter(e -> (e.getDepDest().equals(depDest)))
//                .filter(e -> (e.getArrDest().equals(arrDest)))
//                .filter(e -> (e.getStopOverList().containsAll(stopOvers))).forEach(System.out::println);
//    }

    public void findConnection(Airport depDest, Airport arrDest){
        for (Flight flight : connectionList){

        }
    }

    private List<Flight> getAllFlightsFrom(Airport depDest){
        return  connectionList.stream().filter(e -> (e.getDepDest().equals(depDest)))
                .collect(Collectors.toList());
    }


}
