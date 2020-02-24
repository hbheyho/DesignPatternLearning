package com.hb.design.pattern.creational.singleton;

/**
 * @Author:HB
 * @Description: 懒汉单例模式 - 单线程安全 - 注重延迟加载，只有使用时才初始化
 * @Createdata:Created in  13:31  2020/1/13.
 */
public class LazySingleton {
    // 创建私有变量,用以记录的唯一实例
    private static LazySingleton lazySingleton = null;
    private static boolean flag = true;
    // 私有构造方法，防止外部对其初始化
    private LazySingleton(){
        // 解决反射问题( 但是若构造器先生成对象，则会照样破坏单例模式）,遂使用一个flag标准判断，但是可以修改构造器属性权限，对其进行修改
        if (flag){
            flag = false;
        }else {
            throw new RuntimeException("单例模式禁止反射调用");
        }
    }

    // 对外暴露获取LazySingleton接口 - 在static方法中加synchronized关键字相当于锁了LazySingleton类（类锁）；若不是静态方法，则锁在堆内存中，即对象实例
    public synchronized static LazySingleton getLazySingleton(){
        // 或者synchronized来锁代码块
        /*synchronized(LazySingleton.class){
            if (lazySingleton == null) {
                lazySingleton =  new LazySingleton();
            }
        } */

        if (lazySingleton == null) {
            lazySingleton =  new LazySingleton();
        }
        return lazySingleton;
    }
}
