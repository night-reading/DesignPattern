package com.moogflow.template;

/**
 * 模板模式
 */

public class TemplateDemo {
    public static void main(String[] args) {


        ConcreteClass1 class1 = new ConcreteClass1();
        class1.templateMethod();
    }
}

/**
 * 悍马模型
 */

abstract class AbsClass {

    // 基本方法1
    abstract void doSomething1();

    // 基本方法2
    abstract void doSomething2();

    void templateMethod() {
        // 调用基本方法
        this.doSomething1();
        this.doSomething2();

        //模板方法的操作
        System.out.println("模板方法的操作....");

    }
}

/**
 * 悍马模型 1
 */

class ConcreteClass1 extends AbsClass {
    @Override
    void doSomething1() {
        System.out.println("悍马模型 1 doSomething1... ");
    }


    @Override
    void doSomething2() {
        System.out.println("悍马模型 1 doSomething2... ");
    }
}

/**
 * 悍马模型 2
 */

class ConcreteClass2 extends AbsClass {
    @Override
    void doSomething1() {
        System.out.println("悍马模型 2 doSomething1... ");
    }


    @Override
    void doSomething2() {
        System.out.println("悍马模型 2 doSomething2... ");
    }
}