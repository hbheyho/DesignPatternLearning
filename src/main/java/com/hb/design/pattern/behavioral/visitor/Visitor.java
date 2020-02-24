package com.hb.design.pattern.behavioral.visitor;

/**
 * @Author: HB
 * @Description:
 * @CreateDate: 14:27 2020/2/23
 */

public class Visitor implements IVisitor {
    // 访问收费课程
    @Override
    public void visit(ChargeCourse chargeCourse) {
        System.out.println("我是访问者1" + "收费课程: " + chargeCourse.getName() + ", 价格为: " + chargeCourse.getPrice());
    }

    // 访问免费课程
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("我是访问者1" + "免费课程: " + freeCourse.getName());
    }
}
