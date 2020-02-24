package com.hb.design.pattern.creational.builder.builderV1;

/**
 * @Author:HB
 * @Description: 负责进行课程构造 - 可不需要coach类
 * @Createdata:Created in  16:36  2020/1/23.
 */
public class Coach {
    private CourseBuilder courseBuilder;

    // CourseBuilder注入
    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String couseName,String coursePPT,
                             String courseVideo,String courseArticle,
                             String courseQA){
        this.courseBuilder.buildCourseName(couseName);
        this.courseBuilder.buildPPTName(coursePPT);
        this.courseBuilder.buildCourseVideo(courseVideo);
        this.courseBuilder.buildCourseArticle(courseArticle);
        this.courseBuilder.buildCourseQA(courseQA);
        return this.courseBuilder.makeCourse();
    }
}
