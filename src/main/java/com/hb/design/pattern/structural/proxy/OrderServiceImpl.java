package com.hb.design.pattern.structural.proxy;

/**
 * @Author: HB
 * @Description:
 * @CreateDate: 11:12 2020/2/12
 */

public class OrderServiceImpl implements IOrderService {
    // 注入Dao层
    private IOrderDao iOrderDao;
    @Override
    public int saveOrder(Order order) {
        iOrderDao = new OrderDaoImple();
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }
}
