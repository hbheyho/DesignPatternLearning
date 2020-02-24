package com.hb.design.pattern;

import com.hb.design.pattern.creational.singleton.EnumSingleton;
import com.hb.design.pattern.creational.singleton.HungrySingleton;
import com.hb.design.pattern.creational.singleton.LazySingleton;
import com.hb.design.pattern.creational.singleton.ThreadLocalSingleton;
import org.junit.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  13:37  2020/1/13.
 */
public class singleton  {
    // 懒汉模式单线程安全
    @Test
    public void lazySingletonSingleThread(){
        LazySingleton lazySingleton = LazySingleton.getLazySingleton();
        System.out.println(lazySingleton);
    }

    // 多线程不安全，生成了不止两个实例，通过synchronized关键字解决
    @Test
    public void lazySingletonMulitiThread(){
        // 创建两个线程
        Thread t1 = new Thread(new thread());
        Thread t2 = new Thread(new thread());
        t1.start();
        t2.start();
        System.out.println("Program end.");
    }

    // 懒汉模式双重检查
    @Test
    public void lazySingletonDoubleCheck(){
        // 创建两个线程
        Thread t1 = new Thread(new thread());
        Thread t2 = new Thread(new thread());
        t1.start();
        t2.start();
        System.out.println("Program end.");
    }

    // 懒汉模式静态类
    @Test
    public void lazySingletonStaticInnerClass(){
        // 创建两个线程
        Thread t1 = new Thread(new thread());
        Thread t2 = new Thread(new thread());
        t1.start();
        t2.start();
        System.out.println("Program end.");
    }

    // 饿汉模式
    @Test
    public void hungrySingletonTest(){
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        System.out.println(hungrySingleton);
    }

    // 饿汉模式 - 序列化与反序列化破坏
    @Test
    public void hungrySingletonTest2() throws IOException, ClassNotFoundException {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();

        // 序列化 - 把对象写进文件中
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton"));
        oos.writeObject(hungrySingleton);

        // 反序列化 - 从文件中读入对象
        File file = new File("singleton");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        // 观察序列化之前与之后是否是同一个对象
        HungrySingleton hungrySingletonNew = (HungrySingleton) ois.readObject();
        System.out.println(hungrySingleton);
        System.out.println(hungrySingletonNew);
        System.out.println(hungrySingleton == hungrySingletonNew);
    }

    // 饿汉模式(类加载时，实例生成好) - 反射攻击破坏单例模式(通过反射，打开构造器权限）以及解决方式
    @Test
    public void hungrySingletonTest3() throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class classObject = HungrySingleton.class;
        Constructor constructor = classObject.getDeclaredConstructor(); // 得到声明的构造器
        // 修改构造器权限
        constructor.setAccessible(true);

        //通过饿汉模式得到对象
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        // 通过构造器得到对象
        HungrySingleton hungrySingleton12 = (HungrySingleton) constructor.newInstance();

        System.out.println(hungrySingleton);
        System.out.println(hungrySingleton12);
        System.out.println(hungrySingleton == hungrySingleton12);
    }

    // 懒汉模式(类加载时，实例还未生成好) - 反射攻击破坏单例模式(通过反射，打开构造器权限）以及解决方式
    @Test
    public void lazySingletonTest2() throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class classObject = LazySingleton.class;
        Constructor constructor = classObject.getDeclaredConstructor(); // 得到声明的构造器
        // 修改构造器权限
        constructor.setAccessible(true);

        //通过懒汉模式得到对象
        LazySingleton lazySingleton = LazySingleton.getLazySingleton();
        // 通过构造器得到对象

        // 但是还是能够修改flag值来破坏单例模式 - 所以单例模式很难阻止反射
        Field flag = lazySingleton.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(lazySingleton,true);

        LazySingleton lazySingleton2 = (LazySingleton) constructor.newInstance();

        System.out.println(lazySingleton);
        System.out.println(lazySingleton2);
        System.out.println(lazySingleton == lazySingleton2);
    }

    // 使用enum来使用单例模式 - 不会序列化以及反序列化破坏
    @Test
    public void enumSingletonTest() throws IOException, ClassNotFoundException {
        EnumSingleton enumSingleton = EnumSingleton.getInstance();
        // 设置枚举类持有的对象
        enumSingleton.setDate(new Object());

        // 序列化 - 把对象写进文件中
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton"));
        oos.writeObject(enumSingleton);

        // 反序列化 - 从文件中读入对象
        File file = new File("singleton");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        // 观察序列化之前与之后是否是同一个对象
        EnumSingleton enumSingletonNew = (EnumSingleton) ois.readObject();
        System.out.println(enumSingleton.getDate());
        System.out.println(enumSingletonNew.getDate());
        System.out.println(enumSingleton.getDate() == enumSingletonNew.getDate());
    }

    // 使用enum来使用单例模式 - 不会反射破坏
    @Test
    public void enumSingletonTest2() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class classObject = EnumSingleton.class;
        Constructor constructor = classObject.getDeclaredConstructor(String.class,int.class); // 得到声明的构造器
        // 修改构造器权限
        constructor.setAccessible(true);
        // 通过构造器得到对象
        EnumSingleton enumSingleton2 = (EnumSingleton) constructor.newInstance("HB",666);
        //通过懒汉模式得到对象
        EnumSingleton enumSingleton = EnumSingleton.getInstance();

        enumSingleton.INSTANCE.printStr();
        enumSingleton.printStr();

        System.out.println(enumSingleton.INSTANCE);
        System.out.println(enumSingleton2);
        System.out.println(enumSingleton == enumSingleton2);
    }

    // 容器单例模式
    @Test
    public void containerSingletonTest(){
       // 创建两个线程
        Thread t1 = new Thread(new thread());
        Thread t2 = new Thread(new thread());
        t1.start();
        t2.start();
        System.out.println("Program end.");
    }

    // ThreadLocal单例模式 - 线程获取某实例是唯一不变的
    @Test
    public void threadLocalSingletonTest(){
        // 查看主线程实例
        System.out.println("main thread" + "" + ThreadLocalSingleton.getInstance());
        System.out.println("main thread" + "" + ThreadLocalSingleton.getInstance());
        System.out.println("main thread" + "" + ThreadLocalSingleton.getInstance());
        System.out.println("main thread" + "" + ThreadLocalSingleton.getInstance());

        // 创建两个线程
        Thread t1 = new Thread(new thread());
        Thread t2 = new Thread(new thread());
        t1.start();
        t2.start();
        System.out.println("Program end.");
    }

    // 克隆破坏单例模式以及解决方案
    @Test
    public void hungrySingletonClone() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
        // clone为protected权限 打开权限
        method.setAccessible(true);
        HungrySingleton hungrySingletonClone = (HungrySingleton) method.invoke(hungrySingleton);
        System.out.println(hungrySingletonClone);
        System.out.println(hungrySingleton);
    }

}
