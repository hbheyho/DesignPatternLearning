package com.hb.design.pattern.structural.bridge;

/**
 * @Author: HB
 * @Description: 中国工商银行
 * @CreateDate: 14:31 2020/2/13
 */

public class ICBCBank  extends Bank{
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    public Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}
