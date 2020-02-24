package com.hb.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author: HB
 * @Description: 课程基本信息审批
 * @CreateDate: 12:01 2020/2/14
 */

public class CourseInfoApprover extends Approver{
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNoneEmpty(course.getCourseInfo())){
            System.out.println(course.getName() + "信息完善，审批通过");

            // 拿到父类approver,下面还有人需要审批
            if (approver != null){
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName() + "信息不完善，审批不通过");
            return;
        }
    }
}
