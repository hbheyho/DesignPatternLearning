package com.hb.design.pattern.behavioral.templatemethod;

/**
 * @Author: HB
 * @Description: 设计模式课程
 * @CreateDate: 15:13 2020/2/15
 */

public class DesignPatternCourse extends ACourse{

    @Override
    void packageCourse() {
        System.out.println("提供课程java源代码");
    }

    // 需要写手记，重写钩子方法即可
    @Override
    public boolean needWriteArticle() {
        return true;
    }
}
