package com.hb.design.pattern.structural.proxy;

/**
 * @Author: HB
 * @Description: Dao层实现类
 * @CreateDate: 11:10 2020/2/12
 */

public class OrderDaoImple implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加成功！");
        return 1;
    }
}
