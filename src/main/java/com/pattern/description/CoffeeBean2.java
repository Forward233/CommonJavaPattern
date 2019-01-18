package com.pattern.description;

/**
 * @ClassName: CoffeeBean2
 * @Description: 具体的被装饰者，有自己具体的属性和方法 继承被装饰者接口
 * @author: yhl
 * @date: 2019年1月18日 下午9:14:44
 */
public class CoffeeBean2 implements Beverage {

	private String description = "选了第二种咖啡豆";

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return 100f;
	}

}
