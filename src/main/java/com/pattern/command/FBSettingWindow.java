package com.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: FBSettingWindow
 * @Description: 功能键设置窗口类  
 * @author: yhl
 * @date: 2019年2月28日 上午9:40:23
 */
public class FBSettingWindow {

	/**
	 *	窗口标题  
	 */
	private String title;

	/**
	 *	定义一个ArrayList来存储所有功能键  
	 */
	private List<FunctionButton> functionButtons = new ArrayList<FunctionButton>();

	public FBSettingWindow(String title) {
		this.title = title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void addFunctionButton(FunctionButton button) {
		functionButtons.add(button);
	}

	public void removeFunctionButton(FunctionButton button) {
		functionButtons.remove(button);
	}

	/**
	 * @Description:显示窗口及功能键   
	 * @return: void
	 */
	public void display() {
		System.out.println("显示窗口：" + this.title);
		System.out.println("显示功能键：");
		for (FunctionButton functionButton : functionButtons) {
			System.out.println(functionButton.getName());
		}
		System.out.println("------------------------------");
	}

}
