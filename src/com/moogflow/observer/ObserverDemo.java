package com.moogflow.observer;


import java.util.Vector;

/**
 * 观察者模式  也叫做 发布订阅模式
 * <p>
 * 定义对象之间的依赖关系，使得一个对象发生改变，所有依赖它的对象都会得到通知 并且自动更新
 * <p>
 * 气象局 提供气象信息到自己官方网站 或者 给出第三方开放接口
 * <p>
 * 当气象局检测到新的气象信息 能够及时通知到第三方
 * <p>
 * 气象局网站维护了 新浪 网易 腾讯 搜狐等门户网站对象  当气象局检测到气象信息有变动。可以通知到这些维护的门户网站对象
 * <p>
 * <p>
 * 被观察者 气象站 subject
 * 观察者  门户网站 observer  他们依赖被观察者气象站
 * 具体的观察者
 * 具体的被观察者
 */
public class ObserverDemo {
    public static void main(String[] args) {


        //被观察者
        Subject subject = new ConcreteSubject();


        ConcreteObserver observer = new ConcreteObserver();
        observer.setName("lisi");


        ConcreteObserver observer2 = new ConcreteObserver();
        observer2.setName("zhangsan");


        subject.addObserver(observer);
        subject.addObserver(observer2);


        ((ConcreteSubject) subject).doSomething();

    }
}

interface Observer {
    void update(String info);
}

class ConcreteObserver implements Observer {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void update(String info) {
        System.out.println(this.name + ":具体的观察者接受到的数据：" + info);
    }
}


// 被观察者
class Subject {
    private Vector<Observer> observers = new Vector<>();


    // 添加一个观察者
    public boolean addObserver(Observer observer) {

        return observers.add(observer);
    }

    // 删除一个观察者
    public boolean delObserver(Observer observer) {

        return observers.remove(observer);
    }

    // 通知
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update("气象信息变化了..");
        }
    }

}

// 具体的被观察者
class ConcreteSubject extends Subject {


    // 具体的业务
    public void doSomething() {

        System.out.println("具体被观察者...");
        super.notifyObservers();
    }
}