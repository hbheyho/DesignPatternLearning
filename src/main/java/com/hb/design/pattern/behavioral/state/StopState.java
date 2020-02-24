package com.hb.design.pattern.behavioral.state;

/**
 * @Author: HB
 * @Description: 停止状态类
 * @CreateDate: 9:53 2020/2/24
 */

public class StopState extends CourseVideoState{
    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("ERROR 停止状态不能快进");
    }

    @Override
    public void pause() {
        System.out.println("ERROR 停止状态不能暂停");
    }

    @Override
    public void stop() {
        System.out.println("播放停止中");
    }
}
