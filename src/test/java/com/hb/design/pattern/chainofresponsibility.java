package com.hb.design.pattern;

import com.hb.design.pattern.behavioral.chainofresponsibility.*;
import org.junit.Test;
/**
 * @Author: HB
 * @Description: 责任链模式测试类
 * @CreateDate: 11:38 2020/2/14
 */

public class chainofresponsibility {
    @Test
    public void chainOfResponsibilityTest(){
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();
        Approver courseInfoApprover = new CourseInfoApprover();

        Course course = new Course();
        course.setName("java课程");
        course.setArticle("java课程手记");
        course.setCourseInfo("关于java的学习课程");
        course.setVideo("java课程视频");

        // 设置责任链顺序 articleApprover -> videoApprover
        /*articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);*/

        // 设置责任链顺序 videoApprover -> articleApprover
       /* videoApprover.setNextApprover(articleApprover);
        videoApprover.deploy(course);*/

        // 设置责任链 courseInfoApprover -> videoApprover -> articleApprover
        courseInfoApprover.setNextApprover(videoApprover);
        videoApprover.setNextApprover(articleApprover);
        courseInfoApprover.deploy(course);
    }
}
