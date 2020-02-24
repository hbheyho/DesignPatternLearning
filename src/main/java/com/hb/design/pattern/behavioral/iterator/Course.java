package com.hb.design.pattern.behavioral.iterator;

/**
 * @Author: HB
 * @Description: 课程对象
 * @CreateDate: 12:29 2020/2/16
 */

public class Course {
    private String name;
    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
