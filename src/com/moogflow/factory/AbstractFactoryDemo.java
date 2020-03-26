package com.moogflow.factory;


/**
 *  抽象工厂
 *
 *  工厂方法模式:是只针对于一个产品系列的
 *  抽象工厂模式:是针对于多个产品系列的
 */
public class AbstractFactoryDemo{
    public static void main(String[] args) {

    }
}


/**
 * 抽象工厂
 */

interface AbsFatvoty{

    // 创建 产品A CPU 的对象


    //创建 产品B  主板 的对象
}



/**
 * 具体共厂
 *  生产 技嘉的主板 + inter的cup
 *
 */

class ConcreteFactory1 implements AbsFatvoty{

}
/**
 * 具体共厂
 *  生产 微星的主板 + adm的cup
 *
 */

class ConcreteFactory2 implements AbsFatvoty{

}


/**
 *  抽象产品
 */
abstract class ProductInterCPU{

}
/**
 *  抽象产品
 */
abstract class ProductAMDCPU{

}
/**
 *  抽象产品
 */
abstract class ProductGAMainbroad{

}
/**
 *  抽象产品
 */
abstract class ProductMSMainbroad{

}
