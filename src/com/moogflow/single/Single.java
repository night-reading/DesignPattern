package com.moogflow.single;

public class Single {
    public static void main(String[] args) {
        SingleEager se = SingleEager.getSingle();
        SingleLazy sl = SingleLazy.getSingle();

    }
}

/**
 * 懒汉式 单例模式 线程不安全 用 synchronized 同步代码块方式加锁
 */
class SingleLazy {
    private SingleLazy() {
    }

    private static SingleLazy singleLazy = null;

    public synchronized static  SingleLazy getSingle() {
        if (singleLazy == null) {
            singleLazy = new SingleLazy();
            return singleLazy;
        }
        return singleLazy;
    }
}

/**
 * 饿汉式 单例模式 线程安全
 */
class SingleEager {
    private SingleEager() {
    }

    private static SingleEager single = new SingleEager();

    public static SingleEager getSingle() {
        return single;
    }

}