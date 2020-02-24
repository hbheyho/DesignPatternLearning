package com.hb.design.pattern.structural.proxy.dynamicproxy;

import com.hb.design.pattern.structural.proxy.Order;
import com.hb.design.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: HB
 * @Description: 动态代理类在运行时被动态创建
 * @CreateDate: 12:21 2020/2/12
 */

public class ClassServiceDynamicProxy implements InvocationHandler {
    // 目标对象 - 被代理类（目标类不局限于Order类）
    private Object target;
    // 通过构造器注入
    public ClassServiceDynamicProxy(Object target) {
        this.target = target;
    }

    // 进行绑定，返回一个对象（本例为OrderService接口）
    // getInterfaces - class 所声明的接口
    public Object bind(){
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }


    /**
     * 调用处理
     * @param proxy 代理类对象
     * @param method 标识具体调用的是被代理类的哪个方法
     * @param args 被代理类方法的参数
     */
    @Override  // 增强方法为method = saveOrder, args = Order
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        // 被增强方法的返回值
        Object object = method.invoke(target,args);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object object){
        int userId = 0;
        System.out.println("动态代理 before code");
        if (object instanceof Order){
            Order order = (Order)object;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到[db" + dbRouter + "]处理数据");

        // todo 设置dataSource, 根据dbRouter的不同设置不同的数据库
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
    }
    private void afterMethod(){
        System.out.println("静态代理 after code");
    }
}
