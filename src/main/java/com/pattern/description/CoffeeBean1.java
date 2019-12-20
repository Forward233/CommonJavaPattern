package com.pattern.description;

/**
 * @ClassName: CoffeeBean1
 * @Description: 具体的被装饰者
 * @author: yhl
 * @date: 2019年1月18日 下午9:14:31
 */
public class CoffeeBean1 implements Beverage{


	public String getDescription() {
		return "选了第一种咖啡豆";
	}

	public double getPrice() {
		return 50f;
	}
	
}
