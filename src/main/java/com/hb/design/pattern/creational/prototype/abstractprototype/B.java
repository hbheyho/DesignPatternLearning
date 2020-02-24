package com.hb.design.pattern.creational.prototype.abstractprototype;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  14:12  2020/1/10.
 */
// B继承于A, 也拥有了克隆能力
public class B extends A {

    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        B b2 = (B)b.clone();

        System.out.println(b);
        System.out.println(b2);
    }
}
