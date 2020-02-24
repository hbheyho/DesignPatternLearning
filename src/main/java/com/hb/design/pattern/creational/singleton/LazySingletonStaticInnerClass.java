package com.hb.design.pattern.creational.singleton;

/**
 * @Author:HB
 * @Description: 懒汉单例模式 - 静态内部类 - 对懒汉式的演进
 * @Createdata:Created in  16:03  2020/1/13.
 */
public class LazySingletonStaticInnerClass {
    // 声明一个静态内部类
    private static class InnerClass{
        private static LazySingletonStaticInnerClass lazySingletonStaticInnerClass
                = new LazySingletonStaticInnerClass();
    }

    // 声明私有构造函数
    private LazySingletonStaticInnerClass(){
        // 解决反射问题
        if ( InnerClass.lazySingletonStaticInnerClass != null){
            throw new RuntimeException("单例模式禁止反射调用");
        }
    }

    // 开发对外方法
    public static LazySingletonStaticInnerClass getInstance(){
        return InnerClass.lazySingletonStaticInnerClass; // 初始化InnerClass时会有一个对象的初始化锁，且只有一个线程可以得到该锁
    }

}
