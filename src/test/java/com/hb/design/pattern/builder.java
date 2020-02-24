package com.hb.design.pattern;

/*import com.hb.design.pattern.builder.builderV1.Coach;
import com.hb.design.pattern.builder.builderV1.Course;
import com.hb.design.pattern.builder.builderV1.CourseActualBuilder;
import com.hb.design.pattern.builder.builderV1.CourseBuilder;*/


import com.hb.design.pattern.creational.builder.builderV2.Course;
import org.junit.Test;

/**
 * @Author:HB
 * @Description: 建造者模式
 * @Createdata:Created in  16:47  2020/1/23.
 */
public class builder {
    @Test
    public void builderTestV1(){
        /*CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("java设计模式","java设计模式PPT","java设计模式.MP4",
                                        "java设计模式收集","java设计模式问答");
        System.out.println(course);*/
    }

    @Test
    public void builderTestV2(){
        // 链式调用
        Course course =  new Course.CourseBuilder().buildCourseName("java设计模式").
               buildPPTName("java设计模式PPT").buildCourseVideo("java设计模式.mp4").
               buildCourseArticle("java设计模式手记").buildCourseQA("java设计模式问答").build();
        System.out.println(course);
    }
}
