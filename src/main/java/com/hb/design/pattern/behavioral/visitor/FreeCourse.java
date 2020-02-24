package com.hb.design.pattern.behavioral.visitor;

/**
 * @Author: HB
 * @Description: 免费课程
 * @CreateDate: 14:28 2020/2/23
 */

public class FreeCourse extends Course{

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
