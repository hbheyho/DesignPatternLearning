package com.hb.design.pattern.behavioral.strategy;

/**
 * @Author: HB
 * @Description: 返现促销策略
 * @CreateDate: 10:06 2020/2/17
 */

public class FanxianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("进行返现促销，满200返现200");
    }
}
