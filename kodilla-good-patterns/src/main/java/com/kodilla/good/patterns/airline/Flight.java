package com.kodilla.good.patterns.airline;

public class Flight {
    private final Airport depDest;
    private final Airport arrDest;

    public Flight(Airport depDest, Airport arrDest) {
        this.depDest = depDest;
        this.arrDest = arrDest;
    }

    public Flight(Airport depDest, Airport arrDest, Airport stopOver) {
        this.depDest = depDest;
        this.arrDest = arrDest;
    }

    public Airport getDepDest() {
        return depDest;
    }

    public Airport getArrDest() {
        return arrDest;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "depDest=" + depDest +
                ", arrDest=" + arrDest +
                '}';
    }

}
