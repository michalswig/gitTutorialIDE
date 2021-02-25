package com.kodilla.good.patterns.airline2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {
    private final List<Flight> flights = FlightRequestRetriever.retrieve();

    public List<Flight> allFlightsFrom(String departureAirport) {
        return flights.stream()
                .filter(s -> departureAirport.equals(s.getDepartureAirport()))
                .collect(Collectors.toList());
    }

    public List<Flight> allFlightsTo(String arrivalAirport) {
        return flights.stream()
                .filter(s -> arrivalAirport.equals(s.getArrivalAirport()))
                .collect(Collectors.toList());
    }

    public List<List<Flight>> stopOverFlights(String departureAirport, String arrivalAirport) {

        List<Flight> allFlightsFromChosenDepartureAirport = allFlightsFrom(departureAirport);
//[Flight{departureAirport='Poznan', arrivalAirport='Warszawa'}, ++++
// Flight{departureAirport='Poznan', arrivalAirport='Warszawa'},
// Flight{departureAirport='Poznan', arrivalAirport='Gdansk'}]

        List<Flight> allFlightsToChosenArrivalAirport = allFlightsTo(departureAirport);
//[Flight{departureAirport='Warszawa', arrivalAirport='Gdansk'}, ++++
// light{departureAirport='Szczecin', arrivalAirport='Gdansk'}]

        List<Flight> directFlights = allFlightsFromChosenDepartureAirport.stream()
                .filter(s -> departureAirport.equals(s.getDepartureAirport()) && arrivalAirport.equals(s.getArrivalAirport()))
                .collect(Collectors.toList());
//Flight a7 = new Flight("Poznan", "Gdansk");

        List<List<Flight>> listOfRequestedConnections = new ArrayList<>();
        listOfRequestedConnections.add(directFlights);

        List<Flight> tempList = new ArrayList<>();

        for(Flight flight : allFlightsFromChosenDepartureAirport){
            for(Flight flight1 : allFlightsToChosenArrivalAirport){
                allFlightsFromChosenDepartureAirport.stream()
                        .filter(e -> flight.getArrivalAirport().equals(flight1.getDepartureAirport()))
                        .forEach(tempList::add);
            }
        }
        listOfRequestedConnections.add(tempList);
//        List<Flight> stopOverFlights = allFlightsFromChosenDepartureAirport.stream()
//                .filter(s -> allFlightsToChosenArrivalAirport.contains(new Flight(s.getArrivalAirport(), arrivalAirport)))
//                .collect(Collectors.toList());
//
//        List<List<Flight>> listOfRequestedConnections = new ArrayList<>();
//        listOfRequestedConnections.add(directFlights);
//
//        for (Flight flight : stopOverFlights) {
//            List<Flight> stopOverFlightsLoop = new ArrayList<>();
//            stopOverFlightsLoop.add(flight);
//            allFlightsToChosenArrivalAirport.stream()
//                    .filter(s -> flight.getArrivalAirport().equals(s.getDepartureAirport()))
//                    .forEachOrdered(stopOverFlightsLoop::add);
//            listOfRequestedConnections.add(stopOverFlightsLoop);
//        }

        return listOfRequestedConnections;
    }

}
