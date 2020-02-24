package com.hb.design.pattern.behavioral.visitor;

/**
 * @Author: HB
 * @Description: 收费课程
 * @CreateDate: 14:24 2020/2/23
 */

public class ChargeCourse extends Course{
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
