package com.hb.design.pattern.creational.prototype.abstractprototype;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  14:11  2020/1/10.
 */
// 也可使用抽象类来实现原型模式（Cloneable接口只是作为标识接口,重写的是Object父类的Clone方法）
public class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
