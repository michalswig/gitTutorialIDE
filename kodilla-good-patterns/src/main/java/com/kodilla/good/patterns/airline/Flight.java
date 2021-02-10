package com.kodilla.good.patterns.airline;

import java.util.List;

public class Flight {
    private final Airport depDest;
    private final Airport arrDest;
    private final List<Airport> stopOver;

    public Flight(Airport depDest, Airport arrDest, List<Airport> stopOver) {
        this.depDest = depDest;
        this.arrDest = arrDest;
        this.stopOver = stopOver;
    }

    public Airport getDepDest() {
        return depDest;
    }

    public Airport getArrDest() {
        return arrDest;
    }

    public List<Airport> getStopOverList() {
        return stopOver;
    }

    public boolean isStopOverValid(Airport airport){
        return stopOver.contains(airport);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "depDest=" + depDest +
                ", arrDest=" + arrDest +
                ", stopOver=" + stopOver +
                '}';
    }

}
