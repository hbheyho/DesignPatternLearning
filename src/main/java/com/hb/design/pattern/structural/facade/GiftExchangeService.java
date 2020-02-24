package com.hb.design.pattern.structural.facade;

/**
 * @Author:HB
 * @Description: 积分礼物兑换逻辑 - 外观类
 * @Createdata:Created in  18:25  2020/1/28.
 */
public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    // 对外提供礼物兑换接口
    public void giftExchange(PointsGift pointsGift){
        if (qualifyService.isAvailable(pointsGift)){
            // 资格校验通过
            if (pointsPaymentService.Pay(pointsGift)){
                // 积分扣减成功
                String shipNum = shippingService.shipGift(pointsGift);
                System.out.println("礼物订单号是:" + shipNum);
            }
        }
    }
}
