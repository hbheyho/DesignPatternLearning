package com.hb.design.pattern.creational.abstractfactory;

/**
 * @Author:HB
 * @Description: Python产品产品族创建工厂 其中产品有video、article
 * @Createdata:Created in  15:47  2020/1/21.
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
