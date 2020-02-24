package com.hb.design.pattern;

import com.hb.design.pattern.behavioral.strategy.*;
import org.junit.Test;

/**
 * @Author: HB
 * @Description: 策略模式测试
 * @CreateDate: 10:13 2020/2/17
 */

public class strategy {
    @Test
    public void strategyTest(){
        PromotionActivity promotionActivity = new PromotionActivity(new FanxianPromotionStrategy());
        PromotionActivity promotionActivity1 = new PromotionActivity(new ManjianPromotionStrategy());
        PromotionActivity promotionActivity2 = new PromotionActivity(new LijianPromotionStrategy());

        promotionActivity.executePromotionStrategy();
        promotionActivity1.executePromotionStrategy();
        promotionActivity2.executePromotionStrategy();

        // 此时还是免不了使用if..else..语句进行对象的创建判断
        /*
        * PromotionActivity promotionActivity = null;
        * String promotionLey = "LIJIAN";
        * if(StringUtils.equals(promotionKey,"LIJIAN")){
        *   promotionActivity = new PromotionActivity(new LIJIANPromotionStrategy());
        * else if (StringUtils.equals(promotionKey,"MANJIAN")){
        *   promotionActivity = new PromotionActivity(new MANJIANPromotionStrategy());
        * }
        * ......
        * promotionActivity.executePromotionStrategy();
        * */
    }

    @Test
    public void strategyTest2(){
        String promotionKey = "LIJIAN";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
        String promotionKey1 = "MANJIAN";
        PromotionActivity promotionActivity1 = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey1));
        promotionActivity1.executePromotionStrategy();
    }
}
