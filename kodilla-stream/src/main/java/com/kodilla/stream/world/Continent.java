package com.kodilla.stream.world;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> countryList = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(String countryName, BigDecimal peopleQuantity) {
        Country newCountry = new Country(countryName, peopleQuantity);
        countryList.add(newCountry);
    }

    public List<Country> getCountryList() {
        return countryList;
    }
}