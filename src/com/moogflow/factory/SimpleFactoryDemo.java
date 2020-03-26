package com.moogflow.factory;

/**
 *  研磨设计模式 简单工厂模式
 */

public class SimpleFactoryDemo {
    public static void main(String[] args) {
        Api api = SimpleFactory.createApi();
        api.operation("Api");
    }
}

class SimpleFactory {
    public static Api createApi() {
        Api api = new A();
        return api;
    }
}

interface Api {
    public void operation(String s);
}

class A implements Api {

    @Override
    public void operation(String s) {
        System.out.println(s + "operation..");
    }
}

