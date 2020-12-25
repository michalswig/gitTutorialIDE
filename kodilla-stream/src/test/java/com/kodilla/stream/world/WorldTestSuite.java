package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World earth = new World();
        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Australia");

        final BigDecimal china = new BigDecimal("1439858499");
        final BigDecimal nKorea = new BigDecimal("23000000");
        final BigDecimal sKorea = new BigDecimal("51780579");
        final BigDecimal poland = new BigDecimal("38433000");
        final BigDecimal czech = new BigDecimal("10711014");
        final BigDecimal germany = new BigDecimal("83811407");
        final BigDecimal egypt = new BigDecimal("102334404");
        final BigDecimal libya = new BigDecimal("43921746");
        final BigDecimal testPeopleSum = BigDecimal.ZERO
                .add(china).add(nKorea).add(sKorea)
                .add(poland).add(czech).add(germany)
                .add(egypt).add(libya);

        asia.addCountry("China", china);
        asia.addCountry("North Korea", nKorea);
        asia.addCountry("South Korea", sKorea);
        europe.addCountry("Poland", poland);
        europe.addCountry("Czech Republic", czech);
        europe.addCountry("Germany", germany);
        africa.addCountry("Egypt", egypt);
        africa.addCountry("Algeria", libya);
        earth.addContinent(asia);
        earth.addContinent(europe);
        earth.addContinent(africa);

        //When
        BigDecimal totalPeople = earth.getContinentList().stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity).reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        Assert.assertEquals(testPeopleSum, totalPeople);
    }
}