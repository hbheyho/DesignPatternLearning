package com.hb.design.pattern.creational.prototype;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  13:39  2020/1/10.
 */
// Cloneable接口只是作为标识接口,重写的是Object父类的Clone方法
public class Mail implements Cloneable {
    private String name;
    private String mailAddress;
    private String content;

    public Mail() {
        System.out.println("Construct");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    // 重写克隆方法,不会调用构造器
    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("clone Mail Object");
        return super.clone();
    }
}
