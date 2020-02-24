package com.hb.design.pattern.behavioral.mediator.mediatorextend;

/**
 * @Author: HB
 * @Description: 具体同事类
 * @CreateDate: 11:30 2020/2/22
 */

public class ConcreteColleague3 extends Colleague {
    @Override
    public void receive() {
        System.out.println("同事3收到请求");
    }

    @Override
    public void send() {
        System.out.println("同事3发出请求");
        mediator.relay(this);
    }
}
