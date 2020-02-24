package com.hb.design.pattern;
import com.hb.design.pattern.creational.simplefactory.JavaVideo;
import com.hb.design.pattern.creational.simplefactory.PythonVideo;
import com.hb.design.pattern.creational.simplefactory.Video;
import com.hb.design.pattern.creational.simplefactory.VideoFactory;
import org.junit.Test;
/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  17:05  2020/1/8.
 */
public class simpleFactory {
    @Test
    public void simpleFactoryTest1(){
        Video video = new JavaVideo();
        video.produce();
        // 应用层依赖于具体实现类, 若要录制Python视频，则需要创建PythonVideo实例，并导入PythonVideo包
        /*Video video = new PythonVideo();
         video.produce();*/
    }

    // 传入参数即可生产出对应对象，生产对象细节被隐藏，但是不符合工厂模式
    @Test
    public void simpleFactoryTest2(){
        /*VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        video.produce();*/
    }

    // 传参改为Class对象,使其符合开闭原则
    @Test
    public void simpleFactoryTest3(){
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(PythonVideo.class);
        video.produce();
    }
}
