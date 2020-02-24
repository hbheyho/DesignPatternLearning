package com.hb.design.pattern.behavioral.visitor;

/**
 * @Author: HB
 * @Description: 课程抽象类
 * @CreateDate: 14:22 2020/2/23
 */

public abstract class Course {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(IVisitor visitor);
}
