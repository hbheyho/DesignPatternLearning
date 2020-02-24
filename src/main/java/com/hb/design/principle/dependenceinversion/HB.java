package com.hb.design.principle.dependenceinversion;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  16:01  2020/1/6.
 */
public class HB {

    /* 此时是面向细节编程，高层次模块(应用层)直接依赖低层次的HB模块的变化
    public void studyJavaCourse(){
        System.out.println("HB在学习Java课程...");
    }
    public void studyFECourse(){
        System.out.println("HB在学习前端课程...");
    }*/

    private ICourse Icourse;
    // 通过构造器注入的方法实现
   /* public HB(ICourse iCourse){
        this.Icourse = iCourse;
    }*/

    // setCourse()方法注入
    public void setIcourse(ICourse icourse) {
        Icourse = icourse;
    }

    // 面向接口编程, 具体学习什么课程由应用层决定
    public void studyMoocCourse(){
        this.Icourse.studyCourse();
    }
}
