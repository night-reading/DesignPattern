package com.moogflow.decorator.example.order;

public class OrderServiceDecoratorImpl  extends OrderServiceDecorator  {

    // 构造函数
    public  OrderServiceDecoratorImpl (OrderService orderService){
            super(orderService);
    }



    // 装饰函数
    void selfMethod(){
        System.out.println("装饰ing...");
    }

    //重写父类的下单函数
    public boolean addOrder() {

        selfMethod();
        // todo something..
        return super.addOrder();
    }
}
