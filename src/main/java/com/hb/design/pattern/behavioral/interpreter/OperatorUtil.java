package com.hb.design.pattern.behavioral.interpreter;

/**
 * @Author: HB
 * @Description: 操作工具类
 * @CreateDate: 12:34 2020/2/18
 */

public class OperatorUtil {
    // 判断是否时操作符
    public static boolean isOperator(String symbol){
        return (symbol.equals("+") || symbol.equals("*"));
    }

    // 返回解释对象
    public static Interpreter getExpressionObject(Interpreter firstExpression,
                                                  Interpreter secondExpreesion,String symbol){
        if (symbol.equals("+")){
            return new AddInterpreter(firstExpression,secondExpreesion);
        }else if (symbol.equals("*")){
            return new MultiInterpreter(firstExpression,secondExpreesion);
        }
        return null;
    }
}
