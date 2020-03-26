package com.moogflow.proxy.explame;

public class Lianjia implements Subject {

    // 引入 主题
    private Subject subject;

    public Lianjia() {
        this.subject = new Homeowners();
    }

    public Lianjia(Subject subject) {
        this.subject = subject;
    }


    // 重写
    public void rentHourse(int fee) {

        //
        if (fee > 100) {
            //中介扣除 30快
            fee = fee - 30;
            System.out.println("中介扣除 服务费 30.");
            subject.rentHourse(fee);
        } else {
            System.out.println("价格太低..");
        }

    }
}
