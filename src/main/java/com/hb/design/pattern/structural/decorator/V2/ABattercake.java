package com.hb.design.pattern.structural.decorator.V2;

/**
 * @Author: HB
 * @Description: 煎饼抽象类 - 便于扩展, 以后可能会有不同种类的煎饼
 * @CreateDate: 13:19 2020/2/4
 */

public abstract class ABattercake {
    public abstract String getDesc();
    public abstract int cost();
}
