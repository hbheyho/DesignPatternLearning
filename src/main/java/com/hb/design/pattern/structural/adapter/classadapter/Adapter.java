package com.hb.design.pattern.structural.adapter.classadapter;

/**
 * @Author: HB
 * @Description: 适配类 - 来实现被适配者(adaptee) 到 目标类(Target)的适配 - 把adaptee的方法也适配给Target
 *               实现方式: 继承 - 类适配器
 * @CreateDate: 17:36 2020/2/6
 */

public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        // .. 可以增加其他复杂处理逻辑
        super.adapteeRequest();
    }
}
