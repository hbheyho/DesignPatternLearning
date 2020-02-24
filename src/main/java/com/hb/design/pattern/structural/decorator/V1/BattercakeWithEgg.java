package com.hb.design.pattern.structural.decorator.V1;

/**
 * @Author: HB
 * @Description: BattercakeWithEgg 类
 * @CreateDate: 13:00 2020/2/4
 */

public class BattercakeWithEgg extends Battercake{
    @Override
    public String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
