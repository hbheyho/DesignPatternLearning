package com.hb.design.pattern.creational.builder.builderV1;

/**
 * @Author:HB
 * @Description: 课程建造者抽象类
 * @Createdata:Created in  16:25  2020/1/23.
 */
public abstract class CourseBuilder {
    // 对course中的属性进行建造
    public abstract void buildCourseName(String courseName);
    public abstract void buildPPTName(String PPTName);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    // 制作完成后，返回课程
    public abstract Course makeCourse();
}
