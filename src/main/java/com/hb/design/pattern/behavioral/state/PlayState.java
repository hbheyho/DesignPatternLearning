package com.hb.design.pattern.behavioral.state;

/**
 * @Author: HB
 * @Description: 播放状态类
 * @CreateDate: 9:53 2020/2/24
 */

public class PlayState extends CourseVideoState {
    @Override
    public void play() {
        System.out.println("播放视频中");
    }

    @Override
    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.STOP_STATE);
    }
}
