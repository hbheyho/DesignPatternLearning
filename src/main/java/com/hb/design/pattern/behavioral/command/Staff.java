package com.hb.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HB
 * @Description: 命令执行者
 * @CreateDate: 11:26 2020/2/21
 */

public class Staff {
    List<Command> commandList = new ArrayList<Command>();

    public void addCommand(Command command){
        commandList.add(command);
    }

    public void executeCommand(){
        for (Command command : commandList){
            command.execute();
        }
        commandList.clear();
    }

}
