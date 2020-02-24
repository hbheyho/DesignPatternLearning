package com.hb.design.pattern.behavioral.visitor;

/**
 * @Author: HB
 * @Description: 访问者接口
 * @CreateDate: 14:23 2020/2/23
 */

public interface IVisitor {
    public void visit(FreeCourse freecourse);
    public void visit(ChargeCourse chargeCourse);
}
