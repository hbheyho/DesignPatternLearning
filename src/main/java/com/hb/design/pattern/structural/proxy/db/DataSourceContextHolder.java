package com.hb.design.pattern.structural.proxy.db;

/**
 * @Author: HB
 * @Description:
 * @CreateDate: 11:50 2020/2/12
 */

public class DataSourceContextHolder  {
    private static final ThreadLocal<String> CONTEXT_HOLDER = new ThreadLocal<String>();

    public static void setDBType(String DBType){
        CONTEXT_HOLDER.set(DBType);
    }

    public static String getDBType(){
        return (String)CONTEXT_HOLDER.get();
    }

    public static void removeDBType(){
        CONTEXT_HOLDER.remove();
    }
}
