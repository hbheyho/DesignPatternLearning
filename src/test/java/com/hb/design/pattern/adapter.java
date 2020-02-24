package com.hb.design.pattern;

/*import com.hb.design.pattern.adapter.classadapter.Adapter;
import com.hb.design.pattern.adapter.classadapter.ConcreteTarget;
import com.hb.design.pattern.adapter.classadapter.Target;*/
import com.hb.design.pattern.structural.adapter.objectadapter.Adapter;
import com.hb.design.pattern.structural.adapter.objectadapter.ConcreteTarget;
import com.hb.design.pattern.structural.adapter.objectadapter.Target;
import org.junit.Test;

/**
 * @Author: HB
 * @Description: 适配器模式测试类
 * @CreateDate: 18:22 2020/2/6
 */

public class adapter {
    /*@Test  类适配器
    public void classAdapterTest(){
        // Target的直接实现方法
        Target target = new ConcreteTarget();
        target.request();

        // 被适配者方法
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }*/

    // 对象适配器
    @Test
    public void objectAdapterTest(){
        // Target的直接实现方法
        Target target = new ConcreteTarget();
        target.request();

        // 被适配者方法
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
