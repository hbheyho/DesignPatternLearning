package com.hb.design.principle.openclose;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  15:14  2020/1/6.
 */
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    // 不遵循里氏替换原则，getPrice()修改了父类的非抽象方法
   /* public Double getOriginPrice(){
        return super.getPrice();
    }
    // 遵循开闭原则，重写父类的getPrice()方法
    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }*/

    public Double getDiscountPrice(){
        return super.getPrice() * 0.8;
    }
}
