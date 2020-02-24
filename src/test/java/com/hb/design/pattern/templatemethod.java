package com.hb.design.pattern;

import com.hb.design.pattern.behavioral.templatemethod.ACourse;
import com.hb.design.pattern.behavioral.templatemethod.DesignPatternCourse;
import com.hb.design.pattern.behavioral.templatemethod.FECourse;
import org.junit.Test;

/**
 * @Author: HB
 * @Description: 模板方法测试类
 * @CreateDate: 15:16 2020/2/15
 */

public class templatemethod {
    @Test
    public void templateMethodTest(){
        System.out.println("后端设计模式课程开始制作");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式课程制作完成");

        System.out.println("");

        System.out.println("前端课程开始制作");
        ACourse FECourse = new FECourse(true);
        FECourse.makeCourse();
        System.out.println("前端课程制作完成");
    }
}
