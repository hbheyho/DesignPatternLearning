package com.hb.design.pattern.creational.singleton;

/**
 * @Author:HB
 * @Description: ThreadLocal单例 - 不能保证全局唯一，但可保证线程唯一（ThreadLocal保证了每个线程的实例唯一） ，
 * @Createdata:Created in  19:11  2020/1/13.
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingletonThreadLocal
            = new ThreadLocal<ThreadLocalSingleton>(){
        // 重写初始化方法
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public ThreadLocalSingleton() {
    }

    public static ThreadLocalSingleton getInstance(){
        return threadLocalSingletonThreadLocal.get();  // 通过get方法得到当前线程的副本变量
    }
}
