package com.hb.design.pattern.structural.bridge;

/**
 * @Author: HB
 * @Description: 中国农业银行
 * @CreateDate: 14:30 2020/2/13
 */

public class ABCBank  extends Bank{
    public ABCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("打开中国农业银行账号");
        account.openAccount();
        return account;
    }
}
