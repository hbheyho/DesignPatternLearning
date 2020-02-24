package com.hb.design.principle.dependenceinversion;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  16:12  2020/1/6.
 */
public class JavaCouse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习Java课程中...");
    }
}
