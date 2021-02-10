import com.kodilla.good.patterns.airline.Airport;
import com.kodilla.good.patterns.airline.FlightServiceFinder;
import com.kodilla.good.patterns.challenges.MovieStore;
import com.kodilla.good.patterns.food2door.data.OrderRequest;
import com.kodilla.good.patterns.food2door.logic.HealthySugarShopRepository;
import com.kodilla.good.patterns.food2door.logic.HealthySugarShopService;
import com.kodilla.good.patterns.food2door.logic.OrderProcessor;
import com.kodilla.good.patterns.food2door.logic.OrderRequestRetriever;
import com.kodilla.good.patterns.productowner.*;

import java.util.ArrayList;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {
        System.out.println("Task no 1");
        MovieStore movieStore = new MovieStore();
        System.out.println(movieStore);

        System.out.println("Task no 2");
        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();
        PurchaseRequest purchaseRequest = purchaseRequestRetriever.retrieve();

        PurchaseProcessor purchaseProcessor = new PurchaseProcessor(
                new MailService(), new ItemPurchaseService(), new ItemPurchaseRepository()
        );
        purchaseProcessor.process(purchaseRequest);

        System.out.println("Task no 3");
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new com.kodilla.good.patterns.food2door.logic.MailService(), new HealthySugarShopService(), new HealthySugarShopRepository());
        orderProcessor.process(orderRequest);

        System.out.println("Task no 4");
        Airport airportWaw = new Airport("Warszawa", "WAW");
        Airport airportWmi = new Airport("Modlin", "WMI");
        Airport airportWro = new Airport("Wroclaw", "WRO");
        Airport airportPoz = new Airport("Poznan", "POZ");
        Airport airportKrk = new Airport("Krakow", "KRK");
        Airport airportKtw = new Airport("Katowice", "KTW");

        FlightServiceFinder quickService = new FlightServiceFinder();
        List<Airport> stopOverPlace = new ArrayList<>();
        stopOverPlace.add(airportWaw);

        quickService.addFlight(airportWaw, airportKrk, null);
        quickService.addFlight(airportKrk, airportWaw, null);
        quickService.addFlight(airportWaw, airportWro, null);
        quickService.addFlight(airportWro, airportWaw, null);
        quickService.addFlight(airportWaw, airportKtw, stopOverPlace);
        quickService.addFlight(airportKtw, airportWaw, stopOverPlace);
        quickService.addFlight(airportWaw, airportPoz, stopOverPlace);
        quickService.addFlight(airportPoz, airportWaw, stopOverPlace);

        quickService.findDeparture(airportWaw);
        System.out.println();
        quickService.findArrival(airportKrk);
        System.out.println();
        quickService.findDepFlightViaStopOver(airportPoz, airportWaw, stopOverPlace);


    }
}
