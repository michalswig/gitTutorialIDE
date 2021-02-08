import com.kodilla.good.patterns.challenges.MovieStore;
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


    }
}
