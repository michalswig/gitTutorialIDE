package com.kodilla.good.patterns.airline;

public class Airport {

    private final String name;
    private final String iataCode;

    public Airport(String name, String iataCode) {
        this.name = name;
        this.iataCode = iataCode;
    }

    public String getName() {
        return name;
    }

    public String getIataCode() {
        return iataCode;
    }


    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\'' +
                ", iataCode='" + iataCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;

        Airport airport = (Airport) o;

        return getIataCode() != null ? getIataCode().equals(airport.getIataCode()) : airport.getIataCode() == null;
    }

    @Override
    public int hashCode() {
        return getIataCode() != null ? getIataCode().hashCode() : 0;
    }
}
