package com.hb.design.pattern.structural.bridge;

/**
 * @Author: HB
 * @Description: 货期账号
 * @CreateDate: 14:22 2020/2/13
 */

public class SavingAccount  implements Account{

    @Override
    public Account openAccount() {
        System.out.println("打开定期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账号");
    }
}
