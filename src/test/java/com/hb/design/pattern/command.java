package com.hb.design.pattern;

import com.hb.design.pattern.behavioral.command.*;
import org.junit.Test;

/**
 * @Author: HB
 * @Description: 命令模式测试类
 * @CreateDate: 11:31 2020/2/21
 */

public class command {
    @Test
    public void commandTest(){
        CourseVideo courseVideo = new CourseVideo("java设计模式视频");
        Staff staff = new Staff();
        System.out.println("发出开放视频命令");
        Command openCommand = new OpenCourseVideoCommand(courseVideo);
        staff.addCommand(openCommand);
        staff.executeCommand();

        System.out.println("发出关闭视频命令");
        Command closeCommand = new CloseCourseVideoCommand(courseVideo);
        staff.addCommand(closeCommand);
        staff.executeCommand();
    }
        }
