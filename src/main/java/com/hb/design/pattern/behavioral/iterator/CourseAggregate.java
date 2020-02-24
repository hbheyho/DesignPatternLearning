package com.hb.design.pattern.behavioral.iterator;

/**
 * @Author: HB
 * @Description: 课程操作接口 - 也可看作是一个课程的集合对应的接口
 * @CreateDate: 12:31 2020/2/16
 */

public interface CourseAggregate {
    void addCourse(Course course);
    void removeCourse(Course course);

    CourseIterator getCourseIterator();
}
