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

        List<Flight> allFlightsToChosenArrivalAirport = allFlightsTo(arrivalAirport);

        List<List<Flight>> directFlights = allFlightsFromChosenDepartureAirport.stream()
                .filter(s -> s.getArrivalAirport().equals(arrivalAirport))
                .map(el -> List.of(el))
                .collect(Collectors.toList());

        List<List<Flight>> listOfRequestedConnections = new ArrayList<>();
        listOfRequestedConnections.addAll(directFlights);

        for (Flight flight : allFlightsFromChosenDepartureAirport) {
            for (Flight flight1 : allFlightsToChosenArrivalAirport) {
                if (flight.getArrivalAirport().equals(flight1.getDepartureAirport())) {
                    listOfRequestedConnections.add(List.of(flight, flight1));
                }
            }
        }
        return listOfRequestedConnections;
    }
}
