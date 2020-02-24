package com.hb.design.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author: HB
 * @Description: 手记审批者
 * @CreateDate: 11:13 2020/2/14
 */

public class ArticleApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (StringUtils.isNoneEmpty(course.getArticle())){
            System.out.println(course.getName() + "手记不为空，审批通过");

            // 拿到父类approver,下面还有人需要审批
            if (approver != null){
                approver.deploy(course);
            }
        }else{
            System.out.println(course.getName() + "手记为空，审批不通过");
            return;
        }
    }
}
