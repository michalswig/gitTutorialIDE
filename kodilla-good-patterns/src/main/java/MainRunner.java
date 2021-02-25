import com.kodilla.good.patterns.airline2.Flight;
import com.kodilla.good.patterns.airline2.FlightService;

import java.util.List;

public class MainRunner {
    public static void main(String[] args) {
//        System.out.println("Task no 1");
//        MovieStore movieStore = new MovieStore();
//        System.out.println(movieStore);
//
//        System.out.println("Task no 2");
//        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();
//        PurchaseRequest purchaseRequest = purchaseRequestRetriever.retrieve();
//
//        PurchaseProcessor purchaseProcessor = new PurchaseProcessor(
//                new MailService(), new ItemPurchaseService(), new ItemPurchaseRepository()
//        );
//        purchaseProcessor.process(purchaseRequest);
//
//        System.out.println("Task no 3");
//        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
//        OrderRequest orderRequest = orderRequestRetriever.retrieve();
//
//        OrderProcessor orderProcessor = new OrderProcessor(new com.kodilla.good.patterns.food2door.logic.interfaces.MailService(), new HealthySugarShopService(), new HealthySugarShopRepository());
//        orderProcessor.process(orderRequest);

//        System.out.println("Task no 4");
//        Airport airportWaw = new Airport("Warszawa", "WAW");
//        Airport airportWmi = new Airport("Modlin", "WMI");
//        Airport airportWro = new Airport("Wroclaw", "WRO");
//        Airport airportPoz = new Airport("Poznan", "POZ");
//        Airport airportKrk = new Airport("Krakow", "KRK");
//        Airport airportKtw = new Airport("Katowice", "KTW");
//
//        FlightServiceFinder quickService = new FlightServiceFinder();
//        Airport stopOverPlace = new Airport("Warszawa", "WAW");
//
//        quickService.addFlight(airportWaw, airportKrk);
//        quickService.addFlight(airportKrk, airportWaw);
//        quickService.addFlight(airportWaw, airportWro);
//        quickService.addFlight(airportWro, airportWmi);
//
//
//        quickService.findDeparture(airportWaw);
//        System.out.println();
//        quickService.findArrival(airportKrk);
//        System.out.println();
//        quickService.findDepFlightViaStopOver(airportPoz, airportKrk, stopOverPlace);

//        System.out.println("Task no 4 second attempt");
        FlightService flightService = new FlightService();
//        System.out.println("from Poznan");
//        List<Flight> flightsFromList = flightService.allFlightsFrom("Poznan");
//        System.out.println(flightsFromList);
//        System.out.println("to Gdansk");
//        List<Flight> flightsToList = flightService.allFlightsTo("Gdansk");
//        System.out.println(flightsToList);
        System.out.println("from Poznan to Gdansk");
        List<List<Flight>> stopOverFlights = flightService.stopOverFlights("Poznan", "Gdansk");
        System.out.println(stopOverFlights);
    }
}
