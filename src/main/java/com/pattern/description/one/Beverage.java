package com.pattern.description.one;

/**
 * @ClassName: Beverage
 * @Description: 被装饰者接口，定义被装饰者有意义的一些行为
 * 				  如获取饮料的名字，获取饮料的价格
 * @author: yhl
 * @date: 2019年1月18日 下午8:57:39
 */
public interface Beverage {
	/**
	 * @Description: 获取商品描述
	 * @return: String
	 */
	String getDescription();
	/**
	 * @Description: 获取商品价格
	 * @return: double
	 */
	double getPrice();
	
}
