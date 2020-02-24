package com.hb.design.pattern.behavioral.interpreter;

/**
 * @Author: HB
 * @Description: 加法解释器
 * @CreateDate: 12:20 2020/2/18
 */

public class AddInterpreter implements Interpreter{
    private Interpreter firstExpression,secondExpression;

    public AddInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret() + secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "+";
    }
}
