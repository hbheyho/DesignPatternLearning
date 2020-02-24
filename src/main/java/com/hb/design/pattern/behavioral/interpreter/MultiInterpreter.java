package com.hb.design.pattern.behavioral.interpreter;

/**
 * @Author: HB
 * @Description: 乘法解释器
 * @CreateDate: 12:25 2020/2/18
 */

public class MultiInterpreter implements Interpreter {
    private Interpreter firstExpression,secondExpression;

    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpret() {
        return this.firstExpression.interpret() * secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "*";
    }
}
