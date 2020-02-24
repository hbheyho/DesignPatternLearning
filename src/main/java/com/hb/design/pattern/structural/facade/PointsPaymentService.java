package com.hb.design.pattern.structural.facade;

/**
 * @Author:HB
 * @Description: 积分兑换系统中积分支付子系统
 * @Createdata:Created in  18:18  2020/1/28.
 */
public class PointsPaymentService {
    public boolean Pay(PointsGift pointsGift){
        // TODO: 2020/1/28 扣减积分
        System.out.println("支付" + pointsGift.getGiftName() + "积分成功");
        return true;
    }
}
