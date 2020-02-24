package com.hb.design.pattern.behavioral.command;

/**
 * @Author: HB
 * @Description: 关闭课程视频命令类
 * @CreateDate: 11:22 2020/2/21
 */

public class CloseCourseVideoCommand implements Command{
    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}
