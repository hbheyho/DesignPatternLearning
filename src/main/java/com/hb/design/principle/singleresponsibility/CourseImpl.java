package com.hb.design.principle.singleresponsibility;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  11:15  2020/1/7.
 */
public class CourseImpl implements ICourseContent, ICourseManage {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void refundCourse() {

    }

    @Override
    public void studyCourse() {

    }
}
