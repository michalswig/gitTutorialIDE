package com.kodilla.good.patterns.productowner;

import java.time.LocalDateTime;

public class PurchaseProcessor {
    private InformationService informationService;
    private  PurchaseService purchaseService;
    private PurchaseRepository purchaseRepository;

    public PurchaseProcessor(InformationService informationService, PurchaseService purchaseService, PurchaseRepository purchaseRepository) {
        this.informationService = informationService;
        this.purchaseService = purchaseService;
        this.purchaseRepository = purchaseRepository;
    }

    public PurchaseDto process(User user, Item item, LocalDateTime purchaseTime){
        boolean isBought = purchaseService.purchased(user, item, purchaseTime);
    }




}
