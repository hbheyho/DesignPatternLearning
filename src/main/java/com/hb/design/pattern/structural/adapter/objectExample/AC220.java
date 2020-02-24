package com.hb.design.pattern.structural.adapter.objectExample;

/**
 * @Author: HB
 * @Description: 220v交流电类 - 被适配者
 * @CreateDate: 19:53 2020/2/6
 */

public class AC220 {
    public int outputAC220V(){
        int output = 200;
        System.out.println("输出220v交流电");
        return output;
    }
}
