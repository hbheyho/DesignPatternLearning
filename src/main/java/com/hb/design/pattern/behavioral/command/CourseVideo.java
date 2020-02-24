package com.hb.design.pattern.behavioral.command;

/**
 * @Author: HB
 * @Description: 课程类
 * @CreateDate: 11:19 2020/2/21
 */

public class CourseVideo {
    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public void open(){
        System.out.println(this.name + "课程视频开放");
    }

    public void close(){
        System.out.println(this.name + "课程视频关闭");
    }
}
