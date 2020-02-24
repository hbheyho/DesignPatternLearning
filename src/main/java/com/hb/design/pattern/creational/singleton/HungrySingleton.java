package com.hb.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @Author:HB
 * @Description: 饿汉式 - 类加载时就初始化 - 若类很少用，容易造成内存浪费
 * @Createdata:Created in  16:26  2020/1/13.
 */
public class HungrySingleton implements Serializable, Cloneable {
    // 类加载时就初始化
    private final static HungrySingleton hungrySingleton = new HungrySingleton();
    // 采用静态代码块方式
    /*static{
        hungrySingleton = new HungrySingleton();
    }*/

    private HungrySingleton(){
        // 解决反射问题 （因为其在类加载时，实例就会生成好）
        if (hungrySingleton != null){
            throw new RuntimeException("单例模式禁止反射调用");
        }
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }

    // 采用反射机制调用readResolve方法，返回旧对象，而不是返回新new的对象 - 解决序列化与反序列化破坏
    private Object readResolve(){
        return hungrySingleton;
    }

    // 克隆破坏单例实验
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        // 解决克隆破坏
        return getInstance();
    }
}
