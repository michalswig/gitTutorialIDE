package com.kodilla.good.patterns.food2door.logic;

import com.kodilla.good.patterns.food2door.data.OrderDto;
import com.kodilla.good.patterns.food2door.data.OrderRequest;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public InformationService getInformationService() {
        return informationService;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public OrderRepository getOrderRepository() {
        return orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest){
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity(), orderRequest.getShop());
        if(isOrdered){
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity(), orderRequest.getShop());
            return new OrderDto(orderRequest.getUser(), true);
        } else{
            return new OrderDto(orderRequest.getUser(), false);
        }
    }


}
