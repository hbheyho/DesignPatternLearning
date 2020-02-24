package com.hb.design.pattern.structural.facade;

/**
 * @Author:HB
 * @Description: 积分兑换系统中物流子系统
 * @Createdata:Created in  18:20  2020/1/28.
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift){
        // TODO: 2020/1/28 物流对接
        System.out.println(pointsGift.getGiftName() + "进入物流系统");
        String shipNum = "666";
        return shipNum;
    }
}
