package com.hb.design.pattern.creational.builder.builderV1;

/**
 * @Author:HB
 * @Description: 课程建造者实现类
 * @Createdata:Created in  16:30  2020/1/23.
 */
public class CourseActualBuilder extends CourseBuilder {
    Course course = new Course();
    @Override
    public void buildCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    @Override
    public void buildPPTName(String PPTName) {
        course.setCoursePPT(PPTName);
    }

    @Override
    public void buildCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    @Override
    public void buildCourseArticle(String courseArticle) {
        course.setCourseArticle(courseArticle);
    }

    @Override
    public void buildCourseQA(String courseQA) {
        course.setCourseQA(courseQA);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
