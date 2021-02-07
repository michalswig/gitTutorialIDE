package com.kodilla.good.patterns.productowner;

public class PurchaseProcessor {
    private InformationService informationService;
    private  PurchaseService purchaseService;
    private PurchaseRepository purchaseRepository;

    public PurchaseProcessor(InformationService informationService, PurchaseService purchaseService, PurchaseRepository purchaseRepository) {
        this.informationService = informationService;
        this.purchaseService = purchaseService;
        this.purchaseRepository = purchaseRepository;
    }


}
