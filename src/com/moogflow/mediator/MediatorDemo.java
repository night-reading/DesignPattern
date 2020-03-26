package com.moogflow.mediator;


/**
 * 中介者模式
 * 定义:
 * 用一个 中介对象  封装 一系列的对象交互,中介者使各对象不需要明显的相互引用.
 * 从而使其耦合松散,并且可以独立的改变他们之间的交互.
 */
public class MediatorDemo {
    public static void main(String[] args) {

    }
}


/**
 * 抽象中介角色
 * 定义统一的接口,用于各同事角色之间的通信
 */
abstract class Mediator {
}


/**
 * 具体的中介角色
 * 协调各同事之间的行为
 */
class ConcreteMediator {

}

/**
 * 同事角色
 * 每一个同事角色都指着中介角色的存在,想要与其他同事角色通信时,必须经过中介角色的协作.
 * <p>
 * 每一个同事角色都有两种行为:
 * 1. self-method: 自发行为: 与其他中介或同事类没有相互调用的依赖.
 * 2. dep-method: 依赖方法:与其他中介或同事类有相互调用的依赖
 */
abstract class Colleague {

}

/**
 具体同事类
 */
 class ConcreteColleague1 extends Colleague {

}

/**
 具体同事类
 */
class ConcreteColleague2 extends Colleague{

}
/**
 具体同事类
 */
class ConcreteColleague3 extends Colleague{

}
/**
 具体同事类
 */
class ConcreteColleague4 extends Colleague{

}