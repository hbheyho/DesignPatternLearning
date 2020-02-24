package com.hb.design.pattern.creational.factorymethod;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  17:02  2020/1/8.
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python视频");
    }
}
