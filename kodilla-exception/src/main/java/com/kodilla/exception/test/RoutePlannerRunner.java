package com.kodilla.exception.test;

public class RoutePlannerRunner {

    public static void main(String[] args) {

        //Flights that are now in Schedule
        Flight f303 = new Flight("KRK", "WAW", true);
        Flight w456 = new Flight("JFK", "SFO", false);
        Flight a476 = new Flight("EDI", "DUB", true);
        Flight e576 = new Flight("WAW", "TER", true);
        Flight z231 = new Flight("LAX", "CDG", null);
        Flight e456 = new Flight("KIK", "CUK", null);

        RoutePlanner routePlanner = new RoutePlanner();

        try {
//            routePlanner.findFlight(a476);
//            routePlanner.findFlight(e456);
            routePlanner.findFlight(w456);
        } catch(RouteNotFoundException e) {
            System.out.println("No connection with the airport " + e);
        } finally {
            System.out.println("You can always try different connection If you like!");
        }



    }

}
