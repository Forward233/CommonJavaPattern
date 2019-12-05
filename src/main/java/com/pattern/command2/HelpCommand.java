package com.pattern.command2;

/**
 * @author yhl
 * @Title: HelpCommand
 * @Description: TODO
 * @date 2019/6/24/024 23:34
 */
public class HelpCommand implements Command {

    HelpReceiver helpReceiver;

    HelpCommand(HelpReceiver receiver) {
        this.helpReceiver = receiver;
    }

    @Override
    public void execute() {
        helpReceiver.help();
    }
}
