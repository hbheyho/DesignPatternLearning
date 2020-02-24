package com.hb.design.pattern.creational.abstractfactory;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  15:51  2020/1/21.
 */
public class PythonArticle  extends Article{
    @Override
    public void produce() {
        System.out.println("录制Python手记");
    }
}
