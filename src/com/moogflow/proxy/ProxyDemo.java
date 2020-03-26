package com.moogflow.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}

/**
 * 抽象主题角色
 * 可以是接口 或者是 抽象类
 * 用于定义最普通的业务函数 无特殊要求
 */
interface Subject {

    // 普通业务逻辑
    void request();
}

/**
 * 被代理角色 被代理类 被委托类
 * 具体业务的实现者
 */

class RealSubject implements Subject {
    public void request() {
        System.out.println("I'm RealSubject. I'm working...");
    }
}


/**
 * 代理角色 代理类 委托类
 * 负责调用 被代理类的业务,并且做预处理 和 善后任务
 */

class Proxy implements Subject {

    private Subject subject = null;

    public Proxy() {
        this.subject = new RealSubject();
    }

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    //善后
    private void after() {
        System.out.println("after...");
    }


    //预处理
    private void before() {
        System.out.println("before...");
    }

    public void request() {
        before();
        //调用被委托者
        this.subject.request();
        after();


    }
}
