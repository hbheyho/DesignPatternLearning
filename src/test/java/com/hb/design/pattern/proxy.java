package com.hb.design.pattern;

import com.hb.design.pattern.structural.proxy.IOrderService;
import com.hb.design.pattern.structural.proxy.Order;
import com.hb.design.pattern.structural.proxy.OrderServiceImpl;
import com.hb.design.pattern.structural.proxy.dynamicproxy.ClassServiceDynamicProxy;
import com.hb.design.pattern.structural.proxy.staticproxy.OrderServiceStaticProxy;
import org.junit.Test;

/**
 * @Author: HB
 * @Description: 代理模式测试
 * @CreateDate: 12:10 2020/2/12
 */

public class proxy {
    @Test
    public void staticProxyTest(){
        Order order = new Order();
        order.setUserId(1);

        // 生成静态代理类
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }

    @Test
    public void dynamicProxyTest(){
        Order order = new Order();
        order.setUserId(1);

        // 生成动态代理类 - 传入需要被增强的类，然后通过bind方法返回代理类(形如*$Proxy0的代理类)
        IOrderService orderServiceDynamicProxy = (IOrderService)(new ClassServiceDynamicProxy(new OrderServiceImpl()).bind());
        // 我们对被代理类的所有方法的调用都会变成对 invoke 方法的调用，这样我们可以在 invoke 方法中添加统一的处理逻辑
        orderServiceDynamicProxy.saveOrder(order);

    }
}
