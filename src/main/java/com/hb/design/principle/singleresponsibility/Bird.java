package com.hb.design.principle.singleresponsibility;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  10:51  2020/1/7.
 */
public class Bird {
    public void mainMoveMode(String birdName){
        // 不符合单一职责原则，因为该类负责了两个职责（鸵鸟和大雁），每个职责的变更都会引起该类的变化
        if ("鸵鸟".equals(birdName)){
            System.out.println(birdName + "用脚走...");
        }else{
            System.out.println(birdName + "用翅膀飞...");
        }
    }
}
