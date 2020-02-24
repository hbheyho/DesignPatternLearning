package com.hb.design.pattern.structural.proxy;

/**
 * @Author: HB
 * @Description: 订单类
 * @CreateDate: 11:05 2020/2/12
 */

public class Order {
    private Object orderInfo;
    private Integer userId;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
