package com.hb.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: HB
 * @Description: 促销策略工厂
 * @CreateDate: 10:41 2020/2/17
 */

public class PromotionStrategyFactory {
    // JDK 1.5之前使用接口常量
    /*public interface PromotionKey{
        String LIJIAN = "LIJIAN";
        String MANJIAN = "MANJIAN";
        String FANXIAN = "FANXIAN";
    }*/
    // 采用枚举类型
    private enum PromotionKey{
         LIJIAN("LIJIAN"),MANJIAN("MANJIAN"),FANXIAN("FANXIAN");
         String StringName;
        PromotionKey(String stringName) {
            StringName = stringName;
        }
    }
    private static final PromotionStrategy EMPTY_PROMOTION = new EmptyPromotionStrategy();

    private static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<String,PromotionStrategy>();
    // 类记载的时候就把PROMOTION_STRATEGY_MAP进行填充，也可使用享元模式进行动态填充
    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN.StringName,new ManjianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN.StringName,new LijianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN.StringName,new FanxianPromotionStrategy());
    }

    private PromotionStrategyFactory() {
    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ?  EMPTY_PROMOTION: promotionStrategy;
    }
}
