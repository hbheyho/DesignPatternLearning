package com.hb.design.pattern.behavioral.mediator.mediatorextend;

/**
 * @Author: HB
 * @Description: 具体同时类2
 * @CreateDate: 11:32 2020/2/22
 */

public class ConcreteColleague2 extends Colleague{
    @Override
    public void receive() {
        System.out.println("同事2收到请求");
    }

    @Override
    public void send() {
        System.out.println("同事2发出请求");
        mediator.relay(this);
    }
}
