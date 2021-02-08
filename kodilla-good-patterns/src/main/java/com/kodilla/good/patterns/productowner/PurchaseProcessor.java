package com.kodilla.good.patterns.productowner;

public class PurchaseProcessor {
    private InformationService informationService;
    private PurchaseService purchaseService;
    private PurchaseRepository purchaseRepository;

    public PurchaseProcessor(InformationService informationService, PurchaseService purchaseService, PurchaseRepository purchaseRepository) {
        this.informationService = informationService;
        this.purchaseService = purchaseService;
        this.purchaseRepository = purchaseRepository;
    }

    public PurchaseDto process(PurchaseRequest purchaseRequest) {
        boolean isBought = purchaseService.purchased(purchaseRequest.getUser(),
                purchaseRequest.getItem(), purchaseRequest.getPurchaseTime());
        if (isBought) {
            informationService.inform(purchaseRequest.getUser());
            purchaseRepository.createRental(purchaseRequest.getUser(),
                    purchaseRequest.getItem(), purchaseRequest.getPurchaseTime());
            return new PurchaseDto(purchaseRequest.getUser(), purchaseRequest.getItem(), true);
        } else {
            return new PurchaseDto(purchaseRequest.getUser(), purchaseRequest.getItem(), false);
        }
    }
}
