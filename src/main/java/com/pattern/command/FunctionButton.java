package com.pattern.command;

/**
 * @ClassName: FunctionButton
 * @Description: 功能键类：请求发送者  
 * @author: yhl
 * @date: 2019年2月28日 上午9:42:28
 */
public class FunctionButton {
	
	/**
	 *功能键名称  
	 */
	private String name;
	/**
	 *维持一个抽象命令对象的引用  
	 */
	private Command command;
	
	public FunctionButton(String name) {
		this.name = name;
	}
	
	/**
	 * @Description: 为功能键注入命令  
	 * @param name
	 * @return: void
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	/**
	 * @Description: 发送请求的方法  
	 * @return: void
	 */
	public void onClick() {
		 System.out.print("点击功能键：");  
		 command.execute();
	}

}
