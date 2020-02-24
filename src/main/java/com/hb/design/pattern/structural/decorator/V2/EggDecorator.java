package com.hb.design.pattern.structural.decorator.V2;

/**
 * @Author: HB
 * @Description: 鸡蛋实体装饰者类
 * @CreateDate: 13:27 2020/2/4
 */

public class EggDecorator  extends AbstractDecorator{
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
