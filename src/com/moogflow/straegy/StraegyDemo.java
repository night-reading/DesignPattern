package com.moogflow.straegy;


/**
 * 策略模式: 也叫政策模式 是指定义一组算法,将每个算法封装起来,并且使他们之间可以互换
 * <p>
 * <p>
 * 刘备娶娇妻,凭的是锦囊,苦的是赵云 案例
 * <p>
 * 三个妙计实现同一个接口,赵云只需要执行接口的任务就行了...
 */

public class StraegyDemo {
    public static void main(String[] args) {


        // 吾乃石家庄赵子龙,前来执行妙计救我家主公于水火之中..

        // 去执行孙夫人断后
        SunFuRen sunFuRen = new SunFuRen();

        Context context = new Context(sunFuRen);
        context.plan();

    }
}

/**
 * 有了妙计,得有锦囊去承装
 */

class Context implements Strategy{

    // 那个妙计  引入妙计
    private Strategy strategy = null;

    // 构造函数
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void plan() {
        this.strategy.plan();
    }
}

/**
 * *
 * 妙计接口
 */


interface Strategy {
    void plan();
}

/**
 * 妙计一:找乔国老帮忙
 */

class QiaoGuoLao implements Strategy {

    @Override
    public void plan() {
        System.out.println("把刘备娶亲的事情搞得东吴人尽皆知...");
    }
}

/**
 * 妙计二:找吴国太放行
 */

class WuGuoTai implements Strategy {

    @Override
    public void plan() {
        System.out.println("曹操大军压境...");
    }
}

/**
 * 妙计三:孙夫人断后
 */

class SunFuRen implements Strategy {

    @Override
    public void plan() {
        System.out.println("孙夫人放行...");
    }
}