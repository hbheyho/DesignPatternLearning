package com.hb.design.pattern.behavioral.strategy;

/**
 * @Author: HB
 * @Description: 满减促销策略
 * @CreateDate: 10:04 2020/2/17
 */

public class ManjianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("进行满减促销，满200-20");
    }
}
