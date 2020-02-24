package com.hb.design.principle.demeter;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  13:11  2020/1/7.
 */
public class Boss {
    public void commandCheckCourse(TeamLeader teamLeader){  // TeamLeader出现在参数中 - 直接的朋友
        // Course出现在成员变量中，不属于直接朋友，Boss类不需要关注Course的详细信息
        /*   List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i<= 20 ; i++){
            courseList.add(new Course());
        }*/
        teamLeader.checkNumberOfCourses();
    }
}
