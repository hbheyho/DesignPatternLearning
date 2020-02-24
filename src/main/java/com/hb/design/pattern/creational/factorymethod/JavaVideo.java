package com.hb.design.pattern.creational.factorymethod;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  17:00  2020/1/8.
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java视频");
    }
}
