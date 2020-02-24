package com.hb.design.pattern.behavioral.mediator.mediatorextend;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HB
 * @Description: 具体中介者
 * @CreateDate: 11:23 2020/2/22
 */

public class ConcreteMediator extends Mediator {
    List<Colleague> colleagueList = new ArrayList<Colleague>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagueList.contains(colleague)){
            colleagueList.add(colleague);
            // 为相应对象设置中介者
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague cl) {
        for (Colleague ob : colleagueList){
            if (!ob.equals(cl)){
                ((Colleague)ob).receive();
            }
        }
    }
}
