package com.hb.design.pattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  13:41  2020/1/10.
 */
public class MailUtil {
    public static void sendMail(Mail mail){
        String outputContent = "向{0}同学,邮件地址{1},发送内容：{2}";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getMailAddress(),mail.getContent()));
    }

    public static void saveOriginMail(Mail mail){
        System.out.println("存储原始邮件内容，内容为：" + mail.getContent());
    }
}
