package com.hb.design.pattern.creational.abstractfactory;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  15:49  2020/1/21.
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java视频");
    }
}
