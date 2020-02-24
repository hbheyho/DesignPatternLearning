package com.hb.design.pattern.structural.bridge;

/**
 * @Author: HB
 * @Description: 银行抽象类
 * @CreateDate: 14:25 2020/2/13
 */

public abstract class Bank {
    public Account account;
    public Bank(Account account) {
        this.account = account;
    }
    public abstract Account openAccount();
}
