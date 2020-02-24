package com.hb.design.pattern.behavioral.strategy;

/**
 * @Author: HB
 * @Description: 促销活动类 - 客户端通过促销活动类来调用相应的促销活动接口，以实现解耦
 * @CreateDate: 10:09 2020/2/17
 */

public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }
}
