package com.hb.design.pattern.structural.adapter.objectExample;

/**
 * @Author: HB
 * @Description: 适配器类 - 把一个类的接口(AC220v)变换成客户端所期待的另一种接口(DC5v)，
 * 从而使原本接口不匹配而无法一起工作的两个类能够在一起工作。
 * @CreateDate: 19:57 2020/2/6
 */

public class PowerAdapter implements DC5 {
    private AC220 ac220 = new AC220();
    @Override
    public int output5v() {
        int adapterInput = ac220.outputAC220V();

        // 变压器
        int adapterOutput = adapterInput/44;
        System.out.println("使用PowerAdapter输入VC:" + adapterInput + "V" + "输出DC:" + adapterOutput + "V");

        return adapterOutput;
    }
}
