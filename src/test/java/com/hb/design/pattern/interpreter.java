package com.hb.design.pattern;

import com.hb.design.pattern.behavioral.interpreter.HBExpressionParser;
import org.junit.Test;

/**
 * @Author: HB
 * @Description: 解释器模式测试
 * @CreateDate: 12:17 2020/2/18
 */

public class interpreter {
    @Test
    public void interpreterTest(){
        String strInput = "6 100 11 + *";
        HBExpressionParser hbExpressionParser = new HBExpressionParser();
        int result = hbExpressionParser.parse(strInput);
        System.out.println("解释器最终结果：" + result);
    }
}


