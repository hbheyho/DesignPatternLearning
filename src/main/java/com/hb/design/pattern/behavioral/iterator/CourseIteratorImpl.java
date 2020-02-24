package com.hb.design.pattern.behavioral.iterator;

import java.util.List;

/**
 * @Author: HB
 * @Description: 课程迭代器实现类
 * @CreateDate: 12:38 2020/2/16
 */

public class CourseIteratorImpl implements CourseIterator {
    private List courseList;
    private int position;
    private Course course;
    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    @Override
    public Course nextCourse() {
        System.out.println("返回课程,位置是:" + position);
        course = (Course) courseList.get(position);
        position++;
        return course;
    }

    @Override
    public boolean isLastCourse() {
        if (position < courseList.size()){
            return false;
        }
        return true;
    }
}
