package com.hb.design.pattern.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Author: HB
 * @Description: 教师类 - 观察者
 *               - 实现Observer接口
 * @CreateDate: 17:19 2020/2/19
 */

public class Teacher implements Observer {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    //  Observable - 被观察对象 arg - 通知内容
    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course)o;
        Question question = (Question)arg;
        System.out.println(teacherName + "老师的" + course.getCourseName() +
                "课程接受到一个" + question.getUserName() + "提交的问题, 内容为：" +
                question.getQuestionContent());
    }
}
