package com.kodilla.good.patterns.airline2;

import java.util.Arrays;
import java.util.List;

public class FlightRequestRetriever {
    public static List<Flight> retrieve() {
        Flight a1 = new Flight("Poznan", "Warszawa");
        Flight a2 = new Flight("Poznan", "Warszawa");
        Flight a3 = new Flight("Warszawa", "Krakow");
        Flight a4 = new Flight("Warszawa", "Gdansk");
        Flight a5 = new Flight("Gdansk", "Warszawa");
        Flight a6 = new Flight("Szczecin", "Gdansk");
        Flight a7 = new Flight("Poznan", "Gdansk");
        Flight a8 = new Flight("Poznan", "Gdansk");

        return Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
    }
}
