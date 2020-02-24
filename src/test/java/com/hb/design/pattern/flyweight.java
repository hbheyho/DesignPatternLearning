package com.hb.design.pattern;

import com.hb.design.pattern.structural.flyweight.EmployeeFactory;
import com.hb.design.pattern.structural.flyweight.Manager;
import org.junit.Test;

/**
 * @Author: HB
 * @Description: 享元模式测试
 * @CreateDate: 20:17 2020/2/10
 */

public class flyweight {
    private static final String departments[] = {"RD","QA","QM","BD"};
    @Test
    public void flyweightTest(){
        for (int i = 0; i < 10; i++){
            String department = departments[(int)(Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManeger(department);
            manager.report();
        }
    }
}
