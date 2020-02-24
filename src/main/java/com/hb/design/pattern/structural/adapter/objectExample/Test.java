package com.hb.design.pattern.structural.adapter.objectExample;

/**
 * @Author: HB
 * @Description: 测试类
 * @CreateDate: 20:02 2020/2/6
 */

public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.output5v();
    }
}
