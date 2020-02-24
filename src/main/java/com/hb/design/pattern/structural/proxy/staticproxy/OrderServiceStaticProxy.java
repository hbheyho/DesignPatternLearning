package com.hb.design.pattern.structural.proxy.staticproxy;

import com.hb.design.pattern.structural.proxy.IOrderService;
import com.hb.design.pattern.structural.proxy.Order;
import com.hb.design.pattern.structural.proxy.OrderServiceImpl;
import com.hb.design.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * @Author: HB
 * @Description: 静态代理类 - 对OrderService对象进行增强
 *               代理类与OrderService之间的代理关系在编译期间就已经确定
 * @CreateDate: 11:25 2020/2/12
 */

// OrderServiceStaticProxy 也可和目标对象继承同一个接口
public class OrderServiceStaticProxy {
    // 注入目标对象
    private IOrderService iOrderService;

    // 增强了saveOrder方法的实现(与被代理类同名方法)，把db切换到dbRouter进行处理
    public int saveOrder(Order order){
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order){
        System.out.println("静态代理 before code");
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到[db" + dbRouter + "]处理数据");

        // todo 设置dataSource, 根据dbRouter的不同设置不同的数据库
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
    }

    private void afterMethod(){
        System.out.println("静态代理 after code");
    }
}
