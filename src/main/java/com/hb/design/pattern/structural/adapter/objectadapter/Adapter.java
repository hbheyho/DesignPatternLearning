package com.hb.design.pattern.structural.adapter.objectadapter;

/**
 * @Author: HB
 * @Description: 适配类 - 来实现被适配者(adaptee) 到 目标类(Target)的适配
 *               实现方式: 对象适配器
 * @CreateDate: 18:44 2020/2/6
 */

public class Adapter implements Target{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        // .. 可以增加其他复杂处理逻辑
        adaptee.adapteeRequest();
    }
}
