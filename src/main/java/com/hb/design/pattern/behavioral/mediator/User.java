package com.hb.design.pattern.behavioral.mediator;

/**
 * @Author: HB
 * @Description: 用户类 - 只和中介者打交道就可
 * @CreateDate: 10:48 2020/2/22
 */

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 用户只和中介者进行打交道就可 从 1:n变成1:1
    public void sendMessage(String message){
        StudyGroup.showMessage(this,message);
    }

}
