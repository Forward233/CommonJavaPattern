package com.pattern.description.one;

/**
 * @ClassName: CoffeeBean2
 * @Description: 具体的被装饰者，有自己具体的属性和方法 继承被装饰者接口
 * @author: yhl
 * @date: 2019年1月18日 下午9:14:44
 */
public class CoffeeBean2 implements Beverage {

	@Override
    public String getDescription() {
		return "选了第二种咖啡豆";
	}

	@Override
	public double getPrice() {
		return 100f;
	}

}
