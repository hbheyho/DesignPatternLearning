package com.hb.design.pattern.behavioral.command;

/**
 * @Author: HB
 * @Description: 打开课程视频命令类
 * @CreateDate: 11:21 2020/2/21
 */

public class OpenCourseVideoCommand implements Command{
    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
