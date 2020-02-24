package com.hb.design.pattern.behavioral.state;

/**
 * @Author: HB
 * @Description: 课程视频上下文
 * @CreateDate: 9:51 2020/2/24
 */

public class CourseVideoContext {
    private CourseVideoState courseVideoState;
    public final static PlayState PLAY_STATE = new PlayState();
    public final static StopState STOP_STATE = new StopState();
    public final static PauseState PAUSE_STATE = new PauseState();
    public final static SpeedState SPEED_STATE = new SpeedState();

    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        // 设置视频状态上下文
        this.courseVideoState.setCourseVideoContext(this);
    }

    public void play(){
        this.courseVideoState.play();
    }
    public void stop(){
        this.courseVideoState.stop();
    }
    public void pause(){
        this.courseVideoState.pause();
    }
    public void speed(){
        this.courseVideoState.speed();
    }
}
