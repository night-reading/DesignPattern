package com.moogflow.decorator.example.order;

public class OrderServiceImpl implements  OrderService {
    public  boolean addOrder(){
        System.out.println("下单..");
        return true;
    }
}
