package com.pattern.command;

/**
 * @ClassName: HelpCommand
 * @Description: 命令执行方法，将调用请求接收者的业务方法  
 * @author: yhl
 * @date: 2019年2月28日 上午9:42:02
 */
public class HelpCommand extends Command{

	/**
	 *维持对请求接收者的引用  
	 */
	private HelpHandler hhObj;
	
	public HelpCommand() {  
        hhObj = new HelpHandler();  
    }  
	
	@Override
	void execute() {
		 hhObj.display();  
	}
	
	

}
