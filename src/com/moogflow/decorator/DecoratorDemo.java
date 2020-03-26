package com.moogflow.decorator;


/**
 * 装饰者模式: 动态的给一个对象添加一些额外的职责
 * <p>
 * 装饰者:
 * 被装饰者:
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Component componment = new ConcreteComponment();

        componment = new ConcreteDecortorA(componment);
        componment = new ConcreteDecortorB(componment);


        componment.operate();
    }
}

// 被装饰者的抽象 可以是抽象类 可以是接口
abstract class Component {

    //被装饰者抽象的定义
    abstract void operate();

}

// 被装饰者
class ConcreteComponment extends Component {


    //被装饰者的具体实现
    void operate() {
        System.out.println("被装饰者具体 operate...");
    }
}


// 装饰者的抽象

abstract class Decorator extends Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    // 委托给装饰者去执行任务
    void operate() {
        this.component.operate();
    }
}

//具体的装饰者A
class ConcreteDecortorA extends Decorator {
    public ConcreteDecortorA(Component component) {
        super(component);
    }

    //定义自己的修饰方法
    void selfMethod() {
        System.out.println("A self...");
    }


    void operate() {
        selfMethod();
        super.operate();
    }

}

//具体的装饰者B
class ConcreteDecortorB extends Decorator {
    public ConcreteDecortorB(Component component) {
        super(component);
    }


    //定义自己的修饰方法
    void selfMethod() {
        System.out.println("B self...");
    }


    void operate() {
        selfMethod();
        super.operate();
    }
}