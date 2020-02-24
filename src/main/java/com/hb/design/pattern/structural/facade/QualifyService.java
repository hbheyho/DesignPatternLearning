package com.hb.design.pattern.structural.facade;

/**
 * @Author:HB
 * @Description: 积分兑换系统中资格验证子系统
 * @Createdata:Created in  18:15  2020/1/28.
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("检验" + pointsGift.getGiftName() + "积分资格通过! 库存通过!");
        return true;
    }
}
