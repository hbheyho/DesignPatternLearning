package com.hb.design.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HB
 * @Description: 课程操作实现
 * @CreateDate: 12:34 2020/2/16
 */

public class CourseAggregateImpl implements CourseAggregate {
    private List courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    // 获取课程迭代器
    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}
