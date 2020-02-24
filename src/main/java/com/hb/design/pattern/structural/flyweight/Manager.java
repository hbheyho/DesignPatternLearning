package com.hb.design.pattern.structural.flyweight;

/**
 * @Author: HB
 * @Description:
 * @CreateDate: 19:59 2020/2/10
 */

public class Manager implements Employee {
    private String title = "部门经理"; // 内部状态
    private String department; // 外部状态
    private String reportContent;

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }
}
