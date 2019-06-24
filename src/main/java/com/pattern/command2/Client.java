package com.pattern.command2;

/**
 * @author yhl
 * @Title: Client
 * @Description: TODO
 * @date 2019/6/24/024 23:38
 */
public class Client {

    public static void main(String[] args) {

        HelpReceiver helpReceiver = new HelpReceiver();
        Command command = new HelpCommand(helpReceiver);
        Invoker invoker = new Invoker(command);
        invoker.execute();
    }
}
