import com.kodilla.good.patterns.airline2.FlightService;
import com.kodilla.good.patterns.challenges.MovieStore;
import com.kodilla.good.patterns.food2door.data.OrderRequest;
import com.kodilla.good.patterns.food2door.logic.OrderProcessor;
import com.kodilla.good.patterns.food2door.logic.OrderRequestRetriever;
import com.kodilla.good.patterns.food2door.logic.interfaces.HealthySugarShopRepository;
import com.kodilla.good.patterns.food2door.logic.interfaces.HealthySugarShopService;
import com.kodilla.good.patterns.productowner.*;

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

        OrderProcessor orderProcessor = new OrderProcessor(new com.kodilla.good.patterns.food2door.logic.interfaces.MailService(), new HealthySugarShopService(), new HealthySugarShopRepository());
        orderProcessor.process(orderRequest);

        System.out.println("Task no 4");

        FlightService flightService = new FlightService();

        System.out.println("-----------");
        System.out.println("All from Poznan:");
        flightService.allFlightsFrom("Poznan").stream().forEach(System.out::println);
        System.out.println();

        System.out.println("-----------");
        System.out.println("All to Gdansk:");
        flightService.allFlightsTo("Gdansk").stream().forEach(System.out::println);
        System.out.println();

        System.out.println("-----------");
        System.out.println("from Poznan to Gdansk");
        flightService.stopOverFlights("Poznan", "Gdansk").stream().forEach(System.out::println);
    }

}

