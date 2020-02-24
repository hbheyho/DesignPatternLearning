package com.hb.design.pattern.behavioral.templatemethod;

/**
 * @Author: HB
 * @Description: 前端课程
 * @CreateDate: 15:14 2020/2/15
 */

public class FECourse extends ACourse{
    private boolean needWriteArticle = false;
    public FECourse(boolean needWriteArticle) {
        this.needWriteArticle = needWriteArticle;
    }

    @Override
    void packageCourse() {
        System.out.println("提供课程源代码");
        System.out.println("提供课程所需要图片等资源");
    }

    // 可能FE种类更多，Vue需要手记，React不需要手记，将
    // 一些needWriteArticle开发给应用层
    @Override
    public boolean needWriteArticle() {
        return needWriteArticle;
    }
}
