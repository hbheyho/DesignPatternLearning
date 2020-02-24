package com.hb.design.principle.dependenceinversion;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  16:13  2020/1/6.
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习前端课程中...");
    }
}
