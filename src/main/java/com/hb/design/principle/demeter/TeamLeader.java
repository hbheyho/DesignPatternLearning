package com.hb.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  13:11  2020/1/7.
 */
public class TeamLeader {
    public void checkNumberOfCourses(){
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i<= 20 ; i++){
            courseList.add(new Course());
        }
        System.out.println("在线课程数量是：" + courseList.size());
    }
}
