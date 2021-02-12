package com.kodilla.good.patterns.food2door.logic;

import com.kodilla.good.patterns.food2door.data.OrderDto;
import com.kodilla.good.patterns.food2door.data.OrderRequest;
import com.kodilla.good.patterns.food2door.logic.interfaces.InformationService;
import com.kodilla.good.patterns.food2door.logic.interfaces.OrderRepository;
import com.kodilla.good.patterns.food2door.logic.interfaces.OrderService;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity(), orderRequest.getShop());
        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity(), orderRequest.getShop());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }


}
