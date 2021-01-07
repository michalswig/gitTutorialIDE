package com.kodilla.exception.test;

public class Flight {
    final public String departureAirport;
    final public String arrivalAirport;
    final public Boolean arrivalAirportIfOpen;

    public Flight(String departureAirport, String arrivalAirport, Boolean arrivalAirportIfOpen) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.arrivalAirportIfOpen = arrivalAirportIfOpen;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public Boolean getArrivalAirportIfOpen() {
        return arrivalAirportIfOpen;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                '}';
    }

}
