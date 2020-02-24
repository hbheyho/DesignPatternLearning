package com.hb.design.pattern.creational.abstractfactory;

/**
 * @Author:HB
 * @Description: Java产品产品族创建工厂 其中产品有video、article
 * @Createdata:Created in  15:46  2020/1/21.
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
