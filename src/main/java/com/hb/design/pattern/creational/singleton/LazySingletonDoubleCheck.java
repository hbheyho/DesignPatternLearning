package com.hb.design.pattern.creational.singleton;

/**
 * @Author:HB
 * @Description: 懒汉单例模式 - 双重检查 - 对懒汉式的演进
 * @Createdata:Created in  15:35  2020/1/13.
 */
public class LazySingletonDoubleCheck {
    // 创建私有变量,用以记录的唯一实例 。使用volatile关键字禁止LazySingletonDoubleCheck重排序，所有线程都可看到内存状态，保证了可见性
    private volatile static LazySingletonDoubleCheck lazySingletonDoubleCheck = null;
    // 私有构造方法，防止外部对其初始化
    private LazySingletonDoubleCheck(){
    }

    // 选择在方法体中加锁, 若其他线程判断不为空，可直接返回，避免了阻塞，也避免了synchronized加在方法体上的性能开销
    public static LazySingletonDoubleCheck getLazySingletonDoubleCheck(){
        if (lazySingletonDoubleCheck == null) {
            synchronized (LazySingletonDoubleCheck.class){
                if (lazySingletonDoubleCheck == null){
                    //1. 分配内存
                    //2. 初始化对象
                    //3. 设置LazySingletonDoubleCheck 指向刚分配好的内存地址
                    //4. 首次使用对象
                    // 但是可能在实际过程中，存在2，3 步骤位置的互换（重排序），在单线程中不会造成影响，多线程存在隐患
                    // 使用volatile关键字禁止LazySingletonDoubleCheck重排序，所有线程都可看到内存状态，保证了可见性
                    lazySingletonDoubleCheck =  new LazySingletonDoubleCheck();
                }
            }
        }
        return lazySingletonDoubleCheck;
    }
}
