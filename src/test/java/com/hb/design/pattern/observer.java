package com.hb.design.pattern;

import com.hb.design.pattern.behavioral.observer.Course;
import com.hb.design.pattern.behavioral.observer.Question;
import com.hb.design.pattern.behavioral.observer.Teacher;
import org.junit.Test;

/**
 * @Author: HB
 * @Description: 观察者模式测试类
 * @CreateDate: 17:39 2020/2/19
 */

public class observer {
    @Test
    public void observerTest(){
        Teacher teacher1 = new Teacher("MR.WANG");
        Teacher teacher2 = new Teacher("MRS.QIU");
        Course course = new Course("设计模式课程");
        course.addObserver(teacher1);
        course.addObserver(teacher2);

        Question question = new Question();
        question.setUserName("HB");
        question.setQuestionContent("老师，我学不会！");
        // 相应课程产生问题，通知观察者
        course.produceQuestion(course,question);
    }
}


