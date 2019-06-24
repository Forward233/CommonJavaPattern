package com.pattern.command2;

/**
 * @author yhl
 * @Title: ExitCommand
 * @Description: TODO
 * @date 2019/6/24/024 23:31
 */
public class ExitCommand implements Command {

    ExitReceiver exitReceiver;

    ExitCommand(ExitReceiver receiver) {
        this.exitReceiver = receiver;
    }

    @Override
    public void execute() {
        exitReceiver.exit();
    }
}
