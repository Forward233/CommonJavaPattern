package com.pattern.description;

/**
 * @ClassName: Beverage
 * @Description: 饮料接口 
 * @author: yhl
 * @date: 2019年1月18日 下午8:57:39
 */
public interface Beverage {
	/**
	 * @Description: 获取商品描述
	 * @return: String
	 */
	public String getDescription();
	/**
	 * @Description: 获取商品价格
	 * @return: double
	 */
	public double getPrice();
	
}
