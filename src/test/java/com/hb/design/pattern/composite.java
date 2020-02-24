package com.hb.design.pattern;

import com.hb.design.pattern.structural.composite.CatalogComponent;
import com.hb.design.pattern.structural.composite.Course;
import com.hb.design.pattern.structural.composite.CourseCatalog;
import org.junit.Test;

/**
 * @Author: HB
 * @Description: 组合模式测试类
 * @CreateDate: 16:22 2020/2/11
 */

public class composite {
    @Test
    public void compositeTest(){
        CatalogComponent linuxCourse = new Course("Linux学习",123.3);
        CatalogComponent pythonCourse = new Course("Python开发",23.3);

        CatalogComponent course = new Course("Java Web开发",23.3);
        CatalogComponent course1 = new Course("Java 并行开发",20.5);
        CatalogComponent course2 = new Course("Java 虚拟机学习",13.3);
        CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录",2);
        javaCourseCatalog.add(course);
        javaCourseCatalog.add(course1);
        javaCourseCatalog.add(course2);

        CatalogComponent iMoocCourseCatalog = new CourseCatalog("慕课网课程目录",1);
        iMoocCourseCatalog.add(linuxCourse);
        iMoocCourseCatalog.add(pythonCourse);
        iMoocCourseCatalog.add(javaCourseCatalog);
        iMoocCourseCatalog.print();

        // linuxCourse 和 iMoocCourseCatalog(组合对象)可以进行一致性处理
        /*linuxCourse.print();
        String linuxName = linuxCourse.getName();*/

    }
}
