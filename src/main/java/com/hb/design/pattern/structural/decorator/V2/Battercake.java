package com.hb.design.pattern.structural.decorator.V2;

/**
 * @Author: HB
 * @Description: 煎饼类 - 对抽象煎饼类的实现，要被装饰的类，可以有多个
 * @CreateDate: 13:21 2020/2/4
 */

public class Battercake extends ABattercake {
    @Override
    public String getDesc() {
        return "煎饼";
    }

    @Override
    public int cost() {
        return 8;
    }
}
