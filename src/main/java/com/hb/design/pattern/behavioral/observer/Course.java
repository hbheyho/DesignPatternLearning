package com.hb.design.pattern.behavioral.observer;

import java.util.Observable;

/**
 * @Author: HB
 * @Description: 课程类 - 被观察者（主题对象）
 *               - 继承Observable类
 * @CreateDate: 17:16 2020/2/19
 */

public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course, Question question){
        System.out.println(question.getUserName() + "在" + course.getCourseName() +
                "提出了问题：" + question.getQuestionContent());
        // Observable内置方法,表示被观察者状态发生改变
        setChanged();
        // Observable内置方法,通知观察者, 传入的参数为Object对象
        notifyObservers(question);
    }
}
