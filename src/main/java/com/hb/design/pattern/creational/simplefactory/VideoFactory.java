package com.hb.design.pattern.creational.simplefactory;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  17:06  2020/1/8.
 */
public class VideoFactory {
    // 不符合开闭原则，若需要新增课程，需要修改工厂类类
    /*public Video getVideo(String type){
        if ("java".equals(type)){
            return new JavaVideo();
        }else {
            return new PythonVideo();
        }
    }*/

    // 符合开闭原则
    public Video getVideo(Class c){
        Video video = null;
        try {
            video = (Video)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

}
