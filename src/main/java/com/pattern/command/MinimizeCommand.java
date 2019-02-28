package com.pattern.command;

public class MinimizeCommand extends Command {
	/**
	 *	维持对请求接收者的引用  
	 */
	private WindowHanlder whObj; // 维持对请求接收者的引用

	public MinimizeCommand() {
		whObj = new WindowHanlder();
	}

	/**
	 * @Title: execute
	 * @Description: 命令执行方法，将调用请求接收者的业务方法  
	 */
	@Override
	public void execute() {
		whObj.minimize();
	}
}
