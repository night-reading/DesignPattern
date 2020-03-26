package com.moogflow.decorator.example.order;

public class Order {
    public static void main(String[] args) {
        OrderService service = new OrderServiceImpl();
        OrderServiceDecoratorImpl decorator = new OrderServiceDecoratorImpl(service);
        decorator.addOrder();
    }
}
