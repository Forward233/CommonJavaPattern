package com.pattern.description;

/**
 * @ClassName: Decorator
 * @Description: 装饰器，继承装饰角色
 * @author: yhl
 * @date: 2019年1月18日 下午9:12:24
 */
public class Decorator implements Beverage{

	public String getDescription() {
		return "我只是装饰器，不知道具体的描述";

	}

	public double getPrice() {
		return 0;	
	}

}
