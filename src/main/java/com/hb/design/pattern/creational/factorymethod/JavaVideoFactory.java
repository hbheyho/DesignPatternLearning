package com.hb.design.pattern.creational.factorymethod;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  11:01  2020/1/9.
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
