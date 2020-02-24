package com.hb.design.pattern.behavioral.observer;

/**
 * @Author: HB
 * @Description: 问题类
 * @CreateDate: 17:18 2020/2/19
 */

public class Question {
    private String userName;
    private String questionContent;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}
