package com.hb.design.pattern.behavioral.chainofresponsibility;

/**
 * @Author: HB
 * @Description: 审批者
 * @CreateDate: 11:07 2020/2/14
 */

public abstract class Approver {
    public Approver approver;

    // 设置下一个批准者
    public void setNextApprover(Approver approver){
        this.approver = approver;
    }

    // 课程审批处理
    public abstract void deploy(Course course);

}
