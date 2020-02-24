package com.hb.design.pattern.behavioral.mediator.mediatorextend;

/**
 * @Author: HB
 * @Description: 同事类 - 与中介者关联
 * @CreateDate: 11:22 2020/2/22
 */

public abstract class Colleague {
    protected Mediator mediator;

    // 设置对象的中介者
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();
    public abstract void send();
}
