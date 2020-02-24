package com.hb.design.pattern.behavioral.interpreter;

/**
 * @Author: HB
 * @Description: 数字解释器
 * @CreateDate: 12:27 2020/2/18
 */

public class NumberInterpreter implements Interpreter {
    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }
    public NumberInterpreter(String number){
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
