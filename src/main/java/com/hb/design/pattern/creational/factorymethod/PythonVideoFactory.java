package com.hb.design.pattern.creational.factorymethod;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  11:02  2020/1/9.
 */
public class PythonVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
