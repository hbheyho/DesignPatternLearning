package com.hb.design.pattern.structural.decorator.V2;

/**
 * @Author: HB
 * @Description:
 * @CreateDate: 13:29 2020/2/4
 */

public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "加一个香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 3;
    }
    
}
