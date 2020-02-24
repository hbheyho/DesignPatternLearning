package com.hb.design.pattern.behavioral.interpreter;

import java.util.Stack;

/**
 * @Author: HB
 * @Description: 表达式解释器
 * @CreateDate: 12:31 2020/2/18
 */

public class HBExpressionParser {
    private Stack<Interpreter> stack = new Stack<Interpreter>();

    public int parse(String str){
        String[] strItemArray = str.split(" ");
        for (String symbol : strItemArray){
            if (!OperatorUtil.isOperator(symbol)){
                Interpreter numberExpression = new NumberInterpreter(symbol);
                stack.push(numberExpression);
                System.out.println(String.format("入栈: %d",numberExpression.interpret()));
            }else{
                // 是运算符号就进行计算
                Interpreter fistExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.println(String.format("出栈：%d, %d",fistExpression.interpret(),secondExpression.interpret()));
                Interpreter operator = OperatorUtil.getExpressionObject(fistExpression,secondExpression,symbol);
                System.out.println(String.format("应用运算符: %s",symbol));
                int result = operator.interpret();
                // 结果入栈
                NumberInterpreter resultExpression = new NumberInterpreter(result);
                stack.push(resultExpression);
                System.out.println(String.format("阶段结果入栈: %d",result));
            }
        }
        int result = stack.pop().interpret();
        return result;
    }
}
