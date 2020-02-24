package com.hb.design.pattern.behavioral.strategy;

/**
 * @Author: HB
 * @Description: 立减促销策略
 * @CreateDate: 10:04 2020/2/17
 */

public class LijianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("进行立减促销，立减20元");
    }
}
