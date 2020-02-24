package com.hb.design.pattern.structural.decorator.V1;

/**
 * @Author: HB
 * @Description: BattercakeWithEggAndSausage 类
 * @CreateDate: 13:08 2020/2/4
 */

public class BattercakeWithEggAndSausage  extends BattercakeWithEgg{
    @Override
    public String getDesc() {
        return super.getDesc() + "加一个香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 3;
    }
}
