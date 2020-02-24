package com.hb.design.pattern.structural.bridge;

/**
 * @Author: HB
 * @Description: 定期账号
 * @CreateDate: 14:21 2020/2/13
 */

public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账号");
    }
}
