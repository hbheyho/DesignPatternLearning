package com.hb.design.pattern;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  13:42  2020/1/13.
 */
public class thread implements Runnable {
    @Override
    public void run() {
        /* - 多线程测试 LazySingleton lazySingleton = LazySingleton.getLazySingleton();
        System.out.println(Thread.currentThread().getName() + " " + lazySingletonDoubleCheck);*/
        /* - 懒汉双重检查测试  LazySingletonDoubleCheck lazySingletonDoubleCheck = LazySingletonDoubleCheck.getLazySingletonDoubleCheck();
        System.out.println(Thread.currentThread().getName() + " " + lazySingletonDoubleCheck);*/
        /* - 懒汉静态内部类测试
        LazySingletonStaticInnerClass lazySingletonStaticInnerClass = LazySingletonStaticInnerClass.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + lazySingletonStaticInnerClass);*/
        /* 容器单例模式测试
        ContainerSingleton.putInstance("object",new Object());
        Object instance = ContainerSingleton.getInstance("object");
        System.out.println(Thread.currentThread().getName() + " " + instance);*/
        /* ThreadLocal 单例模式测试 */
        /*ThreadLocalSingleton threadLocalSingleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + threadLocalSingleton);*/
    }
}
