package com.hb.design.pattern;

import com.hb.design.pattern.behavioral.state.CourseVideoContext;
import com.hb.design.pattern.behavioral.state.PlayState;
import org.junit.Test;

/**
 * @Author: HB
 * @Description: 状态模式测试类
 * @CreateDate: 10:18 2020/2/24
 */

public class state {
    @Test
    public void stateTest(){
         //创建一个上下文对象
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PlayState());
        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.pause();
        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.speed();
        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

        courseVideoContext.stop();
        System.out.println("当前状态：" + courseVideoContext.getCourseVideoState().getClass().getSimpleName());

    }
}
