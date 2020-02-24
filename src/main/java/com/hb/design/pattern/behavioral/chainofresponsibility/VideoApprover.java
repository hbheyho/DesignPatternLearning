package com.hb.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author: HB
 * @Description: 视频审批者
 * @CreateDate: 11:31 2020/2/14
 */

public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNoneEmpty(course.getVideo())){
            System.out.println(course.getName() + "视频不为空，审批通过");

            // 拿到父类approver,下面还有人需要审批
            if (approver != null){
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName() + "视频为空，审批不通过");
            return;
        }
    }
}
