package com.hb.design.pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:HB
 * @Description: 容器单例模式 - 应用场景是 可能需要使用到多个单例，使用Map存储
 * @Createdata:Created in  18:56  2020/1/13.
 */
public class ContainerSingleton {
    private ContainerSingleton(){
    }
    private static Map<String,Object> singletonMap = new HashMap<String,Object>();

    public static void putInstance(String key, Object object){
        if (key.length() != 0 && object != null){
            if (!singletonMap.containsKey(key)){
                singletonMap.put(key,object);
            }
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }

}
