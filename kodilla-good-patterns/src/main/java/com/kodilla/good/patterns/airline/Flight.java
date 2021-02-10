package com.kodilla.good.patterns.airline;

import java.util.HashSet;
import java.util.Set;

public class Flight {
    private final Airport depDest;
    private final Airport arrDest;
    private final Set<Airport> stopOvers = new HashSet<>();

    public Flight(Airport depDest, Airport arrDest, Set<Airport> stopOvers) {
        this.depDest = depDest;
        this.arrDest = arrDest;
        this.stopOvers.addAll(stopOvers);
    }

    public Flight(Airport depDest, Airport arrDest, Airport stopOver) {
        this.depDest = depDest;
        this.arrDest = arrDest;
        this.stopOvers.add(stopOver);
    }

    public Flight(Airport depDest, Airport arrDest) {
        this.depDest = depDest;
        this.arrDest = arrDest;
    }

    public Airport getDepDest() {
        return depDest;
    }

    public Airport getArrDest() {
        return arrDest;
    }

    public Set<Airport> getStopOverList() {
        return stopOvers;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "depDest=" + depDest +
                ", arrDest=" + arrDest +
                ", stopOver=" + stopOvers +
                '}';
    }

}
