package com.hb.design.pattern.structural.facade;

/**
 * @Author:HB
 * @Description: 积分礼物实体类
 * @Createdata:Created in  18:14  2020/1/28.
 */
public class PointsGift {
    private String giftName;

    public PointsGift(String giftName) {
        this.giftName = giftName;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }
}
