package com.moogflow.proxy.explame;


/**
 * 房屋主人
 */
public class Homeowners implements Subject {
    public void rentHourse(int fee) {
        System.out.println("房屋主人出租房子. 成交价格:" + fee);
    }
}
