package com.moogflow.factory;

/**
 * 工厂方法模式: 对象的实例化推迟到子类中
 */

public class FactoryMethodDemo {
    public static void main(String[] args) {
        Factory tf = new TomFactory();
        tf.CreateProduct();

        JreeyFactory jf = new JreeyFactory();
        jf.CreateProduct();
    }
}

/**
 * 抽象工厂
 * 可以是抽象类 或者是接口:不再负责具体产品的生产,只是定义一些规范,具体的生产任务由子类或者实现类去完成
 */
abstract class Factory {
    abstract Product CreateProduct();

}


/**
 * 具体工厂
 * 汤姆猫工厂
 */
class JreeyFactory extends Factory {

    @Override
    Product CreateProduct() {
        System.out.println(" Jreey 工厂在创建杰瑞");
        return new Jerry();
    }
}

/**
 * 具体工厂
 * 汤姆猫工厂
 */
class TomFactory extends Factory {

    @Override
    Product CreateProduct() {
        System.out.println(" Tom 工厂在创建汤姆");
        return new Tom();
    }
}


/**
 * 抽象产品类
 */
abstract class Product {

}

/**
 * 具体产品类
 * 汤姆
 */
class Tom extends Product {

}

/**
 * 伦敦披萨
 * 杰瑞
 */
class Jerry extends Product {

}

/**
 * 大狗
 */

class BigDog extends Product {

}

/**
 * 女主人
 */

class Woman extends Product {

}