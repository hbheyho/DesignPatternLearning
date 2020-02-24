package com.hb.design.principle.interfacesegregation;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  11:42  2020/1/7.
 */
public class Bird implements IFlyAnimalAction, IEatAnimalAction  {
    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }   // IAnimalAction
    // 未实现接口隔离，实现了Bird不需要的接口
    /*@Override
    public void eat() {}
    @Override
    public void swim() {}
    @Override
    public void fly() {}*/
}
