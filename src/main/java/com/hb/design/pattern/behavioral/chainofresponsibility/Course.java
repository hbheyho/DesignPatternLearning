package com.hb.design.pattern.behavioral.chainofresponsibility;

/**
 * @Author: HB
 * @Description: 课程类
 * @CreateDate: 10:59 2020/2/14
 */

public class Course {
    private String name;
    private String article;
    private String video;
    private String courseInfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getCourseInfo() {
        return courseInfo;
    }

    public void setCourseInfo(String courseInfo) {
        this.courseInfo = courseInfo;
    }
}
