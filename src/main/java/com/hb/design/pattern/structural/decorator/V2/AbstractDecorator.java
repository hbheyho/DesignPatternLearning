package com.hb.design.pattern.structural.decorator.V2;

/**
 * @Author: HB
 * @Description: 抽象装饰者
 * @CreateDate: 13:25 2020/2/4
 */

public class AbstractDecorator extends ABattercake  {
    // 与Battercake 需要被装饰的实体类建立联系
    ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    public String getDesc() {
        return aBattercake.getDesc();
    }

    @Override
    public int cost() {
        return aBattercake.cost();
    }
}
