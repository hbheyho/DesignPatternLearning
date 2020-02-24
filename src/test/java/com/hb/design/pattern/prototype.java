package com.hb.design.pattern;

import com.hb.design.pattern.creational.prototype.Mail;
import com.hb.design.pattern.creational.prototype.MailUtil;
import com.hb.design.pattern.creational.prototype.clone.Pig;
import org.junit.Test;

import java.util.Date;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  13:47  2020/1/10.
 */
public class prototype {
    @Test
    public void prototypeTest1() throws CloneNotSupportedException {
        Mail mail = new Mail();  // 创建一个原型实例
        mail.setContent("初始化模版");
        // 向多个用户发送邮件
        for (int i = 0; i < 10; i++){
            Mail tempMail = (Mail)mail.clone(); // 通过拷贝相应原型实例而创建新的对象
            tempMail.setMailAddress("user"+ i +"@163.com");
            tempMail.setName("user" + i);
            tempMail.setContent("恭喜您中奖了！");
            MailUtil.sendMail(tempMail);
        }
        MailUtil.saveOriginMail(mail);
    }

    @Test
    public void prototypeTest2() throws CloneNotSupportedException {
        Date date = new Date(0L);
        Pig pig1 = new Pig("佩琪",date);
        Pig pig2 = (Pig) pig1.clone(); // 浅克隆，没有对Date对象进行克隆。若要深克隆，对Date对象调用Clone()方法
        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthDay().setTime(666666666666L);
        System.out.println(pig1);
        System.out.println(pig2); // pig2的时间也随之改变
    }
}
