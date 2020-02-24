package com.hb.design.pattern;

import com.hb.design.pattern.behavioral.iterator.Course;
import com.hb.design.pattern.behavioral.iterator.CourseAggregate;
import com.hb.design.pattern.behavioral.iterator.CourseAggregateImpl;
import com.hb.design.pattern.behavioral.iterator.CourseIterator;
import org.junit.Test;

/**
 * @Author: HB
 * @Description: 迭代器模式测试类
 * @CreateDate: 13:19 2020/2/16
 */

public class iterator {
    @Test
    public void iteratorTest(){
        Course designPatternCourse = new Course("java 设计模式");
        Course FECourse = new Course("前端课程");
        Course javaCourse = new Course("java课程");

        // 创建Course对象集合类
        CourseAggregate courseAggregate = new CourseAggregateImpl();
        courseAggregate.addCourse(designPatternCourse);
        courseAggregate.addCourse(FECourse);
        courseAggregate.addCourse(javaCourse);

        System.out.println("===拥有课程列表===");
        // 输出迭代器元素
        printCourse(courseAggregate);

        // 删除课程
        System.out.println("===删除FE课程===");
        courseAggregate.removeCourse(FECourse);
        printCourse(courseAggregate);
    }

    public void printCourse(CourseAggregate courseAggregate){
        // 获取迭代器
        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while (!courseIterator.isLastCourse()){
            System.out.println(courseIterator.nextCourse().toString());
        }
    }
}
