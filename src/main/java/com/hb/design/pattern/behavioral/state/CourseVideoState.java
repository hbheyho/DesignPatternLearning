package com.hb.design.pattern.behavioral.state;

/**
 * @Author: HB
 * @Description: 课程视频状态类
 * @CreateDate: 9:50 2020/2/24
 */

public abstract class CourseVideoState {
    protected CourseVideoContext courseVideoContext;

    public void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();

}
