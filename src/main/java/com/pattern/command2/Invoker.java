package com.pattern.command2;

/**
 * @author yhl
 * @Title: Invoker
 * @Description: TODO
 * @date 2019/6/24/024 23:36
 */
public class Invoker {

    Command command;

    Invoker(Command command) {
        this.command = command;
    }

    void execute() {
        command.execute();
    }

}
