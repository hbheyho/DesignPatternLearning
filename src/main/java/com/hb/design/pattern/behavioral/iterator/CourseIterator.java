package com.hb.design.pattern.behavioral.iterator;

/**
 * @Author: HB
 * @Description: 课程迭代器
 * @CreateDate: 12:33 2020/2/16
 */

public interface CourseIterator {
    Course nextCourse();
    boolean isLastCourse();
}
