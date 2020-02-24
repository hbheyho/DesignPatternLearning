package com.hb.design.principle.interfacesegregation;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  11:41  2020/1/7.
 */
public class Dog implements IEatAnimalAction, ISwimAnimalAction  {
    @Override
    public void eat() {

    }

    @Override
    public void Swim() {

    }  //IAnimalAction
    // 未实现接口隔离，实现了Dog不需要的接口
    /*@Override
    public void eat() {}
    @Override
    public void swim() {}
    @Override
    public void fly() {}*/
}
