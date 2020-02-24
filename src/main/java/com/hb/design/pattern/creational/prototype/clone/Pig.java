package com.hb.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  14:14  2020/1/10.
 */
public class Pig implements Cloneable {
    private String name;
    private Date birthDay;

    public Pig(String name, Date birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                '}' + super.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();

        // 深克隆
        pig.birthDay = (Date) pig.birthDay.clone(); // Date对象已经重写了Cloneable方法
        return pig;
    }
}
