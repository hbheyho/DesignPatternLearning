package com.hb.design.pattern;

import com.hb.design.pattern.structural.bridge.*;
import org.junit.Test;

/**
 * @Author: HB
 * @Description: 桥接模式测试类
 * @CreateDate: 14:42 2020/2/13
 */

public class bridge {
    @Test
    public void bridgeTest(){
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        ((Account) icbcAccount).showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();
    }
}
