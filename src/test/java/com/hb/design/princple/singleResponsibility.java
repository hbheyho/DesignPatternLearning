package com.hb.design.princple;

import com.hb.design.principle.singleresponsibility.FlyBird;
import com.hb.design.principle.singleresponsibility.WalkBird;
import org.junit.Test;

/**
 * @Author:HB
 * @Description:
 * @Createdata:Created in  10:57  2020/1/7.
 */
public class singleResponsibility {
    @Test
    public void birdActivity(){
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");
        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }

}
