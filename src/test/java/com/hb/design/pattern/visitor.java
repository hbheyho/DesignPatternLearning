package com.hb.design.pattern;

import com.hb.design.pattern.behavioral.visitor.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HB
 * @Description: 访问者模式示例
 * @CreateDate: 14:39 2020/2/23
 */

public class visitor {

    @Test
    public void visitorTest(){
        List<Course> courseList = new ArrayList<Course>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("设计模式精讲");

        ChargeCourse chargeCourse = new ChargeCourse();
        chargeCourse.setName("Spring学习");
        chargeCourse.setPrice(250);

        courseList.add(freeCourse);
        courseList.add(chargeCourse);

        // 使用访问者1进行操作
        for(Course course : courseList){
            course.accept(new Visitor());
        }

        // 使用访问者2进行操作
        for(Course course : courseList){
            course.accept(new Visitor2());
        }
    }
}
