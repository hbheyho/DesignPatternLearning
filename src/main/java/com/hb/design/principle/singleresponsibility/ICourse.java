package com.hb.design.principle.singleresponsibility;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  11:06  2020/1/7.
 */
public interface ICourse {
    // 两面四个方法分别代表了两个职责，不能放在同一个接口中，退款操作会影响用户得到学习视频等操作
    // 获取课程信息
    public String getCourseName();
    public byte[] getCourseVideo();

    // 课程管理
    public void refundCourse();
    public void studyCourse();
}
