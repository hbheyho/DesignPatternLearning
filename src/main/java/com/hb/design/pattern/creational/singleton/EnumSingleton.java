package com.hb.design.pattern.creational.singleton;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  18:12  2020/1/13.
 */
public enum EnumSingleton {
    // INSTANCE可看作是EnumInstance类的实例(单例类的一个实例)，可EnumInstance.INSTANCE调用相应实例
    // INSTANCE可生成方法
    INSTANCE{
        public void printStr(){
            System.out.println("HBHBHB");
        }
    };
    // 外部调用该方法
    public abstract void printStr();
    private Object date; // 作为INSTANCE实例的属性

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
