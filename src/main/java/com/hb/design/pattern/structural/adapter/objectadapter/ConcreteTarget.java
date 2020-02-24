package com.hb.design.pattern.structural.adapter.objectadapter;

/**
 * @Author: HB
 * @Description: Target接口实现类
 * @CreateDate: 17:34 2020/2/6
 */

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("ConcreteTarget目标方法");
    }
}
