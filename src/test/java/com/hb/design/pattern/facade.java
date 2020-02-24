package com.hb.design.pattern;

import com.hb.design.pattern.structural.facade.GiftExchangeService;
import com.hb.design.pattern.structural.facade.PointsGift;
import org.junit.Test;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  18:32  2020/1/28.
 */
public class facade {
    @Test
    public void facedeTest(){
        PointsGift pointsGift = new PointsGift("手机");
        GiftExchangeService giftExchangeService = new GiftExchangeService();

        giftExchangeService.giftExchange(pointsGift);
    }
}
