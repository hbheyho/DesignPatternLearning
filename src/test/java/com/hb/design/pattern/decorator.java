package com.hb.design.pattern;

// import com.hb.design.pattern.decorator.V1.Battercake;
import com.hb.design.pattern.structural.decorator.V1.BattercakeWithEgg;
import com.hb.design.pattern.structural.decorator.V1.BattercakeWithEggAndSausage;
import com.hb.design.pattern.structural.decorator.V2.ABattercake;
import com.hb.design.pattern.structural.decorator.V2.Battercake;
import com.hb.design.pattern.structural.decorator.V2.EggDecorator;
import com.hb.design.pattern.structural.decorator.V2.SausageDecorator;
import org.junit.Test;

/**
 * @Author: HB
 * @Description: 装饰者模式
 * @CreateDate: 13:13 2020/2/4
 */

public class decorator {

    // 普通继承(..v1.Battercake注释-冲突问题)
    @Test
    public void decoratorTestV1(){
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + "价格:" + battercake.cost());

        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc() + "价格:" + battercakeWithEgg.cost());

        BattercakeWithEggAndSausage battercakeWithEggAndSausage = new BattercakeWithEggAndSausage();
        System.out.println(battercakeWithEggAndSausage.getDesc() + "价格:" + battercakeWithEggAndSausage.cost());
    }

    // 装饰者模式
    @Test
    public void decoratorTestV2(){
        ABattercake aBattercake;
        aBattercake = new Battercake();  // 创建需要被装饰的实体类
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc() + "价格:" + aBattercake.cost());
    }
}
