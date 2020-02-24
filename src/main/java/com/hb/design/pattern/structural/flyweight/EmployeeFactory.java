package com.hb.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: HB
 * @Description: 员工工厂类
 * @CreateDate: 20:04 2020/2/10
 */

public class EmployeeFactory {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<String, Employee>();
    public static Employee getManeger(String department){
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null){
            manager = new Manager(department);
            System.out.print("创建" + department + "的部门经理");
            String reportContent = department + "部门汇报" + "内容是....";
            manager.setReportContent(reportContent);
            System.out.println(" 创建报告:" + reportContent);
            EMPLOYEE_MAP.put(department,manager);
        }
        return manager;
    }
}
