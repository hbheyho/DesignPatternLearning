package com.hb.design.pattern;

import com.hb.design.pattern.creational.abstractfactory.Article;
import com.hb.design.pattern.creational.abstractfactory.CourseFactory;
import com.hb.design.pattern.creational.abstractfactory.JavaCourseFactory;
import com.hb.design.pattern.creational.abstractfactory.Video;
import org.junit.Test;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  16:05  2020/1/21.
 */
public class abstractfactory {
    @Test
    public void abstractFactoryTest(){
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        article.produce();
        video.produce();
    }
}
