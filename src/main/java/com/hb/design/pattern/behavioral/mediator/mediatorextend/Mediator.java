package com.hb.design.pattern.behavioral.mediator.mediatorextend;

/**
 * @Author: HB
 * @Description: 抽象中介者类
 * @CreateDate: 11:20 2020/2/22
 */

public abstract class Mediator {
    public abstract void register(Colleague colleague);
    public abstract void relay(Colleague cl);
}
