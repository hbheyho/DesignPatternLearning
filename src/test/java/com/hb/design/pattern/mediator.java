package com.hb.design.pattern;

import com.hb.design.pattern.behavioral.mediator.User;
import com.hb.design.pattern.behavioral.mediator.mediatorextend.*;
import org.junit.Test;

/**
 * @Author: HB
 * @Description: 中介者模式测试类
 * @CreateDate: 10:55 2020/2/22
 */

public class mediator  {
    @Test
    public void mediatorTest1(){
        User HB = new User("HB");
        User QIU = new User("QIU");

        HB.sendMessage("大家好，我是HB");
        QIU.sendMessage("你好");
    }

    @Test
    public void mediatorTest2(){
        Mediator concreteMediator = new ConcreteMediator();
        Colleague concreteColleague1 = new ConcreteColleague1();
        Colleague concreteColleague2 = new ConcreteColleague2();
        Colleague concreteColleague3 = new ConcreteColleague3();

        concreteMediator.register(concreteColleague1);
        concreteMediator.register(concreteColleague2);
        concreteMediator.register(concreteColleague3);
        concreteColleague1.send();
    }
}
