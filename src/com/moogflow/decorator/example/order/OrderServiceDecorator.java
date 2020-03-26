package com.moogflow.decorator.example.order;

public abstract class OrderServiceDecorator implements OrderService {

    // 引入了 OrderService
    private OrderService orderService;

    // 构造函数
    public OrderServiceDecorator(OrderService orderService) {
        this.orderService = orderService;
    }

    public boolean addOrder() {
        return orderService.addOrder();
    }
}
