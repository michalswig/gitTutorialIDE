package com.kodilla.testing.weather.stub;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public Double calculateArithmeticAverageTemperature() {
        Map<String, Double> resultMap = new HashMap<>();
        Double tempTemp = 0.0;
        Double avgTemp = 0.0;
        for(Map.Entry<String, Double> entry: temperatures.getTemperatures().entrySet()) {
            tempTemp += entry.getValue();
        }
        avgTemp = tempTemp/temperatures.getTemperatures().entrySet().size();
        return avgTemp;
    }

    public static double median(Double[] table)
    {
        double median=0;
        double avg = 0.0;
        Arrays.sort(table);

        if (table.length % 2 == 0 )
        {
            avg = table[table.length/2] + table[(table.length/2)-1];
            median = avg/2.0;
        }
        else { median = table[table.length/2];
        }
        return median;
    }

    public Double calculateMedianTemperature() {
        Map<String, Double> resultMap = new HashMap<>();
        Double[] tableValues = new Double[resultMap.size()];
        for(Map.Entry<String, Double> entry: temperatures.getTemperatures().entrySet()) {
            //tableValues[entry.getValue()];
        }
        return median(tableValues);
    }
}