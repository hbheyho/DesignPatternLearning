package com.hb.design.pattern.behavioral.mediator;

import java.util.Date;

/**
 * @Author: HB
 * @Description: 中介者类
 * @CreateDate: 10:47 2020/2/22
 */

public class StudyGroup {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + "[ " + user.getName() + "]: " + message);
    }
}
