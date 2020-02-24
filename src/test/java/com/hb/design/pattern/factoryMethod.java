package com.hb.design.pattern;

import com.hb.design.pattern.creational.factorymethod.JavaVideoFactory;
import com.hb.design.pattern.creational.factorymethod.Video;
import org.junit.Test;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  11:03  2020/1/9.
 */
public class factoryMethod {
    @Test
    public void getVideoTest(){
        JavaVideoFactory javaVideoFactory = new JavaVideoFactory();
        Video video = javaVideoFactory.getVideo();
        video.produce();
    }
}
