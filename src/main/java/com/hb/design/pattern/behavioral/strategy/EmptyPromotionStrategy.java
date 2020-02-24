package com.hb.design.pattern.behavioral.strategy;

/**
 * @Author: HB
 * @Description: 空策略 - 无促销活动
 * @CreateDate: 10:48 2020/2/17
 */

public class EmptyPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("暂无促销活动");
    }
}
